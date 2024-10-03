package pageFactory.AllDocuments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class aadhar {
    WebDriver driver;

    public aadhar(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='browsefromPC']")
    WebElement BrowseFromComputer;
    @FindBy(xpath = "//*[text()='Upload']")
    WebElement buttonUpload;

    public void clickUploadAndBrowseAndUploadDocument(String documentPath) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement frameUpload2 = driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
        driver.switchTo().frame(frameUpload2);

        WebElement dateField2 = driver.findElement(By.xpath("//*[@id=\"CP_UPLOAD_DOCUMENT\"]/tbody/tr[4]/td[6]/input"));

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].removeAttribute('disabled');", dateField2);

        // Set the desired date using JavaScript
        String dateToSet2 = "27/08/2024 18:12:18";  // Example date
        js1.executeScript("arguments[0].value = arguments[1];", dateField2, dateToSet2);
        driver.switchTo().defaultContent();
        System.out.println("please");
        //uploadButtonOne.click();
        /*driver.findElement(By.xpath("//*[@id=\"CP_UPLOAD_DOCUMENT\"]/tbody/tr[1]/td[7]/a")).click();
        String mainWindow = driver.getWindowHandle();
        for (String handle1 : driver.getWindowHandles()) {
            if (!handle1.equals(mainWindow)) {
                driver.switchTo().window(handle1);
                break;
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BrowseFromComputerOne.sendKeys(documentPath);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        buttonUploadAndCloseOne.click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.switchTo().window(mainWindow);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/

        String mainWindow = driver.getWindowHandle();
        /*WebElement frameUpload2 = driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
        driver.switchTo().frame(frameUpload2);*/
        driver.switchTo().defaultContent();
        // uploadButtonTwo.click();
        driver.findElement(By.xpath("//*[@id=\"CB_UPLOAD_DOCUMENT\"]/tbody/tr[2]/td[7]/a")).click();
        for (String handle2 : driver.getWindowHandles()) {
            if (!handle2.equals(mainWindow)) {
                driver.switchTo().window(handle2);
                break;
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BrowseFromComputer.sendKeys(documentPath);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        buttonUpload.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().window(mainWindow);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       /* //third document
        WebElement frameUpload3=driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
        driver.switchTo().frame(frameUpload3);
        // uploadButtonTwo.click();
        driver.findElement(By.xpath("//*[@id=\"CB_UPLOAD_DOCUMENT\"]/tbody/tr[3]/td[7]/a")).click();
        for (String handle3 : driver.getWindowHandles()) {
            if (!handle3.equals(mainWindow)) {
                driver.switchTo().window(handle3);
                break;
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BrowseFromComputerThree.sendKeys(documentPath);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        buttonUploadAndCloseThree.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().window(mainWindow);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Fourth
        WebElement frameUpload4=driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
        driver.switchTo().frame(frameUpload4);
        // uploadButtonTwo.click();
        driver.findElement(By.xpath("//*[@id=\"CB_UPLOAD_DOCUMENT\"]/tbody/tr[4]/td[7]/a")).click();
        for (String handle4 : driver.getWindowHandles()) {
            if (!handle4.equals(mainWindow)) {
                driver.switchTo().window(handle4);
                break;
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BrowseFromComputerFour.sendKeys(documentPath);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        buttonUploadAndCloseFour.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().window(mainWindow);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Fifth document
        WebElement frameUpload5=driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
        driver.switchTo().frame(frameUpload3);
        // uploadButtonTwo.click();
        driver.findElement(By.xpath("//*[@id=\"CB_UPLOAD_DOCUMENT\"]/tbody/tr[5]/td[7]/a")).click();
        for (String handle5 : driver.getWindowHandles()) {
            if (!handle5.equals(mainWindow)) {
                driver.switchTo().window(handle5);
                break;
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BrowseFromComputerFive.sendKeys(documentPath);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        buttonUploadAndCloseFive.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().window(mainWindow);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
    }
    }
