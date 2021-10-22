package com.ebanking.master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RoleCreate {
	
	@FindBy (id="txtRname")
	WebElement Rname;
	
	@FindBy (id="txtRDesc")
    WebElement Rdesc;
	@FindBy (id="lstRtypeN")
    WebElement Rtype;
	
	@FindBy (id="btninsert")
    WebElement Rsubmit;
	
	public void Rodata(String Rolname,String Roldesc,String Roltype)
	{
		Rname.sendKeys(Rolname);
		Rdesc.sendKeys(Roldesc);
		Select RT=new Select(Rtype);
		RT.selectByVisibleText(Roltype);
		Rsubmit.click();
	}

}
