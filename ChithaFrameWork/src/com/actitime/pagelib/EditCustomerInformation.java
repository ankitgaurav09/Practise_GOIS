package com.actitime.pagelib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCustomerInformation {
	
	
	@FindBy(xpath="//td[contains(text(),'d customer:')]/following-sibling::td/span")
	private WebElement customerNameInfo;

	public WebElement getCustomerNameInfo() {
		return customerNameInfo;
	}
	
	
}
