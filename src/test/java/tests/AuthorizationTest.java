package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AuthorizationTest extends BaseTest {

    @Test
    void userMustLogInSiteWithValidLoginAndPassword(){
        authorizationPage.OpenPage();
        authorizationPage.loginEntry("standard_user");
        authorizationPage.passwordEntry("secret_sauce");
        authorizationPage.clickLoginButton();
        inventoryPage.pageIsOpen();

        assertTrue(inventoryPage.pageIsOpen(), "Веб-страница не отвечает");
    }

    @Test
    void InputLoginIsRequired(){
        authorizationPage.OpenPage();
        authorizationPage.passwordEntry("secret_sauce");
        authorizationPage.clickLoginButton();

        assertEquals(authorizationPage.getErrorMessage(),
                "Epic sadface: Username is required", "Текст сообщения не соответствует ожидаемому");
    }

    @Test
    void InputPasswordIsRequired(){
        authorizationPage.OpenPage();
        authorizationPage.loginEntry("standard_user");
        authorizationPage.clickLoginButton();

        assertEquals(authorizationPage.getErrorMessage(),
                "Epic sadface: Password is required", "Текст сообщения не соответствует ожидаемому");

    }
}
