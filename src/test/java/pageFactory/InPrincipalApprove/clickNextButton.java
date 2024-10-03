package pageFactory.InPrincipalApprove;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class clickNextButton {
    WebDriver driver;
    public clickNextButton(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//button[normalize-space(text())='Next'])[1]")
    WebElement clickOnNextButton;

    public void clickOnNext() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", buttonNextclick);*/
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //clickOnNextButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", clickOnNextButton);
    }

}
