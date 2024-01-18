package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    public CartPage(WebDriver browser){
        initElements(browser);
    }

    public CheckoutPage proceedToCheckout(){
        checkoutButton.click();
        return new CheckoutPage(browser);
    }
}
