package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BranchNG extends Base 
  {
	@Test(dataProvider="Bdata")
	
	public void Branch(String brname,String bradd,String brarea,String brzipcode,String brctry,String brstate,String brcity)throws InterruptedException
	    {
			
		LB.Branches(brname,bradd,brarea,brzipcode,brctry,brstate,brcity);	
			
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

}
