package com.wd.basics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class C35WebDriverAllBrowsers {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter browser name");
		String brName = scn.next();
		
		switch(brName.toLowerCase()){
		case "ff":
			//configure browser driver
			System.setProperty("webdriver.gecko.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\geckodriver.exe");
			
			//open chrome window
			driver = new FirefoxDriver();
			break;
		case "chrome":
			//configure browser driver
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");
			
			//open chrome window
			 driver = new ChromeDriver();
			 break;
		case "ie":
			//configure browser driver
			System.setProperty("webdriver.ie.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\IEDriverServer64.exe");
			
			//open chrome window
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("no valid browser found");
			System.exit(0);			
		}
		
		
		//navigate to url
		driver.get("http://google.com");
		
		//print opened page title
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}






