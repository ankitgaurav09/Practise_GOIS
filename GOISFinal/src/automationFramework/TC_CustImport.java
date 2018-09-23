package automationFramework;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import appModules.HomeAction;
import appModules.SignIn_Action;

public class TC_CustImport {

		public static void main(String[] args) throws InterruptedException, IOException {
			
			WebDriver driver=new FirefoxDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
			driver.get("http://goismvc1.metaoptionllc.com");
			
			 // Use your Module SignIn now
			SignIn_Action.Execute(driver);
			
			//To mouse over SYSTEM menu 
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

}
