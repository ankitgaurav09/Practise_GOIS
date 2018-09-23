package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO {

	@FindBy(name="ctl00$cphPage$txtLoginID")
	private WebElement LoginIdEtd;
	
	@FindBy(name="ctl00$cphPage$txtPassword")
	private WebElement PasswordEtd;
	
	@FindBy(xpath="//input[@id='cphPage_btnLogin']")
	private WebElement LoginBtn;
	
	
	
	public WebElement getLoginEtd()
	{
		return LoginIdEtd;
	}
	
	public WebElement getPasswordEtd()
	{
		return PasswordEtd;
	}
	
	public WebElement getLoginBtn()
	{
		return LoginBtn;
	}
}
