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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class C47HandlingElements_MouseEvents {

	public static void main(String[] args) throws InterruptedException,
			AWTException, FindFailed {

		//click,doubleclick, rightclick, hover, scroll,drag drop
		//sendkeys 
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bharath/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.navigate().to("http://opensource.demo.orangehrmlive.com");
		Thread.sleep(1000);

		//Mouse Hover
		
		//To do any operations related to keyboard or mouse we use Actions class
		// for hovering we have move the cursor on element
		// for that we have use moveToElement
		
		//movetoelement is also used to scroll to an element
		
		
		// enter text on username
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(
				"admin");	
		// enter text on password
		driver.findElement(By.xpath("//*[@id='txtPassword']"))
				.sendKeys("admin");		
		// click on login button
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

		Actions act = new Actions(driver);
		
		//mouse hover on PIM link
		act.moveToElement(driver.findElement(By.linkText("PIM"))).build().perform();
		
		Thread.sleep(1000);
		
		// click on add employee link
		driver.findElement(By.linkText("Add Employee")).click();
		// enter text on first name
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(
				"selenium");
		// enter text on last name
		driver.findElement(By.cssSelector("#lastName")).sendKeys("hq");

		// click on save button
		driver.findElement(By.cssSelector("#btnSave")).click();

		act.moveToElement(driver.findElement(By.xpath("//h1[text()='Attachments']"))).build().perform();
	}

}






