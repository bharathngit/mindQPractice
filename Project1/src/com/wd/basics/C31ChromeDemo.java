package com.wd.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class C31ChromeDemo {

	public static void main(String[] args) {
		
		//configure browser driver
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");
		
		//open chrome window
		ChromeDriver driver = new ChromeDriver();
		
		//navigate to url
		driver.get("http://google.com");
		
		//print opened page title
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}






