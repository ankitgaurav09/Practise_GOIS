package com.actitime.projectSpecificLib;

import org.openqa.selenium.support.PageFactory;

import com.actitime.commonLib.BDriver;
import com.actitime.commonLib.WebDriverCommonLib;
import com.actitime.pagelib.ActiveProjectAndCustomer;
import com.actitime.pagelib.AddNewCustomer;
import com.actitime.pagelib.OpenTasks;

public class ProjectAndCustomerLib extends WebDriverCommonLib{
	
	OpenTasks openTaskPage = PageFactory.initElements(BDriver.driver, OpenTasks.class);
	ActiveProjectAndCustomer actProAndCustPage = PageFactory.initElements(BDriver.driver,ActiveProjectAndCustomer.class);
	AddNewCustomer addCustPage = PageFactory.initElements(BDriver.driver,AddNewCustomer.class);
	
	
	
	public void navigateToProjAndCustPage(){
		
		openTaskPage.getProjAndCustLnk().click();
		waitForPageToLoad();		
	}
	
	public void creatCustomer(String customerName){
		actProAndCustPage.getAddNewCustomerBtn().click();
		waitForPageToLoad();
		addCustPage.getCustomerNameEdt().sendKeys(customerName);
		addCustPage.getCustomerdescriptionEdt().sendKeys("MY customer");
		addCustPage.getCreateCustomerBtn().click();
		waitForPageToLoad();
	}
	

}
