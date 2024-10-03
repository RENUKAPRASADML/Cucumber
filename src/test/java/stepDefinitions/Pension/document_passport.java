package stepDefinitions.Pension;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pageFactory.AllDocuments.passport;
import pageFactory.AllDocuments.ppo;

public class document_passport {
    WebDriver driver=commonDriverClass.getDriver();
    passport uploadAndClose;
    @Given("user in Document upload screen for Pension to upload borrower Passport size Photograph document {string}")
    public void userInDocumentUploadScreenForPensionToUploadBorrowerPassportSizePhotographDocument(String filePath) {
        uploadAndClose=new passport(driver);
        uploadAndClose.clickUploadAndBrowseAndUploadDocument(filePath);
    }
}
