
package pageFactory.DocumentUpload;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
public class clickUploadButton11 {
    WebDriver driver;
    public clickUploadButton11(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//a[normalize-space(text())= 'Upload'])[1]")
    WebElement uploadButtonOne;
    public void clickOnFirstUploadButton() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
       // WebElement frameUpload=driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
        //driver.switchTo().frame(frameUpload);
        //uploadButtonOne.click();
        js.executeScript("arguments[0].click();", uploadButtonOne);

    }
}
 