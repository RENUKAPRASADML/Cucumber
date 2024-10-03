package pageFactory.Loandetails;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class clickNext {
    WebDriver driver;

    public clickNext(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//button[normalize-space(text())='Next'])[1]")
    WebElement buttonNext;

    public void clickNextButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", buttonNext);
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", buttonNext);


    }

}
