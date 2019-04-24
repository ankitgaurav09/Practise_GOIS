package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


import commonLib.BDriver;


public class NewTestBrowserSession {
  @Test
  public void f1() {
	  WebDriver driver = new FirefoxDriver();
	    //Goto guru99 site
	    driver.get("http://demo.guru99.com/V4/");
  }
  @Test
  public void f2() {
	  WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.facebook.com");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	 System.out.println("Before methods executed ");
  }

  @AfterMethod
  public void afterMethod() {
	  //BDriver.driver.quit();
  }

}
