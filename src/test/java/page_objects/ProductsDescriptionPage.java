package page_objects;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsDescriptionPage extends DriverManager {

   @FindBy(css = ".add-to-trolley-main")
    private WebElement addtoTrolleyButton;


    @FindBy(linkText = "Go to Trolley")
    private WebElement gotoTrolleyButton;

    public void addToTrolley()
    {
        addtoTrolleyButton.click();
        //driver.findElement((By.cssSelector(".add-to-trolley-main"))).click();
        sleep(7000);

    }

    public void goToTrolley()
    {
        gotoTrolleyButton.click();
       // driver.findElement((By.linkText("Go to Trolley"))).click();

    }
}
