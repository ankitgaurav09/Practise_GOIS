package com.actitime.projectandcustomertest;

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

public class ProjectAndCustomerTest {
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
		editCustPage = PageFactory.initElements(BDriver.driver, EditCustomerInformation.class);
		
	}
	
	@BeforeMethod
	public void configBeforeMtd() throws InvalidFormatException, IOException{
		  // read the test data				
				String userName = eLib.getExcelData("Data" , 1 ,2);		
				String password = eLib.getExcelData("Data" ,1 , 3);		
				// step 1 : login to App
				pLib.loginToAPP(userName, password);
				//step 2 : navigate to project And customer Page
				cLib.navigateToProjAndCustPage();
		
	}
	

	@Test
	public void createCustomerTest() throws InvalidFormatException, IOException, InterruptedException{
		String customerName = eLib.getExcelData("Data", 1, 4);
		
		//step 3 :  create Customer
		cLib.creatCustomer(customerName);
		
		// step 4 : navigate to customer details page
		WebElement wbsel = activProAndCutPage.getSelCustLst();
		wLib.select(wbsel, "100");
		wLib.waitForLinkPresent(customerName);
		BDriver.driver.findElement(By.linkText(customerName)).click();
		wLib.waitForPageToLoad();
		
		// step 5 : verify
		String actCustomerName = editCustPage.getCustomerNameInfo().getText();
		Assert.assertEquals(actCustomerName, customerName ,"customer is not displayed");
		
	}
	
	@Test
	public void verifyCustomerDetailsInWebTableTest() throws InvalidFormatException, IOException, InterruptedException{
		String customerName = eLib.getExcelData("Data", 2, 4);
		
		//step 3 :  create Customer
		cLib.creatCustomer(customerName);
		
		// step 4 : Click on customer name in cusomer detail Webtable
		
	}
	
	
	@AfterMethod
	public void configAfterMtd(){
		
		//step 6 : logout
		pLib.logOut();
	}
	
	
	
	@AfterClass
	public void configAfterclass(){
		//BDriver.driver.quit();
	}
	
	
}
