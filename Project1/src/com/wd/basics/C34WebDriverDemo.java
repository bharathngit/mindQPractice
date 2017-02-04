package com.wd.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class C34WebDriverDemo {

	public static void main(String[] args) {
		
		//configure browser driver
		System.setProperty("webdriver.ie.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\IEDriverServer64.exe");
		
		//open chrome window
		WebDriver driver = new InternetExplorerDriver();
		
		//navigate to url
		driver.get("http://google.com");
		
		//print opened page title
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}






