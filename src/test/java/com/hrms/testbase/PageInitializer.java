package com.hrms.testbase;



import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.ContactDetailsPageElement;
import com.hrms.pages.DashBoardPageElements;
import com.hrms.pages.LoginpageElements;
import com.hrms.pages.PersonalDetailsPageElement;
import com.hrms.pages.ViewEmployeePageElements;
import com.hrms.pages.emergContactsPageElement;


// initialize ALL pages class and stores references in static variables
//that will be called/used in test class
public class PageInitializer extends BaseClass{

	public static LoginpageElements login;
	public static DashBoardPageElements dashboard;
	public static AddEmployeePageElements addEmp;
	public static PersonalDetailsPageElement pDetails;
	public static ViewEmployeePageElements viewEmp;
	public static ContactDetailsPageElement contactDetails;
	public static emergContactsPageElement emrgContacts;
	
	public static void initialize() {
		login = new LoginpageElements();
		dashboard = new DashBoardPageElements();
		addEmp = new AddEmployeePageElements();
		pDetails = new PersonalDetailsPageElement();
		viewEmp = new ViewEmployeePageElements();
		
		contactDetails= new ContactDetailsPageElement();
		emrgContacts = new emergContactsPageElement ();
		

	}

}
