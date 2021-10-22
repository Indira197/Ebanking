package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Exepom 
{
	WebDriver driver;
      
	@Test()
	public void AdLogin()
	  {

		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("http://122.175.8.158/ranford2");
		 
		  RanfordHp RHP=PageFactory.initElements(driver,RanfordHp.class);
		  RHP.login();
	  }
	
	@Test(dataProvider="Bdata")
	
	public void Brcreation(String bname,String baddress,String barea,String bzipcode,String bctry,String bstate,String bcity) throws IOException
	     {
		
	
		 AdminHp AHP=PageFactory.initElements(driver,AdminHp.class);
		  AHP.Br();
		  
		  BranchHP BHP=PageFactory.initElements(driver,BranchHP.class);
		  BHP.NewBr();
		  
		  BrCreate BRC=PageFactory.initElements(driver,BrCreate.class);
		  BRC.Brdata(bname,baddress,barea,bzipcode,bctry,bstate,bcity);
		  
		  driver.switchTo().alert().accept();
		  
		  BHP.Home();
	     }
	  
	
    @DataProvider
	
	public Object [][] Bdata()
	{
		Object [][] Obj=new Object [3][7];
		
		Obj[0][0]="mqsrnagar";
		Obj[0][1]="srnagar";
		Obj[0][2]="ameerpet";
		Obj[0][3]="12390";
		Obj[0][4]="INDIA";
		Obj[0][5]="GOA";
		Obj[0][6]="GOA";
		
		Obj[1][0]="mqjntuh";
		Obj[1][1]="jntuh";
		Obj[1][2]="kphbjutuh";
		Obj[1][3]="15790";
		Obj[1][4]="INDIA";
		Obj[1][5]="GOA";
		Obj[1][6]="GOA";
		
		Obj[2][0]="mqkhaitat";
		Obj[2][1]="khairatabad";
		Obj[2][2]="madhapur";
		Obj[2][3]="18390";
		Obj[2][4]="INDIA";
		Obj[2][5]="GOA";
		Obj[2][6]="GOA";
		
		return Obj;	
		
		
	}

		@Test(dataProvider="Edata")
	
	public void Ecreation(String Emname,String Elgn,String Erol,String Ebr) throws IOException
	  {
					
		  AdminHp AHP=PageFactory.initElements(driver,AdminHp.class); 
		  AHP.Emp();
		  
		  EmployeeHP EHP=PageFactory.initElements(driver,EmployeeHP.class);
		  EHP.NewEmp();
		  
		  EmployeeCreate ERC=PageFactory.initElements(driver,EmployeeCreate.class);
		  ERC.Emdata(Emname,Elgn,Erol,Ebr);

		  driver.switchTo().alert().accept();
		  
		  EHP.Home();
	  }
		
		@DataProvider
		
		public Object [][] Edata()
		{
			Object [][] Obj=new Object [3][4];
			
			Obj[0][0]="Anusha";
			Obj[0][1]="anusha567";
			Obj[0][2]="Accountant";
			Obj[0][3]="12";
					
			Obj[1][0]="Arun";
			Obj[1][1]="arun@56";
			Obj[1][2]="Accountant";
			Obj[1][3]="12";
					
			Obj[2][0]="Abhishek";
			Obj[2][1]="abhi789";
			Obj[2][2]="Accountant";
			Obj[2][3]="12";
					
			return Obj;	
			
		}
		
			
		  
		  @Test(dataProvider="Rdata")
			
	public void Creation(String Rolname,String Roldesc,String Roltype) throws IOException
			 
		  {
							
				  AdminHp AHP=PageFactory.initElements(driver,AdminHp.class); 
				  AHP.Rol();
				  
				  RoleHP RLP=PageFactory.initElements(driver,RoleHP.class);
				  RLP.NewRol();
				  
				  RoleCreate RRC=PageFactory.initElements(driver,RoleCreate.class);
				  RRC.Rodata(Rolname,Roldesc,Roltype);

				  driver.switchTo().alert().accept();
				  
				  RLP.Home();
			  }
		  
		  @DataProvider
			
			public Object [][] Rdata()
			{
				Object [][] Obj=new Object [3][3];
				
				Obj[0][0]="mqclerk";
				Obj[0][1]="Clerk";
				Obj[0][2]="E";
				
				Obj[1][0]="mqsclerk";
				Obj[1][1]="Clerk";
				Obj[1][2]="E";
				
				Obj[2][0]="mnpclerk";
				Obj[2][1]="Clerk";
				Obj[2][2]="E";
				
				return Obj;	
				
				
			}
			

	@Test()
	
	public void Logout()
	   {
	      AdminHp AHP=PageFactory.initElements(driver,AdminHp.class);
		  AHP.Lout();
		  
		  driver.close();    
		  
	  }
}
