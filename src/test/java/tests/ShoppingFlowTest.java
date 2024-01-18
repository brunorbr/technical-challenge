package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.*;
import pageobjects.utils.BrowserManager;
import pageobjects.utils.PropReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingFlowTest {

    public HomePage home;
    private ShopPage shop;
    private WebDriver browser;
    private CartPage cart;
    private CheckoutPage checkout;
    private PaymentPage payment;
    private PropReader prop;

    @BeforeEach
    public void setUp() throws IOException {
        this.browser = new BrowserManager().selectBrowser();
        home = new HomePage(browser);
        shop = home.performLogin();
    }

    @Test
    @DisplayName("Validate if the t-shirt on the payment page has an 8% tax increase on the price")
    public void validateCorrectTax() throws IOException {
        shop.addtShirtToCart();
        cart = shop.clickOnCartButton();
        checkout = cart.proceedToCheckout();
        payment = checkout.inputUserData();
        assertEquals(getAmountWithTaxes(),payment.getTotalAmount());
    }
    @Test
    @DisplayName("Validate if the user can add a backpack to the cart from the remove that product from the cart later")
    public void validateAddAndRemoveProductsTest() {
        shop.addBackpackToCart();
        shop.removeBackPackFromCart();
        assertEquals(true, shop.getBackpackAddButton().isDisplayed());
    }

    @AfterEach
    public void tearDown(){
        browser.quit();
    }

    public BigDecimal getValue(){
        prop = new PropReader("./test.properties");
        return new BigDecimal(prop.getTshirtBaseValue());
    }

    public String getAmountWithTaxes() throws IOException {
        BigDecimal amountWithTaxes = getValue().multiply(new BigDecimal(1.08));
        return amountWithTaxes.setScale(2, RoundingMode.HALF_UP).toPlainString();
    }
}
