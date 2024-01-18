package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ShopPage extends BasePage{
    @FindBy(className = "elemnt-list")
    private WebElement backpackProduct;
    @FindBy(id = "")
    private WebElement addBackpackToCartButton;
    @FindBy(className = "")
    private WebElement bikelightProduct;
    @FindBy(id = "")
    private WebElement addBikeLightButton;
    @FindBy(id = "")
    private WebElement fleeceJacketProduct;

    public ShopPage(WebDriver browser){
        initElements(browser);
    }

    public void addProductToCart(){

    }
}
