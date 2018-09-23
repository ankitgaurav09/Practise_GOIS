package appModules;

import org.openqa.selenium.WebDriver;
import pageObjects.LoginGOIS;

public class SignIn_Action1 {
	
	
	
	/* Function Parameters
	It is always a good practice to pass parameters when calling the method,
	 rather than providing parameters inside the method. We can pass parameters through methods,
	  just as in normal programming code. The code below will show us how we can login with parameterized username and password.*/
	
	  // Pass Arguments (Username and Password) as string
	
	public static void Execute (WebDriver driver,String sUsername,String sPassword)
	{
		LoginGOIS.LoginID(driver).sendKeys(sUsername);
		LoginGOIS.Password(driver).sendKeys(sPassword);
		LoginGOIS.LoginBtn(driver).click();
	}
	
	

}
