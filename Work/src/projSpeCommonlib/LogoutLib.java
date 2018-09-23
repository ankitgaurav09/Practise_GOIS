package projSpeCommonlib;

import org.openqa.selenium.support.PageFactory;

import commonLib.BDriver;
import commonLib.WebDriverCommonLib;
import pageObjects.DashboardPO;

public class LogoutLib {
	
	public void Logout(){
		DashboardPO DPO1=PageFactory.initElements(BDriver.driver, DashboardPO.class);
		DPO1.getLogoutLnk().click();
		WebDriverCommonLib.waitForPageToLoad();
	}
}
