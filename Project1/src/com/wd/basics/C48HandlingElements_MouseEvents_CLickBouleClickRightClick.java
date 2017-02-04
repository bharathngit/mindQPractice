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

public class C48HandlingElements_MouseEvents_CLickBouleClickRightClick {

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
		
		Actions act = new Actions(driver);
		
		
		// enter text on username
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(
				"admin");
		
		Thread.sleep(1000);
		//double click on txtUSerName
		act.doubleClick(driver.findElement(By.xpath("//input[@name='txtUsername']"))).build().perform();
		Thread.sleep(2000);
		//send ctrl+x keys
		act.sendKeys(Keys.CONTROL+"x").build().perform();
		Thread.sleep(1000);
		//right click on username text box
		act.contextClick(driver.findElement(By.xpath("//input[@name='txtUsername']"))).build().perform();
		Thread.sleep(1000);
		//act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
		
		Thread.sleep(1000);
		
		// enter text on password
		/*driver.findElement(By.xpath("//*[@id='txtPassword']"))
				.sendKeys("admin");*/
		act.click(driver.findElement(By.xpath("//*[@id='txtPassword']"))).build().perform();
				
		Thread.sleep(1000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection("admin"), null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		
		// click on login button
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

			}

}






