package page_objects;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager{

    @FindBy(id = "searchTerm")
    private WebElement searchTextBox;

    @FindBy(id="consent_prompt_submit")
    private WebElement consentButton;
    public void doSearch(String item)
    {
        consentButton.click();
        //driver.findElement(By.id("consent_prompt_submit")).click();
        //WebElement searchTextBox = driver.findElement(By.id("searchTerm"));
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
