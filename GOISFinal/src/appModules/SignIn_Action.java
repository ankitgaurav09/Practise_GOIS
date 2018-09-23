package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.LoginGOIS;

/*In most of the web application we have few set of actions 
which are always executed in the series of actions. Rather than writing those 
actions again and again in our test, we can club those actions in to a method and then calling that method in our test script.
Modularity avoids duplicacy of code*/

public class SignIn_Action {

	public static void Execute (WebDriver driver)
	{
		LoginGOIS.LoginID(driver).sendKeys("ankupre1");
		LoginGOIS.Password(driver).sendKeys("123456");
		LoginGOIS.LoginBtn(driver).click();
	}
	
}
