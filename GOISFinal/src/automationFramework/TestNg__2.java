package automationFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.HomeGOIS;
import utility.Constant;
import appModules.HomeAction;
import appModules.SignIn_Action1;

public class TestNg__2 {
	public WebDriver driver;
	@Test
	public void f() throws IOException, InterruptedException {
	  
	  SignIn_Action1.Execute(driver, Constant.Username, Constant.Password);
	  HomeAction.mouseOver(driver,"//div[@id='top-menu']/ul/li[8]/a");
		Thread.sleep(4000);
		
		//To mouse over Imports under SYSTEM menu 
		HomeAction.mouseOverAndclick2(driver, "//div[@id='top-menu']/ul/li[8]/ul/li[5]/a", "//a[@href='/Utility/ImportCustomer']");
		
		driver.findElement(By.id("btnContinue")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//clicking on Browse button
		driver.findElement(By.id("btnFile")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Uploading .csv file
		Runtime.getRuntime().exec("D:/Program Files (x86)/AutoIt3/CustImp1.exe");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Clicking on Upload button
		driver.findElement(By.id("btnUpload")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		//Clicking on Continue button to start Import

		driver.findElement(By.id("btnStartImport")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
  }
  
  @BeforeMethod
  public void beforemethod() {
	  driver.get(Constant.URL);
  }

  @AfterMethod
  public void aftermethod() {
	  HomeGOIS.LogOut(driver).click();
  }
  
  }



