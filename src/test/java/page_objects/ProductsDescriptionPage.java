package page_objects;

import driver.DriverManager;
import org.openqa.selenium.By;

public class ProductsDescriptionPage extends DriverManager {

    public void addToTrolley()
    {
        driver.findElement((By.cssSelector(".add-to-trolley-main"))).click();
        sleep(7000);

    }

    public void goToTrolley()
    {

        driver.findElement((By.linkText("Go to Trolley")));
    }
}
