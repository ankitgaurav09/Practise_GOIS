package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import pageObjects.HomeGOIS;
// Import package appModule.*
import appModules.SignIn_Action;

public class Module_TC {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
		driver.get("http://goismvc1.metaoptionllc.com");
		
		 // Use your Module SignIn now
		SignIn_Action.Execute(driver);
		
		System.out.println("Login successfully, Now loging Out");
		
		HomeGOIS.LogOut(driver).click();

	}

}
