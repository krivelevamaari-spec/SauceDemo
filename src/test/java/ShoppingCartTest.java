import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ShoppingCartTest extends BaseTest{

    @Test
    void CheckingShoppingCartTest(){
        driver.get("https://www.saucedemo.com/");
        WebElement userNameInput = driver.findElement(By.cssSelector("#user-name"));
        userNameInput.sendKeys("standard_user");
        WebElement passwordInput = driver.findElement(By.cssSelector("#password"));
        passwordInput.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.cssSelector("#login-button"));
        loginButton.click();
        WebElement addButton = driver.findElement(By.cssSelector("button[id|='add']"));
        addButton.click();
        WebElement cartButton = driver.findElement(By.cssSelector(".shopping_cart_link"));
        cartButton.click();
        WebElement produckt = driver.findElement(By.cssSelector(".inventory_item_name"));
        boolean isProducktDisplayed = produckt.isDisplayed();

        assertTrue(isProducktDisplayed, "error message: product not found");

        WebElement price = driver.findElement(By.cssSelector(".inventory_item_price"));
        boolean isPriceDisplayed = price.isDisplayed();

        assertTrue(isPriceDisplayed);

        assertEquals(isPriceDisplayed, 29.99);
    }
}
