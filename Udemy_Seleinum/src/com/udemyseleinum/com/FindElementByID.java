package com.udemyseleinum.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByID {

	 public static  void Driverinfo() 
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubham\\Desktop\\testing\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();

			//driver.get("https://www.selenium.dev/");
		//	System.out.println(driver.getTitle());
		//	driver.get("http://google.co.in");
		//	System.out.println(driver.getTitle());
			driver.get("https://www.facebook.com/");
			System.out.println(driver.getTitle());
	        
			driver.findElement(By.id("email")).sendKeys("abc@c.com");
			
			driver.findElement(By.linkText("Forgotten account?")).click();
			
			
			
	 }
	
	 public static class driver{
		 public static WebDriver  MyDriver()
		 {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubham\\Desktop\\testing\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.facebook.com/");
			 
				
			 return driver;
			 
		 }
		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Driverinfo();
		
		
	}

}
