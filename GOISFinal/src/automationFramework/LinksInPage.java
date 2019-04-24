
package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LinksInPage {

		public static void main(String[] args) {
			// Create a new instance of the Firefox driver
	WebDriver driver= new FirefoxDriver();
	driver.get("http://goismvc1.metaoptionllc.com/Accounts/login.aspx");
	driver.findElement(By.id("cphPage_txtLoginID")).sendKeys("creta4");
	driver.findElement(By.xpath("//input[@id= 'cphPage_txtPassword']")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	java.util.List <WebElement> links =driver.findElements(By.tagName("a"));

	System.out.println(links.size());
	

	for (int i = 1; i<=links.size(); i=i+1)

	{

		System.out.println(links.get(i).getText());

	}

}

	
	}

