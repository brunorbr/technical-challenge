package tests;

import org.junit.jupiter.api.Test;
import pageobjects.HomePage;
import pageobjects.ShopPage;
import pageobjects.utils.BrowserManager;

import java.io.IOException;

public class ShoppingTest {

    public HomePage home;
    private ShopPage shop;


    @Test
    public void login() throws IOException {
        home = new HomePage(new BrowserManager().selectBrowser());
        shop = home.performLogin();
    }

}
