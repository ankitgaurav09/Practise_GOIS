package com.actitime.projectandcustomertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.pagelib.Login;

public class SampleTest {
	
	
	@Test 
	public void samplePageTest(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://deepu-pc/login.do");
		
		//syntax to create object to page factory
		
		Login loginPage = PageFactory.initElements(driver, Login.class);
		loginPage.getUserNameEdt().sendKeys("admin");
	
		loginPage.getPasswordEdt().sendKeys("manager");
		loginPage.getLoginBtn().click();
		
	}

}
