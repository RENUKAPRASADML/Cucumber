package stepDefinitions.Pension;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageFactory.InPrincipalApprove.*;

import java.time.Duration;

public class inPrincipalApprove {

    WebDriver driver=commonDriverClass.getDriver();
    @Given("user in InPrincipal screen check Loan Amount,Tenure,ROI, EMI")
    public void user_in_in_principal_screen_check_loan_amount_tenure_roi_emi() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("user in InPrincipal screen check Loan Amount,Tenure,ROI, EMI");
    }

    @Then("to Customize Your Final Personal Loan-change the value in both Loan amount and Tenure slider")
    public void to_customize_your_final_personal_loan_change_the_value_in_both_loan_amount_and_tenure_slider() {
        System.out.println("to Customize Your Final Personal Loan-change the value in both Loan amount and Tenure slider");
    }

    @Then("check same value is reflecting in Loam Amount and Tenure textbox")
    public void check_same_value_is_reflecting_in_loam_amount_and_tenure_textbox() {
        System.out.println("check same value is reflecting in Loam Amount and Tenure textbox");
    }

    @Then("Change the value in Loam Amount and Tenure textbox less than eligible value")
    public void change_the_value_in_loam_amount_and_tenure_textbox_less_than_eligible_value() {
        System.out.println("Change the value in Loam Amount and Tenure textbox less than eligible value");
    }

    @Then("check same value reflecting in both Loan amount and Tenure slider")
    public void check_same_value_reflecting_in_both_loan_amount_and_tenure_slider() {
        System.out.println("check same value reflecting in both Loan amount and Tenure slider");
    }

    selectTenureElongation clickTenureElongtn;
    @Then("select checkbox of I wish to apply for Loan Tenure elongation")
    public void select_checkbox_of_i_wish_to_apply_for_loan_tenure_elongation() throws InterruptedException {
    clickTenureElongtn=new selectTenureElongation(driver);
    clickTenureElongtn.clickCheckBoxOfTenureElongation();
    }

    clickNextButton onNextButton;
    @Then("click on Next button and Naviagte to Document upload screen")
    public void click_on_next_button_and_naviagte_to_document_upload_screen() {
    onNextButton=new clickNextButton(driver);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    onNextButton.clickOnNext();
    }

}
