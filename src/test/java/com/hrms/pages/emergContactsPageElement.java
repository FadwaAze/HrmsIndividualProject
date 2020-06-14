package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class emergContactsPageElement {
	
	@FindBy(xpath="//a[text()='Emergency Contacts']")
	public WebElement emergencyContBtn;
	
	@FindBy(css="input[id='btnAddContact']")
	public WebElement addBtn;
	
	@FindBy(css="input[id='emgcontacts_name']")
	public WebElement emgContactName;
	
	@FindBy(css="input[id='emgcontacts_relationship']")
	public WebElement relationship;
	
	@FindBy(css="input[id='emgcontacts_homePhone']")
	public WebElement emgHomePhone;
	
	@FindBy(css="input[id='emgcontacts_mobilePhone']")
	public WebElement emgMoblibe;
	
	@FindBy(css="input[id='emgcontacts_workPhone']")
	public WebElement emgWorkPhone;
	
	@FindBy(css="input[id='btnSaveEContact']")
	public WebElement EContactSaveBtn;
	
	@FindBy(xpath="//a[text()='Sara Scott']")
	public WebElement emgContact;
	
	public emergContactsPageElement(){
		PageFactory.initElements(BaseClass.driver, this);
	}
	

}
