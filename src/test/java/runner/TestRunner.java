package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "resources/Feature/Pension.feature", // Path to your feature files
    glue = "stepDefinitions/Pension"  // Package where your step definitions are located
       // plugin = {"pretty", "html:target/cucumber-reports.html"} // Report generation
        //plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
        //allure generate C:\Users\renukaprasad.ml\IdeaProjects\Budget\allure-results --clean -o C:\Users\renukaprasad.ml\IdeaProjects\Budget\report

)
public class TestRunner {

}