package pageFactory.clickButtonAndAlert;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class alert {
    WebDriver driver;
    public alert(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//a[normalize-space(text())= 'Upload'])[1]")
    WebElement uploadButton1;

    public void clickOkButtonOfAlert() {

    }
}
