package stepDefinitions.Pension;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pageFactory.AllDocuments.*;

public class document_PAN_Card {
    WebDriver driver=commonDriverClass.getDriver();
    pANCard uploadAndClose;
    @Given("user in Document upload screen for Pension to upload borrower PAN Card document {string} {string} {string} {string}")
    public void user_in_document_upload_screen_for_Pension_to_borrower_PAN_Card_document(String filePath1, String filePath2,String filePath3,String filePath4) throws InterruptedException {
    uploadAndClose=new pANCard(driver);
    uploadAndClose.clickUploadAndBrowseAndUploadDocument(filePath1,filePath2,filePath3,filePath4);
    }

}
