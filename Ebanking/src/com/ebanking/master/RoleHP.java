package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoleHP {
	
	@FindBy (id="btnRoles")
	WebElement Newrole;
	
	@FindBy (xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
    WebElement Hm;
		
		
	public void NewRol()
	{
		Newrole.click();
	}
	
	public void Home()
	{
		Hm.click();
	}

}
