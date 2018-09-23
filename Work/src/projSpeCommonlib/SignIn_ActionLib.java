package projSpeCommonlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//import commonLib.BDriver;

import pageObjects.LoginPO;
//import pageObjects.LoginGOIS;

public class SignIn_ActionLib {
	
	
	
	public static void Execute (WebDriver driver,String sUsername,String sPassword)
	{
		LoginPO loginPage=PageFactory.initElements(driver, LoginPO.class);
		loginPage.getLoginEtd().sendKeys(sUsername);
		loginPage.getPasswordEtd().sendKeys(sPassword);
		loginPage.getLoginBtn().click();
		
	}
	

}
