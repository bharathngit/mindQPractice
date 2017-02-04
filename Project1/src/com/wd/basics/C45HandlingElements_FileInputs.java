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

public class C45HandlingElements_FileInputs {

	public static void main(String[] args) throws InterruptedException, AWTException {

		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bharath/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.navigate().to("http://opensource.demo.orangehrmlive.com");
		
		//enter text on username
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		//enter text on password
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin");
		//click on login button
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		//click on PIM link
		driver.findElement(By.linkText("PIM")).click();
		//click on add employee link
		driver.findElement(By.linkText("Add Employee")).click();
		//enter text on first name
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Bharath");
		//enter text on last name
		driver.findElement(By.cssSelector("#lastName")).sendKeys("Nad");
			
		//upload photo
		driver.findElement(By.id("photofile")).click();
		
		Thread.sleep(1000);
		
		//java robot class will be used to control keyboard and mouse
		
		String flPath = "C:\\Users\\Bharath\\Downloads\\photo.jpg";
		
		StringSelection strSel = new StringSelection(flPath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel, null);//Stores copied data to clipboard
		Robot robo = new Robot();
		//pressing ctrl+v
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		//releasing v+ctrl
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		
		//Giving sleep in between every action is a best practice, when using Robot or Actions class
		Thread.sleep(1000);
		//Pressing Enter key
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		//click on save button
		driver.findElement(By.cssSelector("#btnSave")).click();

	}

}







