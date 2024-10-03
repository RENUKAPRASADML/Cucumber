
package pageFactory.DocumentUpload;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
public class mainDocumentUpload11 {
    WebDriver driver;
    public mainDocumentUpload11(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id='browsefromPC']")
    WebElement BrowsefromComputerOne;
    @FindBy(xpath = "//*[text()='Upload and Close']")
    WebElement buttonUploadAndCloseOne;

    @FindBy(xpath = "(//a[normalize-space(text())= 'Upload'])[2]")
    WebElement uploadButtonSecond;

    public void clickBrowseAndUploadDocumentForOne(String documentPath) throws AWTException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        BrowsefromComputerOne.sendKeys(documentPath);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       String documnent=driver.findElement(By.xpath("//*[@id=\"importForm:fileListDataTable:0:dtDocType\"]")).getText();
        System.out.println(documnent);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        buttonUploadAndCloseOne.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
       driver.switchTo().window(mainWindow);
        String mainWindowCheck = driver.getWindowHandle();
        System.out.println(mainWindowCheck);
       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Maximum wait time of 30 seconds
        wait.until(ExpectedConditions.(uploadButton2));*/
       /* WebElement frameUpload=driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
        driver.switchTo().frame(frameUpload);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        uploadButtonSecond.click();*/
    }
}
 