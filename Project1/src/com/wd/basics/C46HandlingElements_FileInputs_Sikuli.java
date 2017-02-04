package com.wd.basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class C46HandlingElements_FileInputs_Sikuli {

	public static void main(String[] args) throws InterruptedException,
			AWTException, FindFailed {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Bharath/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.navigate().to("http://opensource.demo.orangehrmlive.com");
		Thread.sleep(10000);
		// enter text on username
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(
				"admin");
		// enter text on password
		driver.findElement(By.xpath("//*[@id='txtPassword']"))
				.sendKeys("admin");
		// click on login button
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		// click on PIM link
		driver.findElement(By.linkText("PIM")).click();
		// click on add employee link
		driver.findElement(By.linkText("Add Employee")).click();
		// enter text on first name
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(
				"selenium");
		// enter text on last name
		driver.findElement(By.cssSelector("#lastName")).sendKeys("hq");

		// upload photo
		driver.findElement(By.id("photofile")).click();

		Thread.sleep(1000);

		// SIKULI will find the elements using element images
		//we have to capture element images using snipping tool
		//make sure the application is in foreground in order to work any program that has sikuli api calls
		

		String flPath = "C:\\Users\\Bharath\\Downloads\\photo.jpg";
		
		Screen scr = new Screen();
		
		String elmImgPath = "C:\\Users\\Bharath\\Downloads";
		scr.type(elmImgPath+"\\photo.jpg",flPath);
		scr.click(elmImgPath+"\\btnOpen.JPG");
		
/*		StringSelection strSel = new StringSelection(flPath);
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(strSel, null);
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
*/
		// click on save button
		driver.findElement(By.cssSelector("#btnSave")).click();

	}

}
