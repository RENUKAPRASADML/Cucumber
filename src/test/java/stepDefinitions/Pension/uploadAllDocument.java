package stepDefinitions.Pension;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageFactory.DocumentUpload.*;
//import pageFactory.DocumentUpload.borrower.*;

import java.awt.*;
import java.time.Duration;

public class uploadAllDocument {
    WebDriver driver=commonDriverClass.getDriver();
    String mainWindow=null;
    @Given("user in Document upload screen of Budget")
    public void user_in_document_upload_screen_of_budget() {
        System.out.println("upload screen");
    }

    clickUploadButton11 uploadButton11;
    @Then("click on Upload button of borrower Salary Slip Month1 Latest")
    public void click_on_upload_button_of_borrower_salary_slip_month1_latest() {
        uploadButton11=new clickUploadButton11(driver);
        System.out.println("one");
        uploadButton11.clickOnFirstUploadButton();
        System.out.println("clicked one");

    }
    mainDocumentUpload11 uploadDocument11;
    @Then("new window will open borrower Salary Slip Month1 Latest  there click on Browse from computer button and upload the document from {string}")
    public void new_window_will_open_borrower_salary_slip_month1_latest_there_click_on_browse_from_computer_button_and_upload_the_document_from(String path) throws AWTException {
        uploadDocument11=new mainDocumentUpload11(driver);
        uploadDocument11.clickBrowseAndUploadDocumentForOne(path);

    }

    clickUploadButton12 uploadButton12;
    @Then("click on Upload button of borrower Salary Slip Month2")
    public void click_on_upload_button_of_borrower_salary_slip_month2() {
        uploadButton12=new clickUploadButton12(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Second");
        uploadButton12.clickOnSecondUploadButton();
        System.out.println("clicked two");

    }
    mainDocumentUpload12 uploadDocument12;
    @Then("new window will open borrower Salary Slip Month2  there click on Browse from computer button and upload the document from {string}")
    public void new_window_will_open_borrower_salary_slip_month2_there_click_on_browse_from_computer_button_and_upload_the_document_from(String path) throws AWTException {
        uploadDocument12=new mainDocumentUpload12(driver);
        uploadDocument12.clickBrowseAndUploadDocumentForSecond(path);
    }
    clickUploadButton13 uploadButton13;
    @Then("click on Upload button of borrower Salary Slip Month3")
    public void click_on_upload_button_of_borrower_salary_slip_month3() {
        uploadButton13=new clickUploadButton13(driver);
        uploadButton13.clickOnThirdUploadButton();
    }
    mainDocumentUpload13 uploadDocument13;
    @Then("new window will open borrower Salary Slip Month3  there click on Browse from computer button and upload the document from {string}")
    public void new_window_will_open_borrower_salary_slip_month3_there_click_on_browse_from_computer_button_and_upload_the_document_from(String path) throws AWTException {
        uploadDocument13=new mainDocumentUpload13(driver);
        uploadDocument13.clickBrowseAndUploadDocument(path);
    }
    clickUploadButton14 uploadButton14;
    @Then("click on Upload button of borrower PAN Card")
    public void click_on_upload_button_of_borrower_pan_card() {
        uploadButton14=new clickUploadButton14(driver);
        uploadButton14.clickOnFourthUploadButton();
    }
    mainDocumentUpload14 uploaddocument14;
    @Then("new window will open borrower PAN Card  there click on Browse from computer button and upload the document from {string}")
    public void new_window_will_open_borrower_pan_card_there_click_on_browse_from_computer_button_and_upload_the_document_from(String path) throws AWTException {
        uploaddocument14=new mainDocumentUpload14(driver);
        uploaddocument14.clickBrowseAndUploadDocument(path);
    }
    clickUploadButton15 uploadButton15;
    @Then("click on Upload button of borrower Aadhar Card")
    public void click_on_upload_button_of_borrower_aadhar_card() {
        uploadButton15=new clickUploadButton15(driver);
        uploadButton15.clickOnFifthUploadButton();
    }
    mainDocumentUpload15 uploaddocument15;
    @Then("new window will open borrower Aadhar Card  there click on Browse from computer button and upload the document from {string}")
    public void new_window_will_open_borrower_aadhar_card_there_click_on_browse_from_computer_button_and_upload_the_document_from(String path) throws AWTException {
        uploadButton15=new clickUploadButton15(driver);
       uploaddocument15.clickBrowseAndUploadDocument(path);
    }
    clickUploadButton16 uploadButton16;
    @Then("click on Upload button of borrower Passport size Photograph")
    public void click_on_upload_button_of_borrower_passport_size_photograph() {
        uploadButton16=new clickUploadButton16(driver);
        uploadButton16.clickOnSixUploadButton();
    }
    mainDocumentUpload16 uploaddocument16;
    @Then("new window will open borrower Passport size Photograph  there click on Browse from computer button and upload the document from {string}")
    public void new_window_will_open_borrower_passport_size_photograph_there_click_on_browse_from_computer_button_and_upload_the_document_from(String path) throws AWTException {
        uploaddocument16=new mainDocumentUpload16(driver);
        uploaddocument16.clickBrowseAndUploadDocument(path);
    }
    clickUploadButton17 uploadButton17;
    @Then("click on Upload button of borrower Form16 or ITR")
    public void click_on_upload_button_of_borrower_form16_or_itr() {
        uploadButton17=new clickUploadButton17(driver);
        uploadButton17.clickOnSevenUploadButton();
    }
    mainDocumentUpload17 uploaddocument17;
    @Then("new window will open borrower Form16 or ITR  there click on Browse from computer button and upload the document from {string}")
    public void new_window_will_open_borrower_form16_or_itr_there_click_on_browse_from_computer_button_and_upload_the_document_from(String path) throws AWTException {
        uploaddocument17=new mainDocumentUpload17(driver);
        uploaddocument17.clickBrowseAndUploadDocument(path);
    }

    clickUploadButton21 uploadButton21;
    @Then("click on Upload button of coborrower Salary Slip Month1 Latest")
    public void click_on_upload_button_of_coborrower_salary_slip_month1_latest() {
        uploadButton21=new clickUploadButton21(driver);
        uploadButton21.clickOnUploadButton();
    }
    mainDocumentUpload21 uploaddocument21;
    @Then("new window will open coborrower Salary Slip Month1 Latest  there click on Browse from computer button and upload the document from {string}")
    public void new_window_will_open_coborrower_salary_slip_month1_latest_there_click_on_browse_from_computer_button_and_upload_the_document_from(String path) throws AWTException {
        uploaddocument21=new mainDocumentUpload21(driver);
        uploaddocument21.clickBrowseAndUploadDocument(path);
    }
    clickUploadButton22 uploadButton22;
    @Then("click on Upload button of coborrower Salary Slip Month2")
    public void click_on_upload_button_of_coborrower_salary_slip_month2() {
        uploadButton22=new clickUploadButton22(driver);
        uploadButton22.clickOnUploadButton();
    }
    mainDocumentUpload22 uploaddocument22;
    @Then("new window will open coborrower Salary Slip Month2  there click on Browse from computer button and upload the document from {string}")
    public void new_window_will_open_coborrower_salary_slip_month2_there_click_on_browse_from_computer_button_and_upload_the_document_from(String path) throws AWTException {
        uploaddocument22=new mainDocumentUpload22(driver);
        uploaddocument22.clickBrowseAndUploadDocument(path);
    }
    clickUploadButton23 uploadButton23;
    @Then("click on Upload button of coborrower Salary Slip Month3")
    public void click_on_upload_button_of_coborrower_salary_slip_month3() {
        uploadButton23=new clickUploadButton23(driver);
        uploadButton23.clickOnUploadButton();
    }
    mainDocumentUpload23 uploaddocument23;
    @Then("new window will open coborrower Salary Slip Month3  there click on Browse from computer button and upload the document from {string}")
    public void new_window_will_open_coborrower_salary_slip_month3_there_click_on_browse_from_computer_button_and_upload_the_document_from(String path) throws AWTException {
        uploaddocument23=new mainDocumentUpload23(driver);
        uploaddocument23.clickBrowseAndUploadDocument(path);
    }
    clickUploadButton24 uploadButton24;
    @Then("click on Upload button of coborrower PAN Card")
    public void click_on_upload_button_of_coborrower_pan_card() {
        uploadButton24=new clickUploadButton24(driver);
        uploadButton24.clickOnUploadButton();
    }
    mainDocumentUpload24 uploaddocument24;
    @Then("new window will open coborrower PAN Card  there click on Browse from computer button and upload the document from {string}")
    public void new_window_will_open_coborrower_pan_card_there_click_on_browse_from_computer_button_and_upload_the_document_from(String path) throws AWTException {
        uploaddocument24=new mainDocumentUpload24(driver);
        uploaddocument24.clickBrowseAndUploadDocument(path);
    }
    clickUploadButton25 uploadButton25;
    @Then("click on Upload button of coborrower Aadhar Card")
    public void click_on_upload_button_of_coborrower_aadhar_card() {
        uploadButton25=new clickUploadButton25(driver);
        uploadButton25.clickOnUploadButton();
    }
    mainDocumentUpload25 uploaddocument25;
    @Then("new window will open coborrower Aadhar Card  there click on Browse from computer button and upload the document from {string}")
    public void new_window_will_open_coborrower_aadhar_card_there_click_on_browse_from_computer_button_and_upload_the_document_from(String path) throws AWTException {
        uploaddocument25=new mainDocumentUpload25(driver);
        uploaddocument25.clickBrowseAndUploadDocument(path);
    }

    clickUploadButton26 uploadButton26;
    @Then("click on Upload button of coborrower Form16 or ITR")
    public void click_on_upload_button_of_coborrower_form16_or_itr() {
        uploadButton26=new clickUploadButton26(driver);
        uploadButton26.clickOnUploadButton();
    }
    mainDocumentUpload26 uploaddocument26;
    @Then("new window will open coborrower Form16 or ITR  there click on Browse from computer button and upload the document from {string}")
    public void new_window_will_open_coborrower_form16_or_itr_there_click_on_browse_from_computer_button_and_upload_the_document_from(String path) throws AWTException {
        uploaddocument26=new mainDocumentUpload26(driver);
        uploaddocument26.clickBrowseAndUploadDocument(path);
    }

    clickUploadButton27 uploadButton27;
    @Then("click on Upload button of coborrower Passport size Photograph")
    public void click_on_upload_button_of_coborrower_passport_size_photograph() {
        uploadButton27=new clickUploadButton27(driver);
        uploadButton27.clickOnUploadButton();
    }
    mainDocumentUpload27 uploaddocument27;
    @Then("new window will open coborrower Passport size Photograph  there click on Browse from computer button and upload the document from {string}")
    public void new_window_will_open_coborrower_passport_size_photograph_there_click_on_browse_from_computer_button_and_upload_the_document_from(String path) throws AWTException {
        uploaddocument27=new mainDocumentUpload27(driver);
        uploaddocument27.clickBrowseAndUploadDocument(path);
    }




}
