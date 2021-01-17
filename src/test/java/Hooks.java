import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hooks {

    private DriverManager driverManager=new DriverManager();

  @Before
    public void setUp()
    {
        driverManager.openBrowser();

    }

    @After
    public void tearDown()
    {
        driverManager.closeBrowser();

    }

















}
