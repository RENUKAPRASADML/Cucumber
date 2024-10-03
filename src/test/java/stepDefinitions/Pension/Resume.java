package stepDefinitions.Pension;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageFactory.Resume.*;
public class Resume {
    WebDriver driver=commonDriverClass.getDriver();
    CheckResumeScreen checkResumeScreen;
    @Given("user when click on proceed button check whether navigate to Resume screen or Loan details screen")
    public void user_when_click_on_proceed_button_check_whether_navigate_to_resume_screen_or_Loan_details_screen() {
        checkResumeScreen=new CheckResumeScreen(driver);
        checkResumeScreen.toCheckResumeOrAvailScreen(); // clicking here only on Resume button if in Resume screen

    }
   /* checkWhichScreen whichScreen;
    @Then("if in Resume screen then click on Resume button and Navigate to respective screen")
    public void if_in_Resume_screen_then_click_on_resume_button_and_Navigate_respective_screen() {
        whichScreen=new checkWhichScreen(driver);
        whichScreen.printWhichScreen();

    }*/

    navigateResumeScreen whichScreen;
    @Then("if in Resume screen then click on Resume button and Navigate to respective screen based on {string} and {string}")
    public void ifInResumeScreenThenClickOnResumeButtonAndNavigateToRespectiveScreenBasedOnAnd(String arg0, String arg1) {
        whichScreen=new navigateResumeScreen(driver);
       // whichScreen.CheckWhichScreen(arg0,arg1);
    }
}
