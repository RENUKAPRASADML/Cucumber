
package pageFactory.DocumentUpload;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class clickUploadButton12 {
    WebDriver driver;
    public clickUploadButton12(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//a[normalize-space(text())= 'Upload'])[2]")
    WebElement uploadButtontwo;

    public void clickOnSecondUploadButton() {
       // driver.switchTo().defaultContent();
        //it worked for slider aswell
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].scrollIntoView(true);", uploadButton2);
       // String name=driver.findElement(By.xpath("(//*[@title='Salary Slip Month 1 Latest'])[1]")).getText();
        //System.out.println(name);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        //wait.until(ExpectedConditions.attributeContains());
        WebElement frameUpload=driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
        driver.switchTo().frame(frameUpload);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        uploadButtontwo.click();
    }
    public static void waitForPageLoad(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Maximum wait time of 30 seconds
        // Wait until document readyState is complete
        wait.until((ExpectedCondition<Boolean>) webDriver ->
                ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }
}
 