package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample 
 {
	WebDriver driver;

	
	public void abc() throws InterruptedException
	{
		driver=new FirefoxDriver();
	
	     driver.manage().window().maximize();
	     
	     driver.get("http://122.175.8.158/ranford2");
	     
	     Thread.sleep(3000);
	     driver.findElement(By.id("txtuId")).sendKeys("Admin");
			driver.findElement(By.id("txtPword")).sendKeys("Te$ting@");
			driver.findElement(By.id("login")).click();
			driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")).click();
			driver.close();
			

	}
	

}
