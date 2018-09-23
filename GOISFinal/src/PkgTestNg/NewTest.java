package PkgTestNg;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import pageObjects.HomeGOIS;
import utility.Constant;
import appModules.SignIn_Action1;

public class NewTest {
	public WebDriver driver;
  @Test
  public void f() {
	  
      SignIn_Action1.Execute(driver, Constant.Username, Constant.Password);
  				}
  
  @Test
  public void f1()
  {
	    SignIn_Action1.Execute(driver, Constant.Username, Constant.Password);
  }
  
  @BeforeMethod
  public void beforeMethod() {

      driver = new FirefoxDriver();
	  driver.get(Constant.URL);
  }

  @AfterMethod
  public void afterMethod() {
	//use of pageOjects
	  HomeGOIS.LogOut(driver).click();
  }

}
 