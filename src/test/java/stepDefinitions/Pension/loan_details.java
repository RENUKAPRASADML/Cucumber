package stepDefinitions.Pension;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageFactory.Loandetails.*;
import pageFactory.Resume.CheckResumeScreen;

public class loan_details {
    WebDriver driver=commonDriverClass.getDriver();
    CheckResumeScreen checkResumeScreen;

    @Given("when user in loan details screen")
    public void when_user_in_loan_details_screen() {
        System.out.println("User in Loan details screen");
    }

    @Then("check auto populate value of product,subproduct and RLLR")
    public void check_auto_populate_value_of_product_subproduct_and_rllr() {
        System.out.println("Product--Budget");
    }
    fillMandatoryfields filldmandatory;

    @Then("select value from dropdown for {string},{string} and enter value for {string}")
    public void select_value_from_dropdown_for_and_enter_value_for(String purposeValue, String roi, String reqamt) {
        filldmandatory=new fillMandatoryfields(driver);
        filldmandatory.fillAllMandatoryFields(purposeValue, roi,reqamt);

    }
    clickNext nextbutton;
    @Then("click on Next button")
    public void click_on_next_button() {
        nextbutton=new clickNext(driver);
        System.out.println("calling");
        nextbutton.clickNextButton();

    }
}
