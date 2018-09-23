package automationFramework;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pageObjects.HomeGOIS;
import appModules.SignIn_Action1;
import utility.Constant;

public class MultiBrowser {
	public WebDriver driver;
	
	@Parameters("browser")
  
  @BeforeClass
  public void beforeClass(String browser) {
	  /*equalsIgnoreCase:
	   * Description. The java.lang.String.equalsIgnoreCase() method compares this String to another String, 
	   * ignoring case considerations. Two strings are considered equal ignoring case if they are of the same length 
and corresponding characters in the two strings are equal ignoring case.
	  */
	  if(browser.equalsIgnoreCase("firefox"))
	  {
		  driver= new FirefoxDriver();
	  }
	  else if(browser.equalsIgnoreCase("ie"))
	  {
			 System.setProperty("webdriver.ie.driver", "D:\\Drivers\\IEDriverServer.exe");
		  driver = new InternetExplorerDriver();
	  }
	  else if(browser.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		  driver= new ChromeDriver();
	  }
	  
	  driver.get(Constant.URL);
  }
  
  @Test
  public void f() 
  {
	  SignIn_Action1.Execute(driver, Constant.Username, Constant.Password);
  }

  @AfterClass
  public void afterClass() 
  {
	//use of pageOjects
	  HomeGOIS.LogOut(driver).click();
	 
  }
  }


