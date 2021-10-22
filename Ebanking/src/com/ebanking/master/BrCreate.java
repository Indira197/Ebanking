package com.ebanking.master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BrCreate {
	
	@FindBy (id="txtbName")
	WebElement Brname;
	
	@FindBy (id="txtAdd1")
    WebElement Braddress;
	
	@FindBy (id="txtArea")
    WebElement Brarea;
	
	@FindBy (id="txtZip")
    WebElement Brzipcode;
	
	@FindBy (id="lst_counrtyU")
	WebElement Brctry;
	
	@FindBy (id="lst_stateI")
    WebElement Brstate;
	
	@FindBy (id="lst_cityI")
    WebElement Brcity;
	
	@FindBy (id="btn_insert")
    WebElement Brsubmit;
	
	public void Brdata(String bname,String baddress,String barea,String bzipcode,String bctry,String bstate,String bcity)
	{
		Brname.sendKeys(bname);
		Braddress.sendKeys(baddress);
		Brarea.sendKeys(barea);
		Brzipcode.sendKeys(bzipcode);
		Select Ctry=new Select(Brctry);
		Ctry.selectByVisibleText(bctry);
		Select State=new Select(Brstate);
		State.selectByVisibleText(bstate);
		Select City=new Select(Brcity);
		City.selectByVisibleText(bcity);
		Brsubmit.click();
	}
	

}
