package testCases;

import commonLib.BDriver;
import commonLib.WebDriverCommonLib;
//import pageObjects.LoginPO;
import projSpeCommonlib.SignIn_ActionLib;
import utility.Constants;


public class LoginToApp {

	public static void main(String[] args) {
	
		//WebDriver driver=new FirefoxDriver();
		//BDriver.driver;
		
		//driver.get("http://stag.goisllc.com/Accounts/login.aspx");
		BDriver.driver.get(Constants.URL);
		
		//here using common lib, first create object to the reference class
		//WebDriverCommonLib wcl=new WebDriverCommonLib();
		//wcl.waitForPageToLoad();
		//BDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverCommonLib.waitForPageToLoad();
		
		//syntax to create object to page factory
	/*	
	LoginPO loginPage=PageFactory.initElements(BDriver.driver, LoginPO.class);
	loginPage.getLoginEtd().sendKeys("ankitgaurav");
	loginPage.getPasswordEtd().sendKeys("ankit");
	loginPage.getLoginBtn().click();
		*/
		//Use of modular function, now page factory has been used inside SignIn_Action1
	SignIn_ActionLib.Execute(BDriver.driver, "ankitgaurav", "ankit");
		
	}

}
