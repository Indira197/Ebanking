package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BNotepad {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
        Library LB=new Library();
        LB.OpenApp("http://122.175.8.158/ranford2");
    	LB.AdminLgn("Admin","Te$ting@");

		
		
		//To get test data file path
		
		String Fpath="E:\\AutomationWorkspace\\Ebanking\\src\\com\\ebanking\\testdata\\Branch.txt";
		
		//To get Results file path
		
		String Rpath="E:\\AutomationWorkspace\\Ebanking\\src\\com\\ebanking\\results\\Res_Branch.txt";
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
			
			String SR[]=SD.split("%%%%");
			
			      String brname=SR[0];
			      String bradd=SR[1];
			      String brarea=SR[2];
			      String brzipcode=SR[3];
			      String brctry=SR[4];
			      String brstate=SR[5];
			      String brcity=SR[6];
			      
			 String Res=LB.Branches(brname, bradd, brarea, brzipcode, brctry, brstate, brcity);
			      System.out.println(Res);
			      
			      //Results
			      
			      BW.write(SD+"####"+Res);
			      BW.newLine();
			      
		}
		
		BW.close();
		BR.close();
		}

}
