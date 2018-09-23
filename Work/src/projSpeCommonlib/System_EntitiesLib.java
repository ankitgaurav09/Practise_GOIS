package projSpeCommonlib;

import org.openqa.selenium.support.PageFactory;

import commonLib.BDriver;
import commonLib.WebDriverCommonLib;
//import pageObjects.DashboardPO;
import pageObjects.EntitiesDropdownPO;
//import commonLib.WebDriverCommonLib;


public class System_EntitiesLib extends WebDriverCommonLib{
	EntitiesDropdownPO EDPO1=PageFactory.initElements(BDriver.driver, EntitiesDropdownPO .class);
	
	public void SystemMouseOver_EntitiesClick(){
	mouseOverAndclick2(BDriver.driver, "//div[@id='top-menu']/ul/li[8]/a/span", "//div[@id='top-menu']/ul/li[8]/ul/li[1]/a");
	}
	
	
	
	
}
	

	


