package pageFactory.BorrowerDocuments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class firstDocument {
    WebDriver driver;
    public firstDocument(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id='browsefromPC']")
    WebElement BrowseFromComputerOne;

    @FindBy(xpath = "//*[text()='Upload and Close']")
    WebElement buttonUploadAndCloseOne;

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

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BrowseFromComputerOne.sendKeys(documentPath);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        buttonUploadAndCloseOne.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
        driver.switchTo().window(mainWindow);
        System.out.println(mainWindow);
    }

}
