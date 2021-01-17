package page_objects;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HomePage extends DriverManager{



    public void doSearch(String item)
    {
        openBrowser();
        WebElement searchTextBox = driver.findElement(By.id("searchTerm"));
        searchTextBox.sendKeys(item);
        searchTextBox.sendKeys(Keys.ENTER);
        sleep(3000);
    }

    public String getCurrentUrl()

    {
        return driver.getCurrentUrl();

    }

    public String getHeader()
    {
        return driver.getTitle();
    }

}
