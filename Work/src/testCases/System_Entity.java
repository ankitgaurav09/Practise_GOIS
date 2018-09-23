package testCases;

//import org.openqa.selenium.support.PageFactory;

import commonLib.BDriver;
import commonLib.WebDriverCommonLib;
import projSpeCommonlib.CustomerLib;
import projSpeCommonlib.SignIn_ActionLib;
import projSpeCommonlib.System_EntitiesLib;
import utility.Constants;

public class System_Entity {

	public static void main(String[] args) throws InterruptedException  {
		
		BDriver.driver.get(Constants.URL);
		WebDriverCommonLib.waitForPageToLoad();
		SignIn_ActionLib.Execute(BDriver.driver, "ankitgaurav", "ankit");
		
		System_EntitiesLib SE=new System_EntitiesLib();
		CustomerLib cl=new CustomerLib();
		
		SE.SystemMouseOver_EntitiesClick();
		cl.NavigateToCustomer();
		cl.AddCustomer("Customer Eclipse2");
		
	}

}
