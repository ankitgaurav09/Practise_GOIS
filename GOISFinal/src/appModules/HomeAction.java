package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomeAction {

	
	
	public static void select (WebDriver driver,String selId,String text)
	{
		WebElement selwb=driver.findElement(By.id(selId));
		Select sel=new Select(selwb);
		sel.selectByVisibleText(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void mouseOver (WebDriver driver,String mouseOverXpath )
	{
		WebElement wb =driver.findElement(By.xpath(mouseOverXpath));
		Actions act=new Actions(driver);
		act.moveToElement(wb).perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public static void mouseOverAndclick1 (WebDriver driver,String mouseOverXpath,String optionId )
	{
		WebElement wb =driver.findElement(By.xpath(mouseOverXpath));
		Actions act=new Actions(driver);
		act.moveToElement(wb).perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id(optionId)).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public static void mouseOverAndclick2 (WebDriver driver,String mouseOverXpath,String xpath )
	{
		WebElement wb =driver.findElement(By.xpath(mouseOverXpath));
		Actions act=new Actions(driver);
		act.moveToElement(wb).perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
}
