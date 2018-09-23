package projSpeCommonlib;

import org.openqa.selenium.support.PageFactory;

import pageObjects.AddCustomerPO;
import pageObjects.EntitiesDropdownPO;
import commonLib.BDriver;
import commonLib.WebDriverCommonLib;

public class CustomerLib extends WebDriverCommonLib  {
	
	EntitiesDropdownPO EDPO1=PageFactory.initElements(BDriver.driver, EntitiesDropdownPO .class);
	AddCustomerPO ACO=PageFactory.initElements(BDriver.driver, AddCustomerPO.class);
	
	public void NavigateToCustomer() throws InterruptedException{
	select(EDPO1.getEntDropdown(), "Customer");
	waitForPageToLoad();
	waitSleep();
	}
	
	
	public void AddCustomer(String cname)
	{
		ACO.getAddCustLink().click();
		waitForPageToLoad();
		select(ACO.getBUDrop(), "My Business Unit");
		ACO.getCustName().sendKeys(cname);
		ACO.getSaveBtn().click();
		waitForPageToLoad();

		if (BDriver.driver.getPageSource().contains(cname)){
			System.out.println("Customer added successfully" );
 		}
 		else{
 			System.out.println("Not Added!");
 		}
   }
		
	}


	

