package com.udemyseleinum.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubham\\Desktop\\testing\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("arya@look.com");
		

	}

}
