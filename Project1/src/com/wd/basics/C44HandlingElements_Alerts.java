package com.wd.basics;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C44HandlingElements_Alerts {

	public static void main(String[] args) throws InterruptedException {

		// alert is generated by javascript
		// When alert occurs you must handle alert othervise it will not allow
		// to do any other operations on application
		// We also get alerts generated by html
		
		// alerts that are generated by javascript 
			//right click will not work
			//no source code will be displayed
			//not colorful
			//will not allow you to do other operations
			//you have to switch alert to handle using webdriver 
		//Alert generated by html
			//you can use the findelement technique to handle
			//you can see the source code
			//mostly these are colorful
			//right works
		/*sometimes we see model dialogs
		 * These are windows which will not allow rightclick
		 * Some times even inspect element will not work
		 * in such case getwindowhandles and switch to window
		 * use driver.getPageSource() to get the source code
		 * and find the element using attributes that are specified in source code
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bharath/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.navigate().to(
				"https://landfill.bugzilla.org/bugzilla-5.0-branch/");

		driver.findElement(By.xpath("//*[@id='find_top']")).click();

		Thread.sleep(3000);

		// switch to alert
		Alert alert = driver.switchTo().alert();

		// click on ok button
		alert.accept();
		driver.findElement(By.xpath("//*[@id='quicksearch_main']")).sendKeys(
				"123");
		/*
		 * //click on cancel alert.dismiss();
		 * 
		 * //send keys and click on ok alert.sendKeys("test"); alert.accept();
		 */

	}

}