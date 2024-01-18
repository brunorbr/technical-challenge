package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage {

    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    WebElement totalAmount;

    public PaymentPage(WebDriver browser){
        initElements(browser);
    }

    public String getTotalAmount(){
        return totalAmount.getText().substring(8);
    }
}
