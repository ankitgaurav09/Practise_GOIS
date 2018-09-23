package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EntitiesDropdownPO {
	
	@FindBy(id="ddlEntitySelection")
	private WebElement selBoxXpath ;
	
	public WebElement getEntDropdown(){
		return selBoxXpath;
	}
	
	

}
