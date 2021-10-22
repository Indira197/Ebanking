package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmployeeNG extends Base 
  {
	
	@Test(dataProvider="Edata")
	
	public void Employee(String Ename,String Epsw,String Erole,String Ebranch) throws InterruptedException
	    {
			
		LB.Employee(Ename,Epsw,Erole,Ebranch);	
			
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

		}


