package pageFactory.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectParameterAndEnterValue {
    WebDriver driver;

    public SelectParameterAndEnterValue(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[text()='Select Combination']/..//div/select")
    WebElement selectValueFromDropdown;

    @FindBy(xpath = "//*[@id='Portal_L_CustomerID_Number']")
    WebElement enterValue;


    public void selectFromDropdown(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     Select select=new Select(selectValueFromDropdown);
     select.selectByValue("Customer Id");
    }
    public void enterValueOfParameter(String customerId){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        enterValue.sendKeys(customerId);
    }
}






