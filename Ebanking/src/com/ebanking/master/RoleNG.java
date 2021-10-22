package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RoleNG extends Base
{
	@Test(dataProvider="Rdata")
	
public void Role(String Rname,String Rdesc,String Rtype) throws InterruptedException
    {
		
		LB.Roles(Rname,Rdesc,Rtype);	
		
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
	
	}
