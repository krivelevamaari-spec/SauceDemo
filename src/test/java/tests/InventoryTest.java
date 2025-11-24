package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class InventoryTest extends BaseTest{

    @Test
    void correctNumberProductCards(){
        authorizationPage.OpenPage();
        authorizationPage.loginEntry("standard_user");
        authorizationPage.passwordEntry("secret_sauce");
        authorizationPage.clickLoginButton();
        inventoryPage.pageIsOpen();
        inventoryPage.GetTotalProductCardsOnPage();

        assertEquals(inventoryPage.GetTotalProductCardsOnPage(),
                6,"количество карточек товара не соответствует ожидаемому");
    }

    @Test
    void burgerMenuOpenButtonIsActive(){
        authorizationPage.OpenPage();
        authorizationPage.loginEntry("standard_user");
        authorizationPage.passwordEntry("secret_sauce");
        authorizationPage.clickLoginButton();
        inventoryPage.pageIsOpen();
        inventoryPage.openBurgerMenu();

        assertTrue(inventoryPage.burgerMenuIsOpen(),"Кнопка меню не активна");
    }

    @Test
    void burgerMenuCloseButtonIsActive(){
        authorizationPage.OpenPage();
        authorizationPage.loginEntry("standard_user");
        authorizationPage.passwordEntry("secret_sauce");
        authorizationPage.clickLoginButton();
        inventoryPage.pageIsOpen();
        inventoryPage.openBurgerMenu();
        inventoryPage.closeBurgerMenu();

        assertTrue(inventoryPage.burgerMenuIsClose(),"Кнопка закрытия не активна ");
    }

    @Test
    void cartLinkIsActive(){
        authorizationPage.OpenPage();
        authorizationPage.loginEntry("standard_user");
        authorizationPage.passwordEntry("secret_sauce");
        authorizationPage.clickLoginButton();
        inventoryPage.pageIsOpen();
        inventoryPage.openCartLink();

        assertTrue(inventoryPage.cartLinkIsOpen(), "Ссылка не загрузилась");
    }
}
