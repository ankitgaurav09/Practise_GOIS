package com.actitime.pagelib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPage {

	
	@FindBy(className="logoutImg")
	private WebElement logoutImg;

	public WebElement getLogoutImg() {
		return logoutImg;
	}
	
	
}
