package stepDefinitions.Pension;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageFactory.OccupationDetails.*;

import java.time.Duration;

public class occupationDetails {
    WebDriver driver=commonDriverClass.getDriver();

    @Given("when user in Occupation details screen")
    public void whenUserInOccupationDetailsScreen() {
        System.out.println("User in Occupation details screen ");
    }

    borrower fillBorrower;
    @Then("update all Occupation Details of borrower details: {string}")
    public void updateAllOccupationDetailsOfBorrowerDetails(String Residence) {
    fillBorrower=new borrower(driver);
    fillBorrower.fillAllMandatoryFieldsOfBorrower(Residence);
    }

    coBorrower fillCoBorrower;
    @Then("enter Co-Obligant {string}, {string}, {string} and click validate button")
    public void enterCoObligantAndClickValidateButton(String relation, String mobileNoValue, String cid) {
        fillCoBorrower=new coBorrower(driver);
        fillCoBorrower.fillAllMandatoryFieldsOfCoBorrower(relation,mobileNoValue,cid);
    }

    clickOkButton validateAndOk;
    @Then("click ok button on alert and fill co obligant details")
    public void clickOkButtonOnAlertAndFillCoObligantDetails() {
    validateAndOk=new clickOkButton(driver);
    validateAndOk.clickOnValidateButton();
    validateAndOk.catchError();
    }

    fillCoObligant fillAfterValidate;
    @Then("update all co-obligant details: {string}, {string}, {string},{string}, {string},{string}, {string},{string}, {string},{string}, {string},{string},{string}, {string},{string},{string}, {string}")
    public void updateAllCoObligantDetails(String OccupationType, String OccupationSubType, String OrganizationName, String Category, String Status, String Designation, String ExperienceYears, String ExperienceMonth, String OverallExperienceYears, String OverallExperienceMonth, String DateOfRetirement, String Qualification, String GrossSalary, String Deduction, String Residence, String RecoveryMechanism, String NatureOfSecurity) {
   fillAfterValidate=new fillCoObligant(driver);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    fillAfterValidate.fillAllMandatoryAllFieldsOfBorrower(OccupationType,OccupationSubType,OrganizationName,Category,Status,Designation,ExperienceYears,ExperienceMonth,OverallExperienceYears, OverallExperienceMonth,DateOfRetirement,Qualification,GrossSalary,Deduction,Residence,RecoveryMechanism,NatureOfSecurity);
    }

    clickNextButton buttonNext;
    @Then("click on Next button and Navigate to InPrincipal screen")
    public void clickOnNextButtonAndNavigateToInPrincipalScreen() {
    buttonNext=new clickNextButton(driver);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    buttonNext.clickNextButton();
        System.out.println("user navigate to inPrincipal screen");
    }
}
