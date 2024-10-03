package pageFactory.AllDocuments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class pANCard {
    WebDriver driver;
    public pANCard(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//a[normalize-space(text())= 'Upload'])[1]")
    WebElement uploadButtonOne;
    @FindBy(xpath = "//*[@id='browsefromPC']")
    WebElement BrowseFromComputerOne;
    @FindBy(xpath = "//*[text()='Upload and Close']")
    WebElement buttonUploadAndCloseOne;

    @FindBy(xpath = "(//a[normalize-space(text())= 'Upload'])[2]")
    WebElement uploadButtonTwo;
    @FindBy(xpath = "//*[@id='browsefromPC']")
    WebElement BrowseFromComputerTwo;
    @FindBy(xpath = "//*[text()='Upload and Close']")
    WebElement buttonUploadAndCloseTwo;

    @FindBy(xpath = "//*[@id='browsefromPC']")
    WebElement BrowseFromComputerThree;
    @FindBy(xpath = "//*[text()='Upload and Close']")
    WebElement buttonUploadAndCloseThree;

    @FindBy(xpath = "//*[@id='browsefromPC']")
    WebElement BrowseFromComputerFour;
    @FindBy(xpath = "//*[text()='Upload and Close']")
    WebElement buttonUploadAndCloseFour;

    @FindBy(xpath = "//*[@id='browsefromPC']")
    WebElement BrowseFromComputerFive;
    @FindBy(xpath = "//*[text()='Upload and Close']")
    WebElement buttonUploadAndCloseFive;


    public void clickUploadAndBrowseAndUploadDocument(String documentPath1, String documentPath2, String documentPath3, String documentPath4 ) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //uploadButtonOne.click();
      /* WebElement frameUpload1=driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
        driver.switchTo().frame(frameUpload1);

        WebElement dateField = driver.findElement(By.xpath("//*[@id=\"CP_UPLOAD_DOCUMENT\"]/tbody/tr[1]/td[6]/input"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].removeAttribute('disabled');", dateField);

        // Set the desired date using JavaScript
        String dateToSet = "27/08/2024 18:12:18";  // Example date
        js.executeScript("arguments[0].value = arguments[1];", dateField, dateToSet);

        System.out.println("Please");*/
            for(int i=1;i<2;i++) {
                System.out.println(i);
                driver.findElement(By.xpath("//*[@id=\"CP_UPLOAD_DOCUMENT\"]/tbody/tr[4]/td[7]/a")).click();
                ////*[@id="CP_UPLOAD_DOCUMENT"]/tbody/tr[3]/td[7]/a
                String mainWindow = driver.getWindowHandle();
                for (String handle1 : driver.getWindowHandles()) {
                    if (!handle1.equals(mainWindow)) {
                        driver.switchTo().window(handle1);
                        break;
                    }
                }
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                BrowseFromComputerOne.sendKeys(documentPath1);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
                buttonUploadAndCloseOne.click();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                driver.switchTo().window(mainWindow);
                System.out.println("please Please");
                WebElement frameUpload2=driver.findElement(By.xpath("(//*[@id=\"ngformIframe\"])"));
                driver.switchTo().frame(frameUpload2);
                System.out.println(driver.findElement(By.xpath("//*[@id=\"CP_UPLOAD_DOCUMENT\"]/tbody/tr[2]/td[3]/select")).getText());
                System.out.println("inside frame");
                //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                Thread.sleep(10);
                //----
                driver.findElement(By.xpath("//*[@id=\"CP_UPLOAD_DOCUMENT\"]/tbody/tr[3]/td[7]/a")).click();
                ////*[@id="CP_UPLOAD_DOCUMENT"]/tbody/tr[3]/td[7]/a
                //String mainWindow = driver.getWindowHandle();
                for (String handle2 : driver.getWindowHandles()) {
                    if (!handle2.equals(mainWindow)) {
                        driver.switchTo().window(handle2);
                        break;
                    }
                }
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                BrowseFromComputerOne.sendKeys(documentPath2);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
                buttonUploadAndCloseOne.click();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                driver.switchTo().window(mainWindow);
                System.out.println("please Please");
                WebElement frameUpload3=driver.findElement(By.xpath("(//*[@id=\"ngformIframe\"])"));
                driver.switchTo().frame(frameUpload3);
                System.out.println(driver.findElement(By.xpath("//*[@id=\"CP_UPLOAD_DOCUMENT\"]/tbody/tr[2]/td[3]/select")).getText());
                System.out.println("inside frame");
                Thread.sleep(20);
                //---
                driver.findElement(By.xpath("//*[@id=\"CP_UPLOAD_DOCUMENT\"]/tbody/tr[2]/td[7]/a")).click();
                ////*[@id="CP_UPLOAD_DOCUMENT"]/tbody/tr[3]/td[7]/a
                //String mainWindow = driver.getWindowHandle();
                for (String handle3 : driver.getWindowHandles()) {
                    if (!handle3.equals(mainWindow)) {
                        driver.switchTo().window(handle3);
                        break;
                    }
                }
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                BrowseFromComputerOne.sendKeys(documentPath3);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
                buttonUploadAndCloseOne.click();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                driver.switchTo().window(mainWindow);
                System.out.println("please Please");
                WebElement frameUpload4=driver.findElement(By.xpath("(//*[@id=\"ngformIframe\"])"));
                driver.switchTo().frame(frameUpload4);
                System.out.println(driver.findElement(By.xpath("//*[@id=\"CP_UPLOAD_DOCUMENT\"]/tbody/tr[2]/td[3]/select")).getText());
                System.out.println("inside frame");
                Thread.sleep(10);
                //---
                driver.findElement(By.xpath("//*[@id=\"CP_UPLOAD_DOCUMENT\"]/tbody/tr[1]/td[7]/a")).click();
                ////*[@id="CP_UPLOAD_DOCUMENT"]/tbody/tr[3]/td[7]/a
               // String mainWindow = driver.getWindowHandle();
                for (String handle4 : driver.getWindowHandles()) {
                    if (!handle4.equals(mainWindow)) {
                        driver.switchTo().window(handle4);
                        break;
                    }
                }
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                BrowseFromComputerOne.sendKeys(documentPath4);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
                buttonUploadAndCloseOne.click();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                driver.switchTo().window(mainWindow);
                System.out.println("please Please");
               // driver.findElement(By);

               /* WebElement frameUpload5=driver.findElement(By.xpath("(//*[@id=\"ngformIframe\"])"));
                driver.switchTo().frame(frameUpload5);
                System.out.println(driver.findElement(By.xpath("//*[@id=\"CP_UPLOAD_DOCUMENT\"]/tbody/tr[2]/td[3]/select")).getText());
                System.out.println("inside frame");*/
            }
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        uploadButtonOne.click();
//        WebElement frameUpload2=driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
//        driver.switchTo().frame(frameUpload2);
//        WebElement dateField2 = driver.findElement(By.xpath("//*[@id=\"CP_UPLOAD_DOCUMENT\"]/tbody/tr[2]/td[6]/input"));
//
//        JavascriptExecutor js1 = (JavascriptExecutor) driver;
//
//
//
//        //driver.switchTo().window(mainWindow);
//
//        //driver.findElement(By.xpath("//*[@id=\"CP_UPLOAD_DOCUMENT\"]/tbody/tr[1]/td[7]/a")).click();
//        String mainWindow = driver.getWindowHandle();
//        for (String handle1 : driver.getWindowHandles()) {
//            if (!handle1.equals(mainWindow)) {
//                driver.switchTo().window(handle1);
//                break;
//            }
//        }
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        BrowseFromComputerOne.sendKeys(documentPath);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        buttonUploadAndClose.click();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        //driver.close();
//        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver.switchTo().window(mainWindow);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
//
//       /* WebElement frameUpload2=driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
//        driver.switchTo().frame(frameUpload2);
//       // uploadButtonTwo.click();
//        driver.findElement(By.xpath("//*[@id=\"CB_UPLOAD_DOCUMENT\"]/tbody/tr[2]/td[7]/a")).click();
//        for (String handle2 : driver.getWindowHandles()) {
//            if (!handle2.equals(mainWindow)) {
//                driver.switchTo().window(handle2);
//                break;
//            }
//        }
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        BrowseFromComputerTwo.sendKeys(documentPath);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        buttonUploadAndCloseTwo.click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.switchTo().window(mainWindow);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        //third document
//        WebElement frameUpload3=driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
//        driver.switchTo().frame(frameUpload3);
//        // uploadButtonTwo.click();
//        driver.findElement(By.xpath("//*[@id=\"CB_UPLOAD_DOCUMENT\"]/tbody/tr[3]/td[7]/a")).click();
//        for (String handle3 : driver.getWindowHandles()) {
//            if (!handle3.equals(mainWindow)) {
//                driver.switchTo().window(handle3);
//                break;
//            }
//        }
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        BrowseFromComputerThree.sendKeys(documentPath);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        buttonUploadAndCloseThree.click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.switchTo().window(mainWindow);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        //Fourth
//        WebElement frameUpload4=driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
//        driver.switchTo().frame(frameUpload4);
//        // uploadButtonTwo.click();
//        driver.findElement(By.xpath("//*[@id=\"CB_UPLOAD_DOCUMENT\"]/tbody/tr[4]/td[7]/a")).click();
//        for (String handle4 : driver.getWindowHandles()) {
//            if (!handle4.equals(mainWindow)) {
//                driver.switchTo().window(handle4);
//                break;
//            }
//        }
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        BrowseFromComputerFour.sendKeys(documentPath);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        buttonUploadAndCloseFour.click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.switchTo().window(mainWindow);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        //Fifth document
//        WebElement frameUpload5=driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
//        driver.switchTo().frame(frameUpload3);
//        // uploadButtonTwo.click();
//        driver.findElement(By.xpath("//*[@id=\"CB_UPLOAD_DOCUMENT\"]/tbody/tr[5]/td[7]/a")).click();
//        for (String handle5 : driver.getWindowHandles()) {
//            if (!handle5.equals(mainWindow)) {
//                driver.switchTo().window(handle5);
//                break;
//            }
//        }
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        BrowseFromComputerFive.sendKeys(documentPath);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        buttonUploadAndCloseFive.click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.switchTo().window(mainWindow);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
    }
}
