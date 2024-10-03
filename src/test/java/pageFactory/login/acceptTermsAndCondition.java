package pageFactory.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class acceptTermsAndCondition {
    WebDriver driver;

    public acceptTermsAndCondition(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[text()='I agree to all the terms & conditions and Bureau Consent']")
    WebElement termsLink;

    @FindBy(xpath = "//*[text()='DONE']")
    WebElement clickDoneButton;

    public void clickOnLink(){
        termsLink.click();
    }

    public void clickOnDoneButton(){
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
            }
        }
        clickDoneButton.click();
        driver.switchTo().window(mainWindowHandle);

    }

}
