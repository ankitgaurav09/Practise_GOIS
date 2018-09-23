package automationFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) throws InterruptedException, IOException{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://goismvc1.metaoptionllc.com/Accounts/login.aspx");
		driver.findElement(By.name("ctl00$cphPage$txtLoginID")).sendKeys("ankit09@yopmail.com");
		driver.findElement(By.name("ctl00$cphPage$txtPassword")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement wb =driver.findElement(By.xpath("//div[@id='top-menu']/ul/li[8]/a/span"));
		Actions act=new Actions(driver);
		act.moveToElement(wb).perform();
		driver.findElement(By.linkText("Entities")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//tr/td[2]/a[@onclick='GetOrgDetails(0)']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='txtOrgName']")).sendKeys("org1");
		driver.findElement(By.name("OrganizationInfo.Description")).sendKeys("its a new organization");
		driver.findElement(By.xpath("//input[@id='fuLogo']")).click();
//		WebElement fileInput =driver.findElement(By.xpath("//tr[1]/td/input[@type='file']")); 
//		fileInput.sendKeys("C:/Users/gaurava/Desktop/audi-a1-08.jpg"); 
//		Thread.sleep(10000);
		
		
		Runtime.getRuntime().exec("D:/Program Files (x86)/AutoIt3/logo1.exe");
	}

}
