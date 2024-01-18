package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.utils.PropReader;

import java.io.IOException;

public abstract class BasePage {
    protected WebDriver browser;
    protected PropReader properties;

    public void initElements(WebDriver driver){
        this.browser = driver;
        PageFactory.initElements(browser, this);
    }

    public PropReader loadData() throws IOException {
        return new PropReader("./test.properties");
    }
}
