package automationFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutoIt {

	public static void main(String[] args) throws InterruptedException, IOException, ArrayIndexOutOfBoundsException {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://goismvc1.metaoptionllc.com/Accounts/login.aspx");
		driver.findElement(By.name("ctl00$cphPage$txtLoginID")).sendKeys("anktest");
		driver.findElement(By.name("ctl00$cphPage$txtPassword")).sendKeys("a");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		for (int i=1;i<=10;i++){
		WebElement wb =driver.findElement(By.xpath("//div[@id='top-menu']/ul/li[2]/a/span"));
		Actions act=new Actions(driver);
		act.moveToElement(wb).perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@id='AddProduct']")).click();
	
		WebElement selwb=driver.findElement(By.id("ddlOrg"));
		Select sel=new Select(selwb);
		sel.selectByVisibleText("Sportz World");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='btnSelect']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='txtProductName']")).sendKeys("Foot6"+i);
		driver.findElement(By.xpath("//input[@id='txtProductNumber']")).sendKeys("Ft6"+i);
		driver.findElement(By.id("btnImageUpload")).click();
		
		Runtime.getRuntime().exec("D:/Program Files (x86)/AutoIt3/a3.exe");/* AutoIt third party tool has been used to handle window file uploading
		keep the file to be uploaded into desktop only */
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='txtUnitPurchasePrice']")).sendKeys("600"+i);
		driver.findElement(By.xpath("//input[@id='txtUnitSalePrice']")).sendKeys("610"+i);
		
		WebElement selwb2=driver.findElement(By.id("ddlCategory"));
		Select sel2=new Select(selwb2);
		sel2.selectByVisibleText("Footballs");
		driver.findElement(By.xpath("//input[@id='btnSaveAndBack']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='top-menu']/ul/li[1]/div/a")).click();
		Thread.sleep(5000);
		}
			driver.findElement(By.id("lnkLogOut")).click();
	}

}
