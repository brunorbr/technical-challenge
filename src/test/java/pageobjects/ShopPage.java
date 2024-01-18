package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ShopPage extends BasePage{
    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement backPackRemoveButton;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement backpackAddButton;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement tShirtAddButton;
    @FindBy(id = "shopping_cart_container")
    private WebElement shoppingCartButton;
    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement shoppingCartBadge;

    public ShopPage(WebDriver browser){
        initElements(browser);
    }

    public void addtShirtToCart(){
        tShirtAddButton.click();
    }

    public void addBackpackToCart(){
        backpackAddButton.click();
    }

    public void removeBackPackFromCart(){
        backPackRemoveButton.click();
    }

    public CartPage clickOnCartButton(){
        shoppingCartButton.click();
        return new CartPage(browser);
    }

    public WebElement getShoppingCartBadge() {
        return shoppingCartBadge;
    }

    public WebElement getBackpackAddButton(){
        return backpackAddButton;
    }
}
