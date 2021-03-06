package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Library 
{

	public static WebDriver driver;
	public static String Expval,Actval;
	public static FileInputStream FIS;
	public static Properties PR;
	
	public String OpenApp(String Url) throws IOException
	{
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\geckodriver.exe");

		FIS=new FileInputStream("E:\\AutomationWorkspace\\Ebanking\\src\\com\\ebanking\\properties\\Rep.properties");
		PR=new Properties();
		PR.load(FIS);
		
		Expval="Ranford Bank";
		
		//Launch Bowser
			driver=new ChromeDriver();
				//maximise
			driver.manage().window().maximize();
			
			//Url
			driver.get(Url);
			
			String Actval=driver.findElement(By.xpath(PR.getProperty("Homepage"))).getText();
			
			if (Expval.equalsIgnoreCase(Actval)) 
			{
			  System.out.println("Ranford Home Page is Displayed");	
			}
			else
			{
				System.out.println("ranford Home Page is not Dispalyed");
			}
			
		return "pass";
	
	}
	
	
	        public String AdminLgn(String Un,String Pwd)
	      {
                 Expval="Welcome to Admin";
		
		         driver.findElement(By.id(PR.getProperty("Uname"))).sendKeys(Un);
		         driver.findElement(By.id(PR.getProperty("Pswd"))).sendKeys(Pwd);
		         driver.findElement(By.id(PR.getProperty("Adlgn"))).click();
		
		         Actval=driver.findElement(By.xpath(PR.getProperty("AdHomepage"))).getText();
		
		if (Expval.equalsIgnoreCase(Actval)) 
		{
		  System.out.println("Admin Home Page is Displayed");	
		}
		else
		{
			System.out.println("Admin Home Page is not Dispalyed");
		}
	
	        return "pass";
	      }
	        
	        
	
	public String Branches(String brname,String bradd,String brarea,String brzipcode,String brctry,String brstate,String brcity) throws InterruptedException
	{
	Expval="Sucessfully";
		
		driver.findElement(By.xpath(PR.getProperty("Brbutton"))).click();
		Thread.sleep(5000);
		driver.findElement(By.id(PR.getProperty("NewBr"))).click();
		driver.findElement(By.id(PR.getProperty("Brname"))).sendKeys(brname);
		driver.findElement(By.id(PR.getProperty("textadd"))).sendKeys(bradd);
		driver.findElement(By.id(PR.getProperty("textarea"))).sendKeys(brarea);
		driver.findElement(By.id(PR.getProperty("textcode"))).sendKeys(brzipcode);
		
		Select ctry=new Select(driver.findElement(By.id(PR.getProperty("Brcountry"))));
		ctry.selectByVisibleText(brctry);
		Thread.sleep(5000);
		
		Select state=new Select(driver.findElement(By.id(PR.getProperty("Brstate"))));
		state.selectByVisibleText(brstate);
		Thread.sleep(5000);
		
		Select city=new Select(driver.findElement(By.id(PR.getProperty("Brcity"))));
		city.selectByVisibleText(brcity);
		Thread.sleep(5000);
		
		driver.findElement(By.id(PR.getProperty("Bsubmit"))).click();
		
		//Alert
		
		Actval=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(PR.getProperty("Home"))).click();
		
		if(Actval.contains(Expval)) 
		{
		System.out.println("Branch Created");	
		}
		else
		{
			System.out.println("Branch Already exist");
		}
	
	   return "pass";
	}
	
	
	public String Roles(String Rname,String Rdesc,String Rtype) throws InterruptedException
	{
			Expval="Sucessfully";		
			
			driver.findElement(By.xpath(PR.getProperty("Rbutton"))).click();
			driver.findElement(By.id(PR.getProperty("Newrole"))).click();
			
			
			driver.findElement(By.id(PR.getProperty("Rolename"))).sendKeys(Rname);
			driver.findElement(By.id(PR.getProperty("Roledesc"))).sendKeys(Rdesc);
			
			Select typ=new Select(driver.findElement(By.id(PR.getProperty("Roletype"))));
			typ.selectByVisibleText(Rtype);

			driver.findElement(By.id(PR.getProperty("Rsubmit"))).click();
			
			Thread.sleep(4000);
			
			//Alert
			
			Actval=driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			driver.findElement(By.xpath(PR.getProperty("Home"))).click();
			//Comparision
			
			if (Actval.contains(Expval)) 
			{
			System.out.println("Role Created");	
			}
			else
			{
				System.out.println("Role Already Exist");
			}
			
			return "pass";
	}
	
			
			public String Employee(String Ename,String Epsw,String Erole,String Ebranch) throws InterruptedException
			
			{
					Expval="Sucessfully";		
					
					driver.findElement(By.xpath(PR.getProperty("Ebutton"))).click();
					driver.findElement(By.id(PR.getProperty("Newemployee"))).click();
					
					driver.findElement(By.id(PR.getProperty("EmpName"))).sendKeys(Ename);
					driver.findElement(By.id(PR.getProperty("EmpLgn"))).sendKeys(Epsw);
					
					Select role=new Select(driver.findElement(By.id(PR.getProperty("EmpRole"))));
					role.selectByVisibleText(Erole);
					
					Select brc=new Select(driver.findElement(By.id(PR.getProperty("EmpBranch"))));
					brc.selectByVisibleText(Ebranch);

					driver.findElement(By.id(PR.getProperty("EmpSubmit"))).click();
					
					Thread.sleep(4000);
					
					//Alert
					
					Actval=driver.switchTo().alert().getText();
					driver.switchTo().alert().accept();
					driver.findElement(By.xpath(PR.getProperty("Home"))).click();
					
					//Comparision
					
					if (Actval.contains(Expval)) 
					{
					System.out.println("Employee Created");	
					}
					else
					{
						System.out.println("Employee Already Exist");
					}
					
					return "pass";
			}
			
					//logout
			public String Logout() throws InterruptedException
				
				{
			driver.findElement(By.xpath(PR.getProperty("logout"))).click();
			Thread.sleep(4000);
			
			return "pass";
				}
			
			//closeapp
			
			public String Closeapp()
			{
				
				driver.close();
				
				return "pass";
			}
				
				
				
				
				
			}
			
			
			
			
			
				
			
	
