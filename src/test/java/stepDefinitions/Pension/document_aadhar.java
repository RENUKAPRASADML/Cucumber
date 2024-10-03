package stepDefinitions.Pension;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pageFactory.AllDocuments.aadhar;
import pageFactory.AllDocuments.passport;
import pageFactory.AllDocuments.ppo;

public class document_aadhar {
    WebDriver driver=commonDriverClass.getDriver();
    aadhar uploadAndClose;
    @Given("user in Document upload screen for Pension to upload borrower Aadhar Card document {string}")
    public void userInDocumentUploadScreenForPensionToUploadBorrowerAadharCardDocument(String filePath) {
        uploadAndClose=new aadhar(driver);
        uploadAndClose.clickUploadAndBrowseAndUploadDocument(filePath);
    }
}
