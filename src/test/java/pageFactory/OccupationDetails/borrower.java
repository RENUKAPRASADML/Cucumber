package pageFactory.OccupationDetails;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class borrower {
    WebDriver driver;
    public borrower(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//*[text()='Occupation Sub Type'])[1]/../div//select")
    WebElement Occupation_Sub_Type_field;

    @FindBy(xpath = "(//*[text()='Organization Name'])[1]/../div//input")
    WebElement Organization_Name_field;

    @FindBy(xpath = "(//*[text()='Category'])[1]/../div//select")
    WebElement Category_field;

    @FindBy(xpath = "(//*[text()='Status'])[1]/../div//select")
    WebElement Status_field;

    @FindBy(xpath = "(//*[text()='Designation'])[1]/../div//select")
    WebElement Designation_field;

    @FindBy(xpath = "(//*[text()='Experience in Current service in years'])[1]/../div//input")
    WebElement ExperienceYears_field;

    @FindBy(xpath = "(//*[text()='Experience in Current service in month'])[1]/../div//input")
    WebElement ExperienceMonths_field;

    @FindBy(xpath = "(//*[text()='Overall Experience In Years'])[1]/../div//input")
    WebElement OverallExperienceYears_field;

    @FindBy(xpath = "(//*[text()='Overall Experience In Months'])[1]/../div//input")
    WebElement OverallExperienceMonth_field;

    @FindBy(xpath = "(//*[text()='Date of Retirement'])[1]/../div//input")
    WebElement DateOfRetirement_field;

    @FindBy(xpath = "(//*[text()='Qualification'])[1]/../div//select")
    WebElement Qualification_field;

    @FindBy(xpath = "(//*[text()='Gross Salary [per month]'])[1]/../div//input")
    WebElement Gross_Salary_field;

    @FindBy(xpath = "(//*[text()='Deduction from Salary [per month]'])[1]/../div//input")
    WebElement Deduction_field;

    @FindBy(xpath = "(//*[text()='Residence'])[1]/../div//select")
    WebElement Residence_field;

    @FindBy(xpath = "(//*[text()='Recovery Mechanism'])[1]/../div//select")
    WebElement RecoveryMechanism_field;

    @FindBy(xpath = "(//*[text()='Nature Of Security'])[1]/../div//select")
    WebElement NatureOfSecurity_field;

    @FindBy(xpath = "(//*[text()='Select Salary account'])[1]/../div//select")
    WebElement SelectSalaryaccount_field;


    public void fillAllMandatoryFieldsOfBorrower(String Residence){
        /*Select select1=new Select(Occupation_Sub_Type_field);
        select1.selectByVisibleText(OccupationSubType);

        Organization_Name_field.sendKeys(OrganizationName);

        Select select2=new Select(Category_field);
        select2.selectByValue(Category);

        Select select3=new Select(Status_field);
        select3.selectByValue(Status);

        Select select4=new Select(Designation_field);
        select4.selectByValue(Designation);

        ExperienceYears_field.sendKeys(ExperienceYears);

        ExperienceMonths_field.sendKeys(ExperienceMonth);

        OverallExperienceYears_field.sendKeys(OverallExperienceYears);
        OverallExperienceMonth_field.sendKeys(OverallExperienceMonth);


        *//*Select select5=new Select(DateOfRetirement_field);
        select5.selectByValue(DateOfRetirement);
        DateOfRetirement_field.sendKeys(DateOfRetirement);*//*
       // DateOfRetirement_field.click();
        DateOfRetirement_field.sendKeys(DateOfRetirement);
        DateOfRetirement_field.sendKeys(Keys.ENTER);
        *//*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", DateOfRetirement);
        *//**//*Actions actions=new Actions(driver);
        actions.sendKeys(Keys.ENTER);
        actions.sendKeys(Keys.ENTER);*//**//*
        //DateOfRetirement_field.sendKeys(Keys.ENTER);*//*
        System.out.println("Done");


        Select select6=new Select(Qualification_field);
        select6.selectByValue(Qualification);

        Gross_Salary_field.sendKeys(GrossSalary);

        Deduction_field.sendKeys(Deduction);*/

        Select select7=new Select(Residence_field);
        select7.selectByValue(Residence);

       /* Select select8=new Select(RecoveryMechanism_field);
        select8.selectByValue(RecoveryMechanism);*/

       /* Select select9=new Select(NatureOfSecurity_field);
        //select9.selectByValue(NatureOfSecurity);
        select9.selectByIndex(0);*/

       /* Select select10=new Select(SelectSalaryaccount_field);
        //select10.selectByValue(SelectSalaryAccount);
        System.out.println("Okay");
        select10.selectByIndex(1);*/
    }
}
