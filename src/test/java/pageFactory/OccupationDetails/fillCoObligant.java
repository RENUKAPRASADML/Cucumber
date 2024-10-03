package pageFactory.OccupationDetails;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class fillCoObligant {
    WebDriver driver;
    public fillCoObligant(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//*[text()='Occupation Type'])[2]/../div//select")
    WebElement OccupationType_Field;

    @FindBy(xpath = "(//*[text()='Occupation Sub Type'])[2]/../div//select")
    WebElement Occupation_Sub_Type_field;

    @FindBy(xpath = "(//*[text()='Organization Name'])[2]/../div//input")
    WebElement Organization_Name_field;

    @FindBy(xpath = "(//*[text()='Category'])[2]/../div//select")
    WebElement Category_field;

    @FindBy(xpath = "(//*[text()='Status'])[2]/../div//select")
    WebElement Status_field;

    @FindBy(xpath = "(//*[text()='Designation'])[2]/../div//select")
    WebElement Designation_field;

    @FindBy(xpath = "(//*[text()='Experience in Current service in years'])[2]/../div//input")
    WebElement ExperienceYears_field;

    @FindBy(xpath = "(//*[text()='Experience in Current service in month'])[2]/../div//input")
    WebElement ExperienceMonths_field;

    @FindBy(xpath = "(//*[text()='Overall Experience In Years'])[2]/../div//input")
    WebElement OverallExperienceYears_field;

    @FindBy(xpath = "(//*[text()='Overall Experience In Months'])[2]/../div//input")
    WebElement OverallExperienceMonth_field;

    @FindBy(xpath = "(//*[text()='Date of Retirement'])[2]/../div//input")
    WebElement DateOfRetirement_field;

    @FindBy(xpath = "(//*[text()='Qualification'])[2]/../div//select")
    WebElement Qualification_field;

    @FindBy(xpath = "//*[@id=\"P_CP_OD_GrossSalary_Mon\"]")
            //(//*[text()='Gross Salary / Income [per month]'])[2]/../div//input
    WebElement Gross_Salary_field;

    @FindBy(xpath = "//*[@id=\"P_CP_OD_Deduction_Mon\"]")
    WebElement Deduction_field;

    @FindBy(xpath = "(//*[text()='Residence'])[2]/../div//select")
    WebElement Residence_field;

    @FindBy(xpath = "(//*[text()='Recovery Mechanism'])[2]/../div//select")
    WebElement RecoveryMechanism_field;

    @FindBy(xpath = "(//*[text()='Nature Of Security'])[2]/../div//select")
    WebElement NatureOfSecurity_field;

 /*   @FindBy(xpath = "(//*[text()='Select Salary account'])[2]/../div//select")
    WebElement SelectSalaryaccount_field;*/
 public void fillAllMandatoryAllFieldsOfBorrower(String OccupationType,String OccupationSubType,String OrganizationName,String Category,String Status,String Designation,String ExperienceYears,String ExperienceMonth,String OverallExperienceYears,String  OverallExperienceMonth,String DateOfRetirement,String Qualification,String GrossSalary,String Deduction,String Residence,String RecoveryMechanism,String NatureOfSecurity){
     {
         Select select=new Select(OccupationType_Field);
         select.selectByVisibleText(OccupationType);

         Select select1=new Select(Occupation_Sub_Type_field);
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


        /*Select select5=new Select(DateOfRetirement_field);
        select5.selectByValue(DateOfRetirement);
        DateOfRetirement_field.sendKeys(DateOfRetirement);*/
         // DateOfRetirement_field.click();
         DateOfRetirement_field.sendKeys(DateOfRetirement);
         DateOfRetirement_field.sendKeys(Keys.ENTER);
        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", DateOfRetirement);
        *//*Actions actions=new Actions(driver);
        actions.sendKeys(Keys.ENTER);
        actions.sendKeys(Keys.ENTER);*//*
        //DateOfRetirement_field.sendKeys(Keys.ENTER);*/
         System.out.println("Done");


         Select select6=new Select(Qualification_field);
         select6.selectByValue(Qualification);

         Gross_Salary_field.sendKeys(GrossSalary);

         Deduction_field.sendKeys(Deduction);

         Select select7=new Select(Residence_field);
         select7.selectByValue(Residence);

         Select select8=new Select(RecoveryMechanism_field);
         select8.selectByValue(RecoveryMechanism);

         //Select select9=new Select(NatureOfSecurity_field);
         //select9.selectByValue(NatureOfSecurity);
         //select9.selectByIndex(0);

     }}

}
