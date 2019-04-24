package testCases;



	import java.io.IOException;

	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.AfterMethod;

	
	import utility.Constants;
	import commonLib.BDriver;
	import commonLib.WebDriverCommonLib;

	public class Test_TestNg1  {
		
	  @Test
	  public void f() throws IOException,InterruptedException {
		  System.out.println("Test Method executed 1");
		  
			  //SignIn_ActionLib.Execute(BDriver.driver, "ankitgaurav", "ankit");
			  
		  }
		  
	  @BeforeMethod
	  public void beforeMethod() {
		  
		  BDriver.driver.get(Constants.URL);
		  WebDriverCommonLib.waitForPageToLoad();
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("TestNg2 after method executed");
		 // BDriver.driver.quit();
		  
	  }

	}



