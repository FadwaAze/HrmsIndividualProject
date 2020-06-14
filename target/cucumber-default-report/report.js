$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/EmergencyContacts.feature");
formatter.feature({
  "name": "Add employee Emergency Contacts",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Sprint1"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Add employee Emergency Contacts",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "admin is logged with valid admin credentials and navigates to EmployeeListPage",
  "keyword": "Given "
});
formatter.step({
  "name": "admin navigate to employee with id number \"11450\", click on Emergency Contacts and click on add button",
  "keyword": "And "
});
formatter.step({
  "name": "admin enters employee emergency contacts \"\u003cName\u003e\", \"\u003cRelationship\u003e\", \"\u003cHome Telephone\u003e\", \"\u003cMobile\u003e\" and \"\u003cWork Telephone\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "admin click save button",
  "keyword": "And "
});
formatter.step({
  "name": "\"\u003cName\u003e\" is added successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "Relationship",
        "Home Telephone",
        "Mobile",
        "Work Telephone"
      ]
    },
    {
      "cells": [
        "Sara Scott",
        "Spouse",
        "703-425-8790",
        "572-345-7810",
        "703-124-2314"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Add employee Emergency Contacts",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sprint1"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "admin is logged with valid admin credentials and navigates to EmployeeListPage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.EmergencyContactsSteps.admin_is_logged_with_valid_admin_credentials_and_navigates_to_EmployeeListPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin navigate to employee with id number \"11450\", click on Emergency Contacts and click on add button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmergencyContactsSteps.admin_navigate_to_employee_with_id_number_click_on_Emergency_Contacts_and_click_on_Add_Button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin enters employee emergency contacts \"Sara Scott\", \"Spouse\", \"703-425-8790\", \"572-345-7810\" and \"703-124-2314\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.EmergencyContactsSteps.admin_enters_employee_emergency_contacts_and(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin click save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmergencyContactsSteps.admin_click_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Sara Scott\" is added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.EmergencyContactsSteps.and_is_added_successfully(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Add employee Emergency Contacts");
formatter.after({
  "status": "passed"
});
});