package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class InventoryPage extends BasePage{

    private static final By TITLE = By.xpath("//span[@data-test='title' and text()='Products']");
    private static final By CART_TITLE = By.xpath("//span[@data-test='title' and text()='Your Cart']");

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public void openPage(){
        driver.get(BASE_URL + "/inventory.html");
    }

    public boolean pageIsOpen(){
        return driver.findElement(TITLE).isDisplayed();
    }

    public int GetTotalProductCardsOnPage(){
        List<WebElement> productCards = driver.findElements(By.cssSelector(".inventory_item"));
        return productCards.size();
    }

    public void openBurgerMenu(){
        driver.findElement(By.id("react-burger-menu-btn")).click();
    }

    public void closeBurgerMenu(){
        driver.findElement(By.xpath("//div[@class='bm-cross-button']")).click();
    }

    public boolean burgerMenuIsOpen(){
        return driver.findElement(By.xpath("//div[@class='bm-menu']")).isDisplayed();
    }

    public boolean burgerMenuIsClose(){
        return driver.findElement(By.id("react-burger-menu-btn")).isDisplayed();
    }

    public void openCartLink(){
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
    }

    public boolean cartLinkIsOpen(){
        return driver.findElement(CART_TITLE).isDisplayed();
    }
}
