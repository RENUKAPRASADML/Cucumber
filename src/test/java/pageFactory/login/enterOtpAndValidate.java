package pageFactory.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.*;
import java.time.Duration;

public class enterOtpAndValidate {

    WebDriver driver;

    public enterOtpAndValidate(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='Portal_T_EnterOTP']")
    WebElement enterOtp;

    @FindBy(xpath = " //*[normalize-space(text())='Validate OTP']")
    WebElement clickValidateButton;

    public void toEnterOtpAndClickValidate(String mobileNo) {
        //enterOtp.sendKeys(generateOtp(mobileNo));
        enterOtp.sendKeys("998877");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        clickValidateButton.click();
    }

    public String generateOtp(String otpGenrateValue) {
        System.out.println("Hello");
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String otpData = null;
        try {
            // Load the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Connect to the Oracle database
            String url = "jdbc:oracle:thin:@192.168.12.111:1521/ng19c.newgen.co.in";
            String username = "ngcanibpsdev";
            String password = "ngcanibpsdev";
            connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            statement = connection.createStatement();

            // Execute a query
            //String delete="delete from Los_Wireference_Table where mobilenumber='"+otpGenrateValue+"'";
            //String comit="commit";
            //resultSet = statement.executeQuery(delete);
            //resultSet = statement.executeQuery(comit);
            String sqlQuery = "select * from portal_otp_user where mobilenumber='"+otpGenrateValue+"'";
            resultSet = statement.executeQuery(sqlQuery);

            // Process the result set
            while (resultSet.next()) {
                // Retrieve data from the result set
                otpData = resultSet.getString("OTP");
                // Do something with the data
                System.out.println(otpData);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return otpData;
    }

}
