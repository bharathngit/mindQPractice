package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C41HandlingElements_Duplicate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:/SeleniumSoftware/BrowserDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		/* Elelements which are having same or no attribute becomes duplicate
			elements for webdriver
		 * we can use xpath to find elements uniquely
		 * if the element is not unique using xpath or css techniques then we use 
		 	findElements
		 *findElements return list of elements with the provided locator
		 *in source code which elements comes first that will have first index
		 */

		driver.navigate().to("http://opensource.demo.orangehrmlive.com");

		List<WebElement>lstElm = driver.findElements(By.xpath("//a[@class='loginadmin']"));
		//clicks on first element
		lstElm.get(0).click();
	}

}








