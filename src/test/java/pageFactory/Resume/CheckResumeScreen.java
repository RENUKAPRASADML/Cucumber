package pageFactory.Resume;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class CheckResumeScreen {
    WebDriver driver;
    public CheckResumeScreen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[text()='Resume']")
    WebElement resumeButton;

    public void toCheckResumeOrAvailScreen(){
       try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
           JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("arguments[0].click();", resumeButton);
        }
        catch (Exception e){
            System.out.println("No Resume screen");
           // System.out.println(e.getMessage());
        }

    }
}
