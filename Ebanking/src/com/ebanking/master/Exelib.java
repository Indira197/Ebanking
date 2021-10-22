package com.ebanking.master;

import java.io.IOException;

public class Exelib {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		Library LB = new Library();
		LB.OpenApp("http://122.175.8.158/ranford2");
		LB.AdminLgn("Admin","Te$ting@");
		LB.Branches("mindqkphb", "jntuh", "kphb", "52202", "INDIA", "GOA", "GOA");
		LB.Roles("Developing", "lead", "E");
		LB.Employee("Induja", "induja123", "Accountant", "12");
		LB.Logout();
		LB.Closeapp();
	}

}
