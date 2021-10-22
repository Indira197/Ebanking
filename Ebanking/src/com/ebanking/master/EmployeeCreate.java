package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EmployeeCreate {
	
	@FindBy (id="txtUname")
	WebElement Empname;
	
	@FindBy (id="txtLpwd")
    WebElement EmpLgn;
	
	@FindBy (id="lst_Roles")
    WebElement EmpRole;
	
	@FindBy (id="lst_Branch")
    WebElement Empbranch;
	
	@FindBy (id="BtnSubmit")
    WebElement Esubmit;
	
	
	public void Emdata(String Emname,String Elgn,String Erol,String Ebr)
	{
		Empname.sendKeys(Emname);
		EmpLgn.sendKeys(Elgn);
		Select Erole=new Select(EmpRole);
		Erole.selectByVisibleText(Erol);
		Select Ebranch=new Select(Empbranch);
		Ebranch.selectByVisibleText(Ebr);
		Esubmit.click();
	}

}
