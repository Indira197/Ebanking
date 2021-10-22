package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ENotepad {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
        Library LB=new Library();
        LB.OpenApp("http://122.175.8.158/ranford2");
    	LB.AdminLgn("Admin","Te$ting@");

		
		
		//To get test data file path
		
		String Fpath="E:\\AutomationWorkspace\\Ebanking\\src\\com\\ebanking\\testdata\\Employee.txt";
		
		//To get Results file path
		
		String Rpath="E:\\AutomationWorkspace\\Ebanking\\src\\com\\ebanking\\results\\Res_Employee.txt";
		String SD;
		//To get test data file
		
		FileReader FR=new FileReader(Fpath);
		BufferedReader BR=new BufferedReader(FR);
		String Sread=BR.readLine();
		System.out.println(Sread);
		
		//write header line into results file
		
		FileWriter FW=new FileWriter(Rpath);
		BufferedWriter BW=new BufferedWriter(FW);
		BW.write(Sread);
		BW.newLine();
		
		//Multiple Iterations-----Loop
		
		//While loop
		
		while ((SD=BR.readLine())!=null) 
		{
			System.out.println(SD);
			
			//Split
			
			String SR[]=SD.split("###");
			
			      String Ename=SR[0];
			      String Epsw=SR[1];
			      String Erole=SR[2];
			      String Ebranch=SR[3];
			      
			      String Res=LB.Employee(Ename, Epsw, Erole, Ebranch);
			      System.out.println(Res);
			      
			      //Results
			      
			      BW.write(SD+"%%###"+Res);
			      BW.newLine();
			      
		}
		
		BW.close();
		BR.close();
		}

}
