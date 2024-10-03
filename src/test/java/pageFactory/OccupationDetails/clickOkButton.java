package pageFactory.OccupationDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class clickOkButton {
    WebDriver driver;
    public clickOkButton(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[normalize-space(text())= 'Validate']")
    WebElement validateButton;

    @FindBy(xpath = "//*[text()='Relationship with borrower']/..//div//select")
    WebElement Relationshipwithborrower;

    @FindBy(xpath = "(//*[text()='Mobile Number'])[2]/..//div//input")
    WebElement MobileNumberField;

    @FindBy(xpath = "(//*[text()='Customer ID'])")
    WebElement CustomerIDField;

    @FindBy(xpath = "//*[@class='bootbox-body']")
    WebElement printError;

    @FindBy(xpath = "(//button[text()='OK'])[2]")
    WebElement clickOk;


    public void clickOnValidateButton() {
        //it worked for slider aswell
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", validateButton);
        validateButton.click();
    }
    public void catchError(){
        try {
            System.out.println("catch error");
            driver.switchTo().defaultContent();
            WebElement iframe = driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
            driver.switchTo().frame(iframe);

            System.out.println("error is.. : " + printError.getText());
            /*JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", clickOk);*/
            System.out.println("success");

            //clickOk.click();
            driver.findElement(By.xpath("//button[@class='bootbox-close-button close']")).click();
            driver.findElement(By.xpath("//button[@class='bootbox-close-button close']")).click();

            System.out.println("okay");
        }catch(Exception e){
            System.out.println("No error");
        }

    }

}
