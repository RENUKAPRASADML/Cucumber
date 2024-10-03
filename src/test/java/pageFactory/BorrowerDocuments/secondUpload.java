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

public class secondUpload {

    WebDriver driver;
    public secondUpload(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//a[normalize-space(text())= 'Upload'])[2]")
    WebElement uploadButtonSecond;

    public void clickOnSecondUploadButton() throws InterruptedException {
        driver.switchTo().defaultContent();
        /*WebElement frameUpload=driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
        driver.switchTo().frame(frameUpload);*/
        /*WebDriverWait waitSecond = new WebDriverWait(driver,Duration.ofSeconds(10));
        waitSecond.until(ExpectedConditions.elementToBeClickable(uploadButtonSecond));*/
        System.out.println("Okay please");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        uploadButtonSecond.click();
        System.out.println("clicked");


    }

}
