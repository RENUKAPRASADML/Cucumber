package stepDefinitions.Pension;

import io.cucumber.java.en.*;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pageFactory.login.*;

import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Loan_Login {

    WebDriver driver=commonDriverClass.getDriver();
    @Given("user in product listing page and selects {string}")
    public void user_in_product_listing_page_and_selects(String productName) throws IOException {
        //WebDriverManager.chromedriver().setup();
        Properties p = new Properties();
        FileReader read=new FileReader("C://Users//renukaprasad.ml//IdeaProjects//PensionUAT//resources//urls//url.properties");
        p.load(read);
        String value= p.getProperty("uat");
        System.out.println(value);
        driver.get(value);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[text()='" + productName + "']")).click();
        Allure.addAttachment("screenshot", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));

    }

    clickApplyNow applyNow;
    @Given("click on Apply Now button")
    public void click_on_apply_now_button() {
        applyNow=new clickApplyNow(driver);
        applyNow.clickApplyNowButton();
        screenshot();

    }
    enterMobileAndClickOtp enterAndOtp;
    @When("User navigates to Authentication screen enter {string} and click send otp button")
    public void user_navigates_to_authentication_screen_enter_and_click_send_otp_button(String mobileNumber) {
        enterAndOtp=new enterMobileAndClickOtp(driver);
        enterAndOtp.enterMobileValueAndClick(mobileNumber);
        screenshot();

    }
    enterOtpAndValidate otpAndValidate;
    @Then("User navigates to Verification screen - enter received otp of {string} and click Validate button")
    public void user_navigates_to_verification_screen_enter_received_otp_and_click_validate_button(String mobileNo) {
    otpAndValidate=new enterOtpAndValidate(driver);
        otpAndValidate.toEnterOtpAndClickValidate(mobileNo);
        screenshot();
    }

    SelectParameterAndEnterValue selectAndEnter;
    @Then("User selects Combination from dropdown and enter particular {string}")
    public void user_selects_combination_from_dropdown_and_enter_particular(String custmerId) {
        selectAndEnter=new SelectParameterAndEnterValue(driver);
        selectAndEnter.selectFromDropdown();
        selectAndEnter.enterValueOfParameter(custmerId);
        screenshot();

    }
    acceptTermsAndCondition acceptTerms;
    @Then("click on terms and condition and accept it")
    public void click_on_terms_and_condition_and_accept_it() {
        acceptTerms=new acceptTermsAndCondition(driver);
        acceptTerms.clickOnLink();
        acceptTerms.clickOnDoneButton();
        screenshot();

    }

    clickProceedButton clickButton;
    @Then("click on Proceed button and user should navigate to Avail offer screen")
    public void click_on_proceed_button_and_user_should_navigate_to_avail_offer_screen() {
        clickButton=new clickProceedButton(driver);
        clickButton.clickOnProceedButton();
        Allure.addAttachment("screenshot", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }
   
    @Attachment(value = "Screenshot", type = "image/png")
    public void screenshot() {
        Allure.addAttachment("screenshot", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }

}
