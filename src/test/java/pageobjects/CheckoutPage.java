package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
    @FindBy(id = "first-name")
    private WebElement firstNameField;
    @FindBy(id = "last-name")
    private WebElement lastNameField;
    @FindBy(id = "postal-code")
    private WebElement zipCodeField;
    @FindBy(id = "continue")
    private WebElement continueButton;

    public CheckoutPage(WebDriver browser) {
        initElements(browser);
    }

    public PaymentPage inputUserData(){
        firstNameField.sendKeys("Testhor");
        lastNameField.sendKeys("Odinsson");
        zipCodeField.sendKeys("444551");
        continueButton.submit();
        return new PaymentPage(browser);
    }
}
