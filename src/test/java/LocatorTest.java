import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LocatorTest extends BaseTest {
    private static final By passwordInputById = By.id("password");
    private static final By passwordInputByName = By.name("password");
    private static final By passwordInputByClass = By.className("form_input");
    private static final By passwordInputByTag = By.tagName("input");
    private static final By passwordInputByXpathTag = By.xpath("//input[@id='password']");
    private static final By passwordInputByXpathContains = By.xpath("//input[contains(@type, 'pass')]");
    private static final By passwordInputByXpathAncestor
            = By.xpath("//input[@id='password']//ancestor::div");
    private static final By passwordInputByXpathDescendant
            = By.xpath("//form//descendant::input[@name='password']");
    private static final By passwordInputByXpathFollowing
            = By.xpath("//input[@id='password']/following-sibling::button[1]");
    private static final By passwordInputByXpathParent
            = By.xpath("//input[@id='password']/parent::div");
    private static final By passwordInputByXpathPreceding
            = By.xpath("//input[@id='password']/preceding::*");
    private static final By passwordInputByXpathAnd
            = By.xpath("//input[@id='password' and contains(@type, 'pass')]");
    private static final By passwordInputByCssClass1 = By.cssSelector(".input_error");
    private static final By passwordInputByCssClass1Class2 = By.cssSelector(".input_error.form_input");
    private static final By passwordInputByCssId = By.cssSelector("#password");
    private static final By passwordInputByCssTageName = By.cssSelector("input");
    private static final By passwordInputByCssTagNameClass = By.cssSelector("input.input_error");
    private static final By passwordInputByCssAttributeValue = By.cssSelector("input[placeholder = 'Password']");
    private static final By passwordInputByCssAttributeValueСontaining
            = By.cssSelector("input[class~='input_error']");
    private static final By passwordInputByCssAttributeValueEqual = By.cssSelector("input[id|='pass']");
    private static final By passwordInputByCssAttributeValueBegins = By.cssSelector("input[id^='pass']");
    private static final By passwordInputByCssAttributeValueEnds = By.cssSelector("input[id$='ord']");
    private static final By passwordInputByCssAttributeValueSubstring = By.cssSelector("input[data-test*='pass']");

    @Test
    void testLocatorById() {
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputById).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByName() {
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByName).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByClass() {
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByClass).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByTag() {
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByTag).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByXpathTag() {
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByXpathTag).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByXpathContains() {
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByXpathContains).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByXpathAncestor() {
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByXpathAncestor).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByXpathDescendant() {
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByXpathDescendant).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByXpathFollowing() {
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByXpathFollowing).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByXpathParent() {
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByXpathParent).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByXpathPreceding() {
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByXpathPreceding).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByXpathAnd(){
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByXpathAnd).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByCssClass1(){
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByCssClass1).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByCssClass1Class2(){
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByCssClass1Class2).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByCssId(){
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByCssId).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByCssTageName(){
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByCssTageName).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByCssTageNameClass(){
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByCssTagNameClass).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByCssAttributeValue(){
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByCssAttributeValue).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByCssAttributeValueСontaining(){
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByCssAttributeValueСontaining).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByCssAttributeValueEqual(){
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByCssAttributeValueEqual).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByCssAttributeValueBegins(){
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByCssAttributeValueBegins).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByCssAttributeValueEnds(){
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByCssAttributeValueEnds).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }

    @Test
    void testLocatorByCssAttributeValueSubstring(){
        driver.get("https://www.saucedemo.com/");
        boolean isPasswordInputDisplayed = driver.findElement(passwordInputByCssAttributeValueSubstring).isDisplayed();

        assertTrue(isPasswordInputDisplayed, "password input is not displayed");
    }
}
