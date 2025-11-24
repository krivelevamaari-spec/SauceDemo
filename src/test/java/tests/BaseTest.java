package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.AuthorizationPage;
import pages.InventoryPage;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class BaseTest {
    WebDriver driver;
    AuthorizationPage authorizationPage;
    InventoryPage inventoryPage;

    @BeforeMethod
    public void setting(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--lang=ru");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.of(5, ChronoUnit.SECONDS));

        authorizationPage = new AuthorizationPage(driver);
        inventoryPage = new InventoryPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void completion(){
        driver.quit();
    }
}

