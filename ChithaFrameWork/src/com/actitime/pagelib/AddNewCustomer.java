package com.actitime.pagelib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewCustomer {
	
	@FindBy(name="name")
	private WebElement customerNameEdt;
	
	@FindBy(name="description")
	private WebElement customerdescriptionEdt;

	@FindBy(xpath="//input[@value='Create Customer']")
	private WebElement createCustomerBtn;

	public WebElement getCustomerNameEdt() {
		return customerNameEdt;
	}

	public WebElement getCustomerdescriptionEdt() {
		return customerdescriptionEdt;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	
	
	

}
