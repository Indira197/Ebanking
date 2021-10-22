package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BExcel {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	Library LB=new Library();
	LB.OpenApp("http://122.175.8.158/ranford2");
	LB.AdminLgn("Admin","Te$ting@");
		
	//To get test data file
	
	FileInputStream Fis=new FileInputStream("E:\\AutomationWorkspace\\Ebanking\\src\\com\\ebanking\\testdata\\Branch.xlsx");
	
	//WorkBook
	
	XSSFWorkbook WB=new XSSFWorkbook(Fis);
	
	//Sheets
	
	XSSFSheet WS=WB.getSheet("Bdata");
	
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
		XSSFCell WC4=WR.getCell(4);
		XSSFCell WC5=WR.getCell(5);
		XSSFCell WC6=WR.getCell(6);
		
		XSSFCell WC7=WR.createCell(7);
		
		//cell values
		
		String brname=WC.getStringCellValue();
		String bradd=WC1.getStringCellValue();
		String brarea=WC2.getStringCellValue();
		String brzipcode=WC3.getStringCellValue();
		String brctry=WC4.getStringCellValue();
		String brstate=WC5.getStringCellValue();
		String brcity=WC6.getStringCellValue();

		String Resu=LB.Branches(brname, bradd, brarea, brzipcode, brctry, brstate, brcity);
		WC7.setCellValue(Resu);

	}
		//Results 
		
		FileOutputStream Fos=new FileOutputStream("E:\\AutomationWorkspace\\Ebanking\\src\\com\\ebanking\\results\\Resu_Branch.xlsx");
		WB.write(Fos);
		WB.close();
		
}
	
}
