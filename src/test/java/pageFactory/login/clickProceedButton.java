package pageFactory.login;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class clickProceedButton {
    WebDriver driver;
    public clickProceedButton(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[normalize-space(text())='Proceed']")
    WebElement proceedButton;

    public void clickOnProceedButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
         proceedButton.click();
        /*try{ JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", proceedButton);
            System.out.println("cliked");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            *//*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.urlContains("next_page_url_part"));*//*
        }
        catch (Exception e){
            System.out.println("Not working");
        }*/

    }
}