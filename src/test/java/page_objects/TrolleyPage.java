package page_objects;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class TrolleyPage extends DriverManager {

    public List<String> getProductsInTrolley()
    {
        List<String> allProductsIntrolley=new ArrayList<>();
        List<WebElement> productInTrolley=driver.findElements(By.className("productCard_titleLink_1Pgaz"));
        //for(datatype variable:array){}
        for (WebElement webElement:productInTrolley)
        {
            String product=webElement.getText();
            allProductsIntrolley.add(product);

        }
        return allProductsIntrolley;
    }

    public double getPriceFromBasket()
    {
        String priceInString=driver.findElement(By.cssSelector("span[data-e2e='product-line-price']")).getText().replace("£","");
        double priceInDouble =Double.parseDouble(priceInString);
        return priceInDouble;
    }

    public void selectQuantity()
    {
        //actual
        new Select(driver.findElement(By.cssSelector("span[data-e2e='product-line-price'])"))).selectByVisibleText("3");
        //new Select(driver.findElement(By.cssSelector("span[data-e2e='product-line-price'])"))).selectByIndex(2);
        // new Select(driver.findElement(By.cssSelector("span[data-e2e='product-line-price'])"))).selectByValue("3");
        sleep(4000);
    }
}
