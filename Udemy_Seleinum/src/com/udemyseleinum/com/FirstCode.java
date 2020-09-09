package com.udemyseleinum.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubham\\Desktop\\testing\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();

	driver.get("https://www.selenium.dev/");
	System.out.println(driver.getTitle());
	driver.get("http://google.co.in");
	System.out.println(driver.getTitle());
	
	driver.navigate().back();
	System.out.println(driver.getTitle());
	
	driver.close();
	}}
