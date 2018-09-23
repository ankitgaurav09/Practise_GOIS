package com.actitime.pagelib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveProjectAndCustomer {
	
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement addNewCustomerBtn;
	
	@FindBy(xpath="//input[@value='Add New Project']")
	private WebElement addNewProjectBtn;
	
	@FindBy(xpath="//select[@name='recordsPerPage']")
	private WebElement selCustLst;
	

	public WebElement getAddNewCustomerBtn() {
		return addNewCustomerBtn;
	}

	public WebElement getAddNewProjectBtn() {
		return addNewProjectBtn;
	}
	
	public WebElement getSelCustLst() {
		return selCustLst;
	}
}
