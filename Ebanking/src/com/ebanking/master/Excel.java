package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	Library LB=new Library();
	LB.OpenApp("http://122.175.8.158/ranford2");
	LB.AdminLgn("Admin","Te$ting@");
		
	//To get test data file
	
	FileInputStream Fis=new FileInputStream("E:\\AutomationWorkspace\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
	
	//WorkBook
	
	XSSFWorkbook WB=new XSSFWorkbook(Fis);
	
	//Sheets
	
	XSSFSheet WS=WB.getSheet("Rdata");
	
	//Row count
	
	int Rcount=WS.getLastRowNum();
	System.out.println(Rcount);
	
	//Multiple Iterations----Loop
	
	for (int i=1;i<=Rcount;i++) 
	{
		//Rows
		
		XSSFRow WR=WS.getRow(i);
		
		//cells
		
		XSSFCell WC=WR.getCell(0);
		XSSFCell WC1=WR.getCell(1);
		XSSFCell WC2=WR.getCell(2);
		
		XSSFCell WC3=WR.createCell(3);
		
		//cell values
		
		String Rname=WC.getStringCellValue();
		String Rdesc=WC1.getStringCellValue();
		String Rtype=WC2.getStringCellValue();

		String Res=LB.Roles(Rname, Rdesc, Rtype);
		WC3.setCellValue(Res);

	}
		//Results 
		
		FileOutputStream Fos=new FileOutputStream("E:\\AutomationWorkspace\\Ebanking\\src\\com\\ebanking\\results\\Res_Role.xlsx");
		WB.write(Fos);
		WB.close();
		
}
	
}