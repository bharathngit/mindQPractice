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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class C49HandlingElements_Wait {

	public static void main(String[] args) throws InterruptedException,
			AWTException, FindFailed {

		//two kinds of wait: 
		/*
		 * implicit wait: not specific to element or statement
		 * 	pageloadtime,implicitlywait
		 * explicit wait: specific to element or statement
		 * 	thread.sleep/webdriver wait
		 * 
		 * Using webdriver wait we can wait for elements status, elements attribues
		 * or any condition you give
		 * to provide conditions we use ExpectedConditions class
		 * 
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bharath/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.navigate().to("http://opensource.demo.orangehrmlive.com");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		//when any expected condition is taking element as input it will use implicitly wait and then webdriverwait
		//when any expected condition is taking locator as input it will use webdriverwait
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='txtUsername1']")));
		
		
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(
				"admin");
		
		//wait for element to be there in source code
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='password']")));
		//wait for element to be visible in page		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='password']"))));
	}

}





