package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.HomeGOIS;
import appModules.SignIn_Action1;
import utility.Constant;

public class Global_Var_TC {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        // Launch the Online Store Website using Constant Variable
        driver.get(Constant.URL);
        
     // Pass Constant Variables as arguments to Execute method
        SignIn_Action1.Execute(driver, Constant.Username, Constant.Password);

System.out.println("Login successfully, Now loging Out");
		
		HomeGOIS.LogOut(driver).click();
		driver.quit();
}
}