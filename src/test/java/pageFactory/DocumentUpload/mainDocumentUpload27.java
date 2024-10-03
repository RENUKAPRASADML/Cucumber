
package pageFactory.DocumentUpload;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
public class mainDocumentUpload27 {
    WebDriver driver;
    public mainDocumentUpload27(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id='browsefromPC']")
    WebElement BrowsefromComputer;
    @FindBy(xpath = "//*[text()='Upload and Close']")
    WebElement buttonUploadAndClose;
    public void clickBrowseAndUploadDocument(String documentPath) throws AWTException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String mainWindow = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        BrowsefromComputer.sendKeys(documentPath);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        buttonUploadAndClose.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().window(mainWindow);
    }
}
 