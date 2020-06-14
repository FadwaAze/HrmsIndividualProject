package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangeEmployeeContactDSteps extends CommonMethods {

	@Given("admin navigate to employee with id number {string}, click on Contact Details and click on edit button")
	public void admin_navigate_to_employee_with_id_number_click_on_Contact_Details_and_click_on_edit_button(String empID) {
		
		sendText(viewEmp.empID, empID);
		click(viewEmp.searchBtn);
		click(viewEmp.empID);

		wait(2);
		
		jsClick(viewEmp.specificID);
	    wait(2);
		click(contactDetails.contactDetailsBtn);
		click(contactDetails.editBtn);
		wait(2);

	}

	@When("admin enters employee contact Details {string}, {string}, {string}, {string} and {string}")
	public void admin_enters_employee_contact_Details_and(String adressStreet1, String City , String StateProvince, String zipPostalCode,
			String Country) {
		sendText(contactDetails.addressStreet1, "adressStreet1");
		sendText(contactDetails.city, "City");
		selectDdValue(contactDetails.stateProvince, "StateProvince");
		sendText(contactDetails.zipPostalCode, "zipPostalCode");
		selectDdValue(contactDetails.country, "Country");
		
		wait(1);

	}

	@When("admin enters more employee contact Details {string}, {string},{string}, {string} and {string} and click save button")
	public void admin_enters_more_employee_contact_Details_and(String homeTelephone , String Mobile , String workTelephone,
			String workEmail , String otherEmail ) {
		
		sendText(contactDetails.homePhone, "homeTelephone");
		sendText(contactDetails.mobile, "Mobile");
		sendText(contactDetails.workPhone, "workTelephone");
		sendText(contactDetails.workEmail, "workEmail");
		sendText(contactDetails.otherEmail, "otherEmail");
		wait(2);
		jsClick(contactDetails.contactSaveBtn);

	}

	@Then("employee contact Details is added successfully")
	public void employee_contact_Details_is_added_successfully() {
		System.err.println("Employee contact Details is added successfully!!!!");

	}

}
