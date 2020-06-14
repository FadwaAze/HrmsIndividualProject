package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ContactDetailsPageElement {
	@FindBy(xpath="//a[text()='Contact Details']")
	public WebElement contactDetailsBtn;
	
	@FindBy(xpath="//input[@id='contact_street1']")
	public WebElement addressStreet1;
	
	@FindBy(xpath="//input[@id='contact_street2']")
	public WebElement addressStreet2;
	
	@FindBy(xpath="//input[@id='contact_city']")
	public WebElement city;
	
	@FindBy(xpath="//input[@id='contact_province']")
	public WebElement stateProvince;
	
	@FindBy(xpath="//input[@id='contact_emp_zipcode']")
	public WebElement zipPostalCode;
	
	@FindBy(xpath="//select[@id='contact_country']")
	public WebElement country;
	
	@FindBy(css="input[id='contact_emp_hm_telephone']")
	public WebElement homePhone;
	
	@FindBy(css="input[name*='mobile']")
	public WebElement mobile;
	
	@FindBy(css="input[name*='work_te']")
	public WebElement workPhone;
	
	@FindBy(css="input[name*='work_emai']")
	public WebElement workEmail;
	
	@FindBy(css="input[name*='oth_emai']")
	public WebElement otherEmail;
	
	@FindBy(css="input[id='btnSave']")
	public WebElement editBtn;
	
	@FindBy(xpath="//input[@id='btnSave']")
	public WebElement contactSaveBtn;
	
	public ContactDetailsPageElement() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	
	
	
	
	

}
