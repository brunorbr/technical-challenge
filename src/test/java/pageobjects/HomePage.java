package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class HomePage extends BasePage{
    @FindBy(id = "user-name")
    private WebElement usernameField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(id = "login-button")
    private WebElement submitButton;

    public HomePage(WebDriver browser) throws IOException {
        browser.get(loadData().getBaseURL());
        initElements(browser);
    }

    public ShopPage performLogin() throws IOException {
        usernameField.sendKeys(loadData().getUsername());
        passwordField.sendKeys(loadData().getPassword());
        submitButton.submit();
        return new ShopPage(browser);
    }
}
