package commonLib;

//import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonLib.BDriver;


public class WebDriverCommonLib {
	
	public static void waitForPageToLoad(){
	//public void waitForPageToLoad(){	
		BDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void waitSleep() throws InterruptedException{
		//public void waitForPageToLoad(){	
			Thread.sleep(5000);
		}
	
	public void waitForLinkPresent(String linkText){
		WebDriverWait wait = new WebDriverWait(BDriver.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkText)));
		
	}
	
	public void waitForWbXpath(String wbXpath){
		WebDriverWait wait = new WebDriverWait(BDriver.driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(wbXpath)));
		
	}
	
	public boolean verifyText(String textXpath , String expectedText){
		boolean flag = false;
		String actText = BDriver.driver.findElement(By.xpath(textXpath)).getText();
		
		if(expectedText.equals(actText)){
			flag = true;
			System.out.println(actText + " = text is verified");
		}else{
			System.out.println(actText + " = text is not verified");
		}
		return flag;
	}
	
	
	public void select(String selBoxXpath , String visibleText){	
		WebElement selWb = BDriver.driver.findElement(By.xpath(selBoxXpath));
		Select sel = new Select(selWb);
		sel.selectByVisibleText(visibleText);
	}
	
	public void select(String selBoxXpath , int index){	
		WebElement selWb = BDriver.driver.findElement(By.xpath(selBoxXpath));
		Select sel = new Select(selWb);
		sel.selectByIndex(index);
	}
	
	public void select(WebElement selBoxWb , String visibleText){	
		Select sel = new Select(selBoxWb);
		sel.selectByVisibleText(visibleText);
	}
	
	
	public void acceptAlert(){
		Alert alt = BDriver.driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}
	
	public void cancelAlert(){
		Alert alt = BDriver.driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
	}
	
public static void mouseOver (WebDriver driver,String mouseoverXpath ){
		
		WebElement wb =driver.findElement(By.xpath(mouseoverXpath));
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();
		WebDriverCommonLib.waitForPageToLoad();
			
	}

public static void mouseOverAndclick1 (WebDriver driver,String mouseOverXpath,String optionId )
{
	
	WebElement wb =driver.findElement(By.xpath(mouseOverXpath));
	Actions act=new Actions(driver);
	act.moveToElement(wb).perform();
	WebDriverCommonLib.waitForPageToLoad();
	
	/*no need to create an object to class, since using in same class(but in different method) 
	WebDriverCommonLib wcl=new WebDriverCommonLib();
	wcl.waitForPageToLoad();*/
	
	/*  no need to create an object,since the class is declared as static */
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebDriverCommonLib.waitForPageToLoad();
	driver.findElement(By.id(optionId)).click();
	WebDriverCommonLib.waitForPageToLoad();
	
}
	
	public static void mouseOverAndclick2 (WebDriver driver,String mouseOverXpath,String xpath)
	{
		WebElement wb =driver.findElement(By.xpath(mouseOverXpath));
		Actions act=new Actions(driver);
		act.moveToElement(wb).perform();
		WebDriverCommonLib.waitForPageToLoad();
		driver.findElement(By.xpath(xpath)).click();
		WebDriverCommonLib.waitForPageToLoad();
		
	}
	
	public static void mouseOverAndclick3 (WebDriver driver,String mouseOverXpath,String xpath)
	{
		//WebElement wb =driver.findElement(By.xpath(mouseOverXpath));
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(mouseOverXpath))).perform();
		WebDriverCommonLib.waitForPageToLoad();
		driver.findElement(By.xpath(xpath)).click();
		WebDriverCommonLib.waitForPageToLoad();
		
	}
	


}

