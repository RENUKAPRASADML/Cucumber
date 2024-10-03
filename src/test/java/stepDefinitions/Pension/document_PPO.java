package stepDefinitions.Pension;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pageFactory.AllDocuments.pANCard;
import pageFactory.AllDocuments.ppo;

public class document_PPO {
    WebDriver driver=commonDriverClass.getDriver();
    ppo uploadAndClose;

    @Given("user in Document upload screen for Pension to upload borrower PPO Order Pension Copy document {string}")
    public void userInDocumentUploadScreenForPensionToUploadBorrowerPPOOrderPensionCopyDocument(String filePath) {
        uploadAndClose=new ppo(driver);
        uploadAndClose.clickUploadAndBrowseAndUploadDocument(filePath);
    }



}
