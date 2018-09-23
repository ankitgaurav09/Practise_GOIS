package testCases;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import commonLib.BDriver;
import commonLib.WebDriverCommonLib;
import projSpeCommonlib.CustomerLib;
import projSpeCommonlib.SignIn_ActionLib;
import projSpeCommonlib.LogoutLib;
import projSpeCommonlib.System_EntitiesLib;
import utility.Constants;

public class TestCase1 {
	//object declaration
	LogoutLib lol;
	CustomerLib cl;
	System_EntitiesLib SE;
	SignIn_ActionLib sl;

 
  @BeforeMethod
  public void configBeforeMtd() {
	  //login to app
	  //no need to crate object of this class as its method is declared as static
	  BDriver.driver.get(Constants.URL);
	  WebDriverCommonLib.waitForPageToLoad();
	  SignIn_ActionLib.Execute(BDriver.driver, "ankitgaurav", "ankit");
	  //WebDriverCommonLib.waitForPageToLoad();
  }
  
  @Test
   public void AddCstmrTest() throws NullPointerException,IOException, InterruptedException {
 	  
 		SE.SystemMouseOver_EntitiesClick();
 		cl.NavigateToCustomer();
 		cl.AddCustomer("A1");
 		
// 		if (BDriver.driver.getPageSource().contains("Customer100")){
// 			System.out.println("Customer added successfully" );
// 		}
// 		else{
// 			System.out.println("Not Added!");
// 		}
   }
   
 

  @AfterMethod
  public void configAfterMtd() {
	  //logout from app
	  //here since LogoutLib class contains non static method, hence here we need to create object of LogoutLib
	 lol.Logout();
  }
  
  @BeforeClass
  public void beforeClass(){
  lol=new LogoutLib();
  cl=new CustomerLib();
  SE=new System_EntitiesLib();
  sl=new SignIn_ActionLib();
  }

	@AfterClass
	public void configAfterclass(){
		//BDriver.driver.quit();
		System.out.println("pass");
	}
}
