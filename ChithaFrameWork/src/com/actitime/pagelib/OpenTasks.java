package com.actitime.pagelib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTasks {
	
	@FindBy(linkText="Projects & Customers")
	private WebElement projAndCustLnk;
	
	@FindBy(linkText="Reports")
	private WebElement reportLnk;
	
	@FindBy(linkText="Users")
	private WebElement userLnk;

	public WebElement getProjAndCustLnk() {
		return projAndCustLnk;
	}

	public WebElement getReportLnk() {
		return reportLnk;
	}

	public WebElement getUserLnk() {
		return userLnk;
	}
	
	
	
}
