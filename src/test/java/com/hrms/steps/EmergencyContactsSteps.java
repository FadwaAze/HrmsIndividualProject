package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EmergencyContactsSteps extends CommonMethods {
	@Given("admin is logged with valid admin credentials and navigates to EmployeeListPage")
	public void admin_is_logged_with_valid_admin_credentials_and_navigates_to_EmployeeListPage() {
	    sendText(login.username,ConfigsReader.getProperty("username"));
	    sendText(login.password, ConfigsReader.getProperty("password"));
	    click(login.loginBtn);
	    wait(2);
	    click(dashboard.PIM);
	    click(dashboard.empListPage); 
	    wait(3);
	}

	@Given("admin navigate to employee with id number {string}, click on Emergency Contacts and click on add button")
	public void admin_navigate_to_employee_with_id_number_click_on_Emergency_Contacts_and_click_on_Add_Button(String empID) {
	    sendText(viewEmp.empID, empID);
	    click(viewEmp.searchBtn);
	    wait(2);
	    
	    jsClick(viewEmp.specificID);
	    wait(2);
	    
	    click(emrgContacts.emergencyContBtn);
	    
	    click(emrgContacts.addBtn);
	    wait(2);
	    
	}

	@When("admin enters employee emergency contacts {string}, {string}, {string}, {string} and {string}")
	public void admin_enters_employee_emergency_contacts_and(String name, String relationship, String homePhone, String Mobile, String workPhone) {
		sendText(emrgContacts.emgContactName, name);
		sendText(emrgContacts.relationship, relationship);
		sendText(emrgContacts.emgHomePhone, homePhone);
		sendText(emrgContacts.emgMoblibe, Mobile);
		sendText(emrgContacts.emgWorkPhone, workPhone);
		
		wait(3);
		
		
	}

	@When("admin click save button")
	public void admin_click_save_button() {
		
		jsClick(emrgContacts.EContactSaveBtn);
	}

	@Then("{string} is added successfully")
	public void and_is_added_successfully(String name) {
	    String actual=emrgContacts.emgContact.getText();
	    String expected=name;
	    Assert.assertEquals("Emergency contact is not addedd successfully", expected, actual);
	    
	    
	}

}
