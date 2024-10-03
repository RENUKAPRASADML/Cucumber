
package pageFactory.DocumentUpload;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
public class clickUploadButton15 {
    WebDriver driver;
    public clickUploadButton15(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//a[normalize-space(text())= 'Upload'])[5]")
    WebElement uploadButtonFive;
    public void clickOnFifthUploadButton() {
        //it worked for slider aswell
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].scrollIntoView(true);", uploadButton);
        WebElement frameUpload=driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
        driver.switchTo().frame(frameUpload);
        uploadButtonFive.click();
    }
}
 