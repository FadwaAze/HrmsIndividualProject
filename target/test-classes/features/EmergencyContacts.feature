#Author: FadwaAzeroual@syntax.com
@Sprint1 
Feature: Add employee Emergency Contacts
@smoke
  Scenario Outline: Add employee Emergency Contacts
    Given admin is logged with valid admin credentials and navigates to EmployeeListPage
    And admin navigate to employee with id number "11450", click on Emergency Contacts and click on add button
    When admin enters employee emergency contacts "<Name>", "<Relationship>", "<Home Telephone>", "<Mobile>" and "<Work Telephone>"
    And admin click save button
    Then "<Name>" is added successfully

    Examples: 
      | Name       | Relationship | Home Telephone | Mobile       | Work Telephone |
      | Sara Scott | Spouse       | 703-425-8790   | 572-345-7810 | 703-124-2314   |
