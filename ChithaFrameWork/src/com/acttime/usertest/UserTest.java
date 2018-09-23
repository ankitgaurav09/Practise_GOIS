package com.acttime.usertest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.commonLib.BDriver;
import com.actitime.commonLib.ExcelLIb;
import com.actitime.commonLib.WebDriverCommonLib;
import com.actitime.pagelib.ActiveProjectAndCustomer;
import com.actitime.pagelib.EditCustomerInformation;
import com.actitime.projectSpecificLib.ProjectAndCustomerLib;
import com.actitime.projectSpecificLib.ProjectCommonLib;
//import com.gargoylesoftware.htmlunit.Page;

public class UserTest {
	// Object declaration
	ExcelLIb eLib;
	WebDriverCommonLib wLib;
	ProjectCommonLib pLib;
	ProjectAndCustomerLib cLib;
	ActiveProjectAndCustomer activProAndCutPage;
	EditCustomerInformation editCustPage;
	
	@BeforeClass
	public void configBeforeClass(){
		// create object initialization
		eLib = new ExcelLIb();
		wLib = new WebDriverCommonLib();
		pLib = new ProjectCommonLib();
		cLib = new ProjectAndCustomerLib();
		activProAndCutPage = PageFactory.initElements(BDriver.driver, ActiveProjectAndCustomer.class);
		
	}
	
	@BeforeMethod
	public void configBeforeMtd() throws InvalidFormatException, IOException{
		  // read the test data				
				String userName = eLib.getExcelData("Data" , 1 ,1);		
				String password = eLib.getExcelData("Data" , 1 ,2);		
				// step 1 : login to App
				pLib.loginToAPP(userName, password);

	}
	

	@Test
	public void createUserTest() throws InvalidFormatException, IOException, InterruptedException{

		
		//step 3 create User
		System.out.println("create User");
		
	}
	
	@Test
	public void modifyUserTest() throws InvalidFormatException, IOException, InterruptedException{
		//step 3 modify User
		System.out.println("modify User");
		
	}
	
	
	
	
	@Test 
	public void editUserTest(){
		System.out.println("edit User");
	}
	
	@AfterMethod
	public void configAfterMtd(){
		
		//step 6 : logout
		pLib.logOut();
	}
	
	
	
	@AfterClass
	public void configAfterclass(){
		BDriver.driver.quit();
	}
	
	
	
	
	
	
	
	

}
