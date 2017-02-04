package com.wd.basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class C32FfDemo {

	public static void main(String[] args) {
		
		//configure browser driver
		System.setProperty("webdriver.gecko.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\geckodriver.exe");
		
		//open chrome window
		FirefoxDriver driver = new FirefoxDriver();
		
		//navigate to url
		driver.get("http://google.com");
		
		//print opened page title
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}






