package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(id = "user-name")
    private WebElement usernameField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(id = "login-button")
    private WebElement submitButton;

    public HomePage(WebDriver browser){
        super(browser);
    }

    public ShopPage performLogin(String username, String password){
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        submitButton.submit();
        return new ShopPage(browser);
    }
}
