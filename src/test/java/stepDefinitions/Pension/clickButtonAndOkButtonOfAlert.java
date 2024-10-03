package stepDefinitions.Pension;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageFactory.clickButtonAndAlert.alert;
import pageFactory.clickButtonAndAlert.clickButton;

public class clickButtonAndOkButtonOfAlert {
    WebDriver driver=commonDriverClass.getDriver();

    clickButton buttonClick;
    @Given("After document upload click on Next button")
    public void after_document_upload_click_on_next_button() {
    buttonClick=new clickButton(driver);
    buttonClick.clickOnButton();
    }
    alert alertMsg;
    @Then("print the alert message and click Ok button")
    public void print_the_alert_message_and_click_ok_button() {
    alertMsg=new alert(driver);
    alertMsg.clickOkButtonOfAlert();
    }

}
