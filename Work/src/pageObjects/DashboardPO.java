package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPO {
	
	@FindBy(xpath="//div[@id='top-menu']/ul/li[8]/a/span")
	private WebElement SystemMouseOver;
	@FindBy(xpath="//div[@id='top-menu']/ul/li[8]/ul/li[1]/a")
	private WebElement Entities;
	@FindBy(linkText="Logout")
	private WebElement LogoutLink;
	
	public WebElement getSystemMouseOver(){
		return SystemMouseOver;
	}
	
	public WebElement getEntities(){
		return Entities;
	}
	
	public WebElement getLogoutLnk() {
		return LogoutLink;
	}

}
