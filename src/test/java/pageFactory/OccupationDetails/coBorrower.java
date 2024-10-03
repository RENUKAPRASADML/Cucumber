package pageFactory.OccupationDetails;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class coBorrower {

    WebDriver driver;
    public coBorrower(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//*[text()='Existing Customer']/..//div/input)[1]")
    WebElement ExistingCustomer;

    @FindBy(xpath = "//*[text()='Relationship with borrower']/..//div//select")
    WebElement Relationshipwithborrower;

    @FindBy(xpath = "//*[@id=\"P_CP_OD_MOBILE_NUMBER\"]")
    WebElement MobileNumberField;

    @FindBy(xpath = "//*[@id=\"P_CP_OD_CUSTOMER_ID\"]")
        //    (//*[text()='Customer ID'])/..//div//input
    WebElement CustomerIDField;

    public void fillAllMandatoryFieldsOfCoBorrower(String relation,String mobileNoValue,String cid) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", ExistingCustomer);

        Select select9 = new Select(Relationshipwithborrower);
        select9.selectByVisibleText(relation);

        MobileNumberField.sendKeys(mobileNoValue);

        CustomerIDField.sendKeys(cid);
    }

}
