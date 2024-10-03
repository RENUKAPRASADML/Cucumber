package pageFactory.Loandetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class fillMandatoryfields {
    WebDriver driver;
    public fillMandatoryfields(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "P_CP_LD_Purpose")
    WebElement purpose;

    @FindBy(id = "P_CP_LD_ROI_Type")
    WebElement roiType;

    @FindBy(id = "P_CB_LD_Preffered_EMI")
    WebElement emiDate;

    @FindBy(id = "P_CP_LD_Requested_Loan_Amount")
    WebElement reqLoanAmt;


    public void fillAllMandatoryFields(String purposeValue, String roi,String reqAmt) {
        driver.switchTo().frame("ngformIframe");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        Select Purpose = new Select(purpose);
        Purpose.selectByValue(purposeValue);
        //Purpose.selectByIndex(2);

        reqLoanAmt.sendKeys(reqAmt);

        //for roi type
        Select roiValue = new Select(roiType);
        roiValue.selectByIndex(1);

        // for emi date
       // Select emiDateSelect = new Select(emiDate);
        //emiDateSelect.selectByValue(String.valueOf(emiDateValue));

        // for req amt

    }
}
