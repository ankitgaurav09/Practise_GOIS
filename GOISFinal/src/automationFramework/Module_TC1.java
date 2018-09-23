package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utility.Constant;
import appModules.HomeAction;
import appModules.SignIn_Action1;

public class Module_TC1{

	public static void main(String[] args) {
	
		WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constant.URL);
        
		driver.get("http://goismvc1.metaoptionllc.com");
		
		// Pass the Arguments (Username and Password) to this method
		SignIn_Action1.Execute(driver, "ankupre1", "123456");
		
		//mouse over method calling
		HomeAction.mouseOverAndclick1(driver, "//div[@id='top-menu']/ul/li[2]/a/span","AddProduct");
		
		//Select method calling
			try{
				HomeAction.select(driver, "ddlOrg", "My Organization");
				driver.findElement(By.xpath("//input[@id='btnSelect']")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				}
			catch(Exception e)
			   {
				   System.out.println(e);  
				   System.out.println("rest of the code...");  
				   //e.printStackTrace();
				   //throw(e);
			   }	 
	
			
		//HomeGOIS.LogOut(driver).click();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
