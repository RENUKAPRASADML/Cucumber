
package pageFactory.DocumentUpload;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
public class clickUploadButton26 {
    WebDriver driver;
    public clickUploadButton26(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//a[normalize-space(text())= 'Upload'])[1]")
    WebElement uploadButton1;
    public void clickOnUploadButton() {
        //it worked for slider aswell
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].scrollIntoView(true);", uploadButton);
        uploadButton1.click();
    }
}
 