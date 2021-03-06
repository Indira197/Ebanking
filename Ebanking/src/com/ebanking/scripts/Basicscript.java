package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class Basicscript {

	public static void main(String[] args) throws InterruptedException
	{
	
		String Expval="Ranford Bank";
		
		//Launch Browser
		
		WebDriver driver = new ChromeDriver();
	
		//Url
		
		driver.get("http://122.175.8.158/ranford2");
		
		//Maximise
		
		driver.manage().window().maximize();
		
		String Actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		
		//Comparision
		
		if (Expval.equalsIgnoreCase(Actval)) 
		{
		System.out.println("Ranford Application Launch Succ");	
		}
		else
		{
			System.out.println("Ranford Application Not Launch");	
		}
		
		
		
		/*//get title
		
		String Tit=driver.getTitle();
		System.out.println(Tit);*/
		
		//Admin login
		
		Expval="Welcome to Admin";
		Thread.sleep(3000);
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Te$ting@");
		driver.findElement(By.id("login")).click();
		
		Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		
		//Comparision
		
				if (Expval.equalsIgnoreCase(Actval)) 
				{
				System.out.println("Admin Login Succ");	
				}
				else
				{
					System.out.println("Admin Login Failed");	
				}
				
		
		//Branches
		
		Expval="Sucessfully";		
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		
		
		driver.findElement(By.id("txtbName")).sendKeys("Mindqsrhydnagar");
		driver.findElement(By.id("txtAdd1")).sendKeys("Srnagar");
		driver.findElement(By.id("txtZip")).sendKeys("12345");
		
		Select Ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
		Ctry.selectByVisibleText("INDIA");
		
		Select Sta=new Select(driver.findElement(By.id("lst_stateI")));
		Sta.selectByVisibleText("GOA");

		Select Cty=new Select(driver.findElement(By.id("lst_cityI")));
		Cty.selectByVisibleText("GOA");

		driver.findElement(By.id("btn_insert")).click();
		
		Thread.sleep(4000);
		
		//Alert
		
		Actval=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		//Comparision
		
		if (Actval.contains(Expval)) 
		{
		System.out.println("Branch Created");	
		}
		else
		{
			System.out.println("Branch Already Exist");
		}
		
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
		
		//Roles
		
		
		Expval="Sucessfully";		
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
		driver.findElement(By.id("btnRoles")).click();
		
		
		driver.findElement(By.id("txtRname")).sendKeys("Testing");
		driver.findElement(By.id("txtRDesc")).sendKeys("Manager");
		
		Select typ=new Select(driver.findElement(By.id("lstRtypeN")));
		typ.selectByVisibleText("E");

		driver.findElement(By.id("btninsert")).click();
		
		Thread.sleep(4000);
		
		//Alert
		
		Actval=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		//Comparision
		
		if (Actval.contains(Expval)) 
		{
		System.out.println("Role Created");	
		}
		else
		{
			System.out.println("Role Already Exist");
		}
		
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
		
		
		//employees
		
		
				Expval="Sucessfully";		
				
				driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
				driver.findElement(By.id("BtnNew")).click();
				
				driver.findElement(By.id("txtUname")).sendKeys("Indira");
				driver.findElement(By.id("txtLpwd")).sendKeys("indira123");
				
				Select role=new Select(driver.findElement(By.id("lst_Roles")));
				role.selectByVisibleText("Accountant");
				
				Select brc=new Select(driver.findElement(By.id("lst_Branch")));
				brc.selectByVisibleText("12");

				driver.findElement(By.id("BtnSubmit")).click();
				
				Thread.sleep(4000);
				
				//Alert
				
				Actval=driver.switchTo().alert().getText();
				driver.switchTo().alert().accept();
				
				//Comparision
				
				if (Actval.contains(Expval)) 
				{
				System.out.println("Employee Created");	
				}
				else
				{
					System.out.println("Employee Already Exist");
				}
				
				driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
				
				//logout
				
				driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")).click();
				
				//Bankerlogin
				
				Expval="Welcome to Admin";
				
			    driver=new FirefoxDriver();
				
				driver.get("http://122.175.8.158/ranford2");
			
				driver.manage().window().maximize();
				
				driver.findElement(By.id("drlist")).sendKeys("1");
				driver.findElement(By.id("txtuId")).sendKeys("Admin");
				driver.findElement(By.id("txtPword")).sendKeys("Te$ting@");
				driver.findElement(By.id("login")).click();
				
				Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
				
				
				if (Expval.equalsIgnoreCase(Actval)) 
				{
				System.out.println("Banker Login Succ");	
				}
				else
				{
					System.out.println("Banker Login Not Succ");	
		
				}
				
				driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")).click();
				
				
				driver.close();
				
	}
}
				
		
				
				
