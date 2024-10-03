Feature: Retail Flow Pension
  Scenario Outline:: to check AUthentication and Verification
    Given user in product listing page and selects "<product name>"
    And click on Apply Now button
    When User navigates to Authentication screen enter "<mobile number>" and click send otp button
    Then User navigates to Verification screen - enter received otp of "<mobile number>" and click Validate button
    Then User selects Combination from dropdown and enter particular "<Combination value>"
    Then click on terms and condition and accept it
    Then click on Proceed button and user should navigate to Avail offer screen

    Examples:
    |product name                      |mobile number    |Combination value|


  Scenario Outline: to check whether Pension loan exist
    Given user when click on proceed button check whether navigate to Resume screen or Loan details screen
    Then if in Resume screen then click on Resume button and Navigate to respective screen based on "<product name>" and "<mobile number>"
    Examples:
      | product name | mobile number |
      |<product name>| <mobile number>|


  Scenario Outline: To check Pension Loan details screen
    Given when user in loan details screen
    Then check auto populate value of product,subproduct and RLLR
    Then select value from dropdown for "<Purpose>","<ROI Type>" and enter value for "<Req loan amount>"
    Then click on Next button
    Examples:
      | Purpose     | ROI Type | Preferred EMI Date | Req loan amount |
      |PERS         | Floating | 2                  | 500000          |

  Scenario Outline: To check Pension Occupation details screen--Borrower
    Given when user in Occupation details screen
    Then update all Occupation Details of borrower details: "<Residence>"
    Examples:
      | Occupation Sub Type  | Organization Name | Category           | Status    | Designation       | Experience in Current service in years | Experience in Current service in month | Overall Experience In Years | Overall Experience In Months | Date of Retirement   | Qualification | Gross Salary [per month] | Deduction from Salary [per month] | Residence | Recovery Mechanism                | Nature Of Security                                                 | Select Salary account |
      | Member of Parliament | Organization      | Central Government | Permanent | Junior Management | 1                                      | 5                                      | 5                           | 5                            | 02/03/2028           | Graduate      | 50000                    | 500                               | Others    | Salary recovery mandate available | Only Third party personal Guarantee/Co-obligation/waiver permitted | 62022550008421         |

   Scenario Outline: To check Pension Occupation details screen--Co-Obligant
    Then enter Co-Obligant "<Relationship with borrower>", "<Mobile Number>", "<Customer ID>" and click validate button
    Then click ok button on alert and fill co obligant details
     Examples:
       |Relationship with borrower | Mobile Number | Customer ID |
       | Brother                   |9025876984     | 97982873    |

  Scenario Outline: To check Pension Occupation details screen--Co-Obligant all details
    Then update all co-obligant details: "<co_Occupation Type>", "<co_Occupation Sub Type>", "<co_Organization Name>","<co_Category>", "<co_Status>","<co_Designation>", "<co_Experience in Current service in years>","<co_Experience in Current service in month>", "<co_Overall Experience In Years>","<co_Overall Experience In Months>", "<co_Date of Retirement>","<co_Qualification>","<co_Gross Salary [per month]>", "<co_Deduction from Salary [per month]>","<co_Residence>","<co_Recovery Mechanism>", "<co_Nature Of Security>"
    Then click on Next button and Navigate to InPrincipal screen
    Examples:
     | co_Occupation Type | co_Occupation Sub Type | co_Organization Name | co_Category        | co_Status | co_Designation    | co_Experience in Current service in years | co_Experience in Current service in month | co_Overall Experience In Years | co_Overall Experience In Months | co_Date of Retirement | co_Qualification | co_Gross Salary [per month] | co_Deduction from Salary [per month] | co_Residence | co_Recovery Mechanism             | co_Nature Of Security                                              |
     | Salaried           | Member of Parliament   | Organization         | Central Government | Permanent | Junior Management | 2                                         | 5                                         | 6                              | 5                               | 02/03/2028            | Graduate         | 500000                       | 5000                                 | Others       | Salary recovery mandate available | Only Third party personal Guarantee/Co-obligation/waiver permitted |

  Scenario: to check functionality of InPrincipal screen
    Given user in InPrincipal screen check Loan Amount,Tenure,ROI, EMI
    Then to Customize Your Final Personal Loan-change the value in both Loan amount and Tenure slider
    Then check same value is reflecting in Loam Amount and Tenure textbox
    Then Change the value in Loam Amount and Tenure textbox less than eligible value
    Then check same value reflecting in both Loan amount and Tenure slider
    Then select checkbox of I wish to apply for Loan Tenure elongation
    Then click on Next button and Naviagte to Document upload screen

  Scenario Outline: To upload the document of Borrower PAN Card
    Given user in Document upload screen for Pension to upload borrower PAN Card document "<pathOfFile1>" "<pathOfFile2>" "<pathOfFile3>" "<pathOfFile4>"
    Examples:
      | pathOfFile1 |pathOfFile2 | pathOfFile3|pathOfFile4|
      |C:\Users\renukaprasad.ml\OneDrive - Newgen\Pictures\Screenshots\Screenshot (2).png|C:\Users\renukaprasad.ml\OneDrive - Newgen\Pictures\Screenshots\Screenshot (3).png|C:\Users\renukaprasad.ml\OneDrive - Newgen\Pictures\Screenshots\Screenshot (4).png|C:\Users\renukaprasad.ml\OneDrive - Newgen\Pictures\Screenshots\Screenshot 2023-12-18 124519.png|

  Scenario Outline: To upload the document of Borrower PPO Order Pension Copy
    Given user in Document upload screen for Pension to upload borrower PPO Order Pension Copy document "<pathOfFile>"
    Examples:
      | pathOfFile |
      |C:\Users\renukaprasad.ml\OneDrive - Newgen\Pictures\Screenshots\Screenshot (2).png|

  Scenario Outline: To upload the document of Borrower Passport size Photograph
    Given user in Document upload screen for Pension to upload borrower Passport size Photograph document "<pathOfFile>"
    Examples:
      | pathOfFile |
      |C:\Users\renukaprasad.ml\OneDrive - Newgen\Pictures\Screenshots\Screenshot (2).png|

  Scenario Outline: To upload the document of Borrower Aadhar Card
    Given user in Document upload screen for Pension to upload borrower Aadhar Card document "<pathOfFile>"
    Examples:
      | pathOfFile |
      |C:\Users\renukaprasad.ml\OneDrive - Newgen\Pictures\Screenshots\Screenshot (2).png|


  Scenario: User on documents upload screen
    Given After document upload click on Next button
    Then print the alert message and click Ok button












