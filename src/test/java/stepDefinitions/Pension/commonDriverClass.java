package stepDefinitions.Pension;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class commonDriverClass {
    private static WebDriver driver;
    static ChromeOptions options = new ChromeOptions();
    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options);
        }
        return driver;
    }
}
