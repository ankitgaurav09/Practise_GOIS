package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeGOIS {
	
	private static WebElement element=null;
	//private static WebDriver element1=null;
	
	public static WebElement LogOut(WebDriver driver)
	{
		element=driver.findElement(By.id("lnkLogOut"));
		return element;
	}
//	public static WebDriver Implicite(WebDriver driver)
//	{
//		element1=(WebDriver) driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		return element1;
//	}
	
	

}
