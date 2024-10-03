package stepDefinitions.Pension;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageFactory.BorrowerDocuments.*;

import java.awt.*;


public class borrowerDocumentUpload {
    WebDriver driver=commonDriverClass.getDriver();

    @Given("user in Document upload screen for Budget")
    public void user_in_document_upload_screen_for_budget() {
        System.out.println("Upload documets of borrower");
    }

    FirstUpload first;
    @Then("Upload button Salary Slip Month1 Latest")
    public void upload_button_salary_slip_month1_latest() {
        first=new FirstUpload(driver);
        first.clickOnFirstUploadButton();
    }

    firstDocument firstDocumentVar;
    @Then("Salary Slip Month1 Latest {string}")
    public void salary_slip_month1_latest(String path) throws AWTException {
        firstDocumentVar=new firstDocument(driver);
       firstDocumentVar.clickBrowseAndUploadDocumentForOne(path);
    }
    secondUpload second;
    @Then("Upload button Salary Slip Month2")
    public void upload_button_salary_slip_month2() throws InterruptedException {
        second=new secondUpload(driver);
        second.clickOnSecondUploadButton();
    }

    secondDocument secondDocumentVar;
    @Then("Salary Slip Month2  {string}")
    public void salary_slip_month2(String path) throws AWTException {
        secondDocumentVar=new secondDocument(driver);
        secondDocumentVar.clickBrowseAndUploadDocumentForSecond(path);
    }
}
