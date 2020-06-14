#Author: fadwa.23@syntax.com
@Sprint1
Feature: Employee contact details

  @ContactD
  Scenario Outline: Add employee contact details
    Given admin is logged with valid admin credentials and navigates to EmployeeListPage
    And admin navigate to employee with id number "11450", click on Contact Details and click on edit button
    When admin enters employee contact Details "<Adress Street1>", "<City>", "<State/province>", "<Zip/Postal Code>" and "<Country>"
    And admin enters more employee contact Details "<Home Telephone>", "<Mobile>","<Work Telephone>", "<Work Email>" and "<Other Email>" and click save button
    Then employee contact Details is added successfully

    Examples: 
      | Adress Street1          | City    | State/province | Zip/Postal Code | Country       | Home Telephone | Mobile       | Work Telephone | Work Email         | Other Email       |
      | 4589 Black Lane Apt 200 | Fairfax | VA             |           22042 | United States | 703-234-1367   | 571-665-2134 | 703-456-0679   | JohnDeo@syntax.com | JohnDeo@gmail.com |
