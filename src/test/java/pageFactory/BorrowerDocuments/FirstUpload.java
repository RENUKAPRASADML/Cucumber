package pageFactory.BorrowerDocuments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstUpload {

    WebDriver driver;
    public FirstUpload(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//a[normalize-space(text())= 'Upload'])[1]")
    WebElement uploadButtonOne;

    public void clickOnFirstUploadButton() {
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(uploadButtonOne));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // WebElement frameUpload=driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
        //driver.switchTo().frame(frameUpload);
        uploadButtonOne.click();
       // js.executeScript("arguments[0].click();", uploadButtonOne);

    }

}
