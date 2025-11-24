package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthorizationPage extends BasePage{

    private static final By LOGIN_ENTRY = By.id("user-name");
    private static final By PASSWORD_ENTRY = By.id("password");
    private static final By LOGIN_BUTTON = By.id("login-button");
    private static final By ERROR_MESSAGE = By.xpath("//h3[@data-test = 'error']");

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }

    public void OpenPage(){
        driver.get(BASE_URL);
    }

    public void loginEntry(String username){
        driver.findElement(LOGIN_ENTRY).sendKeys(username);
    }

    public void passwordEntry(String password){
        driver.findElement(PASSWORD_ENTRY).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(LOGIN_BUTTON).click();
    }

    public String getErrorMessage(){
        return driver.findElement(ERROR_MESSAGE).getText();
    }
}
