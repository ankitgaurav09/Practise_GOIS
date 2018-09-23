package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPO {
	
	@FindBy(linkText="Add Customer")
	//@FindBy(xpath="//div[@id='dvBody']/div/div[4]/table/tbody/tr/td[2]/a")
	private WebElement AddCustLink;
	@FindBy(id="ddlBu")
	private WebElement BUDropdown;
	@FindBy(id="txtCustName")
	private WebElement CustName;
	@FindBy(xpath="//body/div[5]/div[3]/div/button[1]")
	private WebElement SaveBtn ;

	
	public WebElement getAddCustLink(){
		return AddCustLink;
	}
	public WebElement getBUDrop(){
		return BUDropdown;
	}
	public WebElement getCustName(){
		return CustName;
	}
	public WebElement getSaveBtn(){
		return SaveBtn;
		
	}
	

}
