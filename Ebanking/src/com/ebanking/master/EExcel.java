package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EExcel {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	Library LB=new Library();
	LB.OpenApp("http://122.175.8.158/ranford2");
	LB.AdminLgn("Admin","Te$ting@");
		
	//To get test data file
	
	FileInputStream Fis=new FileInputStream("E:\\AutomationWorkspace\\Ebanking\\src\\com\\ebanking\\testdata\\Employee.xlsx");
	
	//WorkBook
	
	XSSFWorkbook WB=new XSSFWorkbook(Fis);
	
	//Sheets
	
	XSSFSheet WS=WB.getSheet("Edata");
	
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
		XSSFCell WC3=WR.getCell(3);
		
		XSSFCell WC4=WR.createCell(4);
		
		//cell values
		
		String Ename=WC.getStringCellValue();
		String Epsw=WC1.getStringCellValue();
		String Erole=WC2.getStringCellValue();
		String Ebranch=WC3.getStringCellValue();
		
		
		String Resu=LB.Employee(Ename, Epsw, Erole, Ebranch);
		WC4.setCellValue(Resu);

	}
		//Results 
		
		FileOutputStream Fos=new FileOutputStream("E:\\AutomationWorkspace\\Ebanking\\src\\com\\ebanking\\results\\Resu_Employee.xlsx");
		WB.write(Fos);
		WB.close();
		
}
	
}
