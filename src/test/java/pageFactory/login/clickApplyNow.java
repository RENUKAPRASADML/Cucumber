package pageFactory.login;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class clickApplyNow {
    WebDriver driver;
    public clickApplyNow(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[normalize-space(text())='Apply Now']")
    WebElement applyNow;

    public void clickApplyNowButton(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", applyNow);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        applyNow.click();
    }

}
