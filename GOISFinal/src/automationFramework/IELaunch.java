package automationFramework;

 
import org.openqa.selenium.ie.InternetExplorerDriver;

import utility.Constant;
import appModules.SignIn_Action1;

public class IELaunch {
	public static void main(String[] args) {
		 //Path to the folder where you have extracted the IEDriverServer executable
		 String server = "D:\\Drivers\\IEDriverServer.exe";
		 System.setProperty("webdriver.ie.driver", server);

		 InternetExplorerDriver  driver = new InternetExplorerDriver();
		 driver.get(Constant.URL);
		 SignIn_Action1.Execute(driver, Constant.Username, Constant.Password);
	}
}
	

