package com.wd.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C36OrangeHrmLoginLogout {

	public static void main(String[] args) throws InterruptedException {
		// configure browser driver
		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");
		//open chrome browser
		WebDriver driver = new ChromeDriver();
		
		//wait for page load
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		//wait for element load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		//enter text on user name
		driver.findElement(By.id("txtUsername")).sendKeys("admin");

		//enter text on password
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		
		//click on login button
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(1000);
		
		//click on welcome admin
		driver.findElement(By.id("welcome")).click();
		
		//click on logout
		driver.findElement(By.linkText("Logout")).click();
	}

}











