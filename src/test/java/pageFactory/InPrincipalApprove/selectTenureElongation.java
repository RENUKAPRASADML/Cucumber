package pageFactory.InPrincipalApprove;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class selectTenureElongation {
    WebDriver driver;
    public selectTenureElongation(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[text()='I wish to apply for Loan Tenure elongation ']/..//div//input")
    WebElement selectCheckBox;


    public void clickCheckBoxOfTenureElongation() throws InterruptedException {


        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", buttonNextclick);*/
        /*WebElement iframe=driver.findElement(By.xpath("//*[@id=\"ngformIframe\"]"));
        driver.switchTo().frame(iframe);*/
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //selectCheckBox.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", selectCheckBox);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        if(selectCheckBox.isSelected()){
            js.executeScript("arguments[0].click();", selectCheckBox);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            js.executeScript("arguments[0].click();", selectCheckBox);
        }

    }

}
