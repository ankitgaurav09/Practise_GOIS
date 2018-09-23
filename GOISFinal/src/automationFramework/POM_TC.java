package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.HomeGOIS;
import pageObjects.LoginGOIS;

public class POM_TC {

	public static void main(String[] args) {
	
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("http://goismvc1.metaoptionllc.com");
		
		//use of pageOjects
		LoginGOIS.LoginID(driver).sendKeys("acc6");
		LoginGOIS.Password(driver).sendKeys("123456");
		LoginGOIS.LoginBtn(driver).click();
		HomeGOIS.LogOut(driver).click();

	}

}
