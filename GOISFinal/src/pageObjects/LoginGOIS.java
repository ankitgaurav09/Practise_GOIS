package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginGOIS {
	
	private static WebElement element=null;

	public static WebElement LoginID (WebDriver driver)
	{
		element=driver.findElement(By.id("cphPage_txtLoginID"));
		return element;
	}
	
	public static WebElement Password (WebDriver driver)
	{
		element=driver.findElement(By.id("cphPage_txtPassword"));
		return element;
	}
	
	public static WebElement LoginBtn(WebDriver driver)
	{
		element=driver.findElement(By.id("cphPage_btnLogin"));
		return element;
	}
	
	public static WebElement CancelBtn(WebDriver driver)
	{
		element=driver.findElement(By.id("cphPage_btnCancel"));
		return element;
	}
	
	}


