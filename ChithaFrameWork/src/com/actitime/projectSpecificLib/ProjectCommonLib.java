package com.actitime.projectSpecificLib;

import org.openqa.selenium.support.PageFactory;
import com.actitime.commonLib.BDriver;
import com.actitime.commonLib.WebDriverCommonLib;
import com.actitime.pagelib.CommonPage;
import com.actitime.pagelib.Login;

public class ProjectCommonLib extends WebDriverCommonLib{
	Login loginPage = PageFactory.initElements(BDriver.driver, Login.class);
	CommonPage commonPage = PageFactory.initElements(BDriver.driver,CommonPage.class);
	
	public void loginToAPP(String userName , String Pasword){
		BDriver.driver.get("http://stag.metaoptionllc.com");
		loginPage.getUserNameEdt().sendKeys(userName);
		loginPage.getPasswordEdt().sendKeys(Pasword);
		loginPage.getLoginBtn().click();
		waitForPageToLoad();
	}
	
	public void logOut(){
		commonPage.getLogoutImg().click();
		waitForPageToLoad();
	
	}

}
