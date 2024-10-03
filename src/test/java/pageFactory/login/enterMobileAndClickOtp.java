package pageFactory.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class enterMobileAndClickOtp {
    WebDriver driver;
    public enterMobileAndClickOtp(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id='Portal_T_MobileNumber']")
    WebElement mobileNumber;

    @FindBy(xpath = "//*[normalize-space(text())='Send OTP']")
    WebElement clickSendOtpButton;

    public void enterMobileValueAndClick(String mobileNumberValue){
        System.out.println(mobileNumberValue);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        mobileNumber.sendKeys(mobileNumberValue);
        clickSendOtpButton.click();
    }
}
