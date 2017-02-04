package com.wd.basics;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C43HandlingElements_InFrames {
	// frames are used to keep one html document in another html document
	// for this developers will be using iframe tag
	// we also have frame and frameset tags. But thse tags are not suporting html5
	// if any element is there in a frame wedriver by default will not find them
	// we have to switch to frame to find the elements
	// to switch to frame we can use id/element/index
	// to switch back to mainpage we can use defaultContent
	// ALways find the frame and use it to switch	
	
	//how to find element is there in frame
	//when you right click on element it will display any option related to frame
	//in firepath you will see iframe tag name in top left
	// in IE you nee to see the hierarchy of html code
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bharath/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.navigate().to("http://www.redbus.in/");
		
		driver.findElement(By.xpath("//*[@id='signin-block']")).click();
		driver.findElement(By.xpath("//*[@id='signInLink']")).click();
		
		//switch to frame
		
		//find frame
		WebElement elmFrame = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(elmFrame);		
		
		driver.findElement(By.xpath("//button[text()='signup with email']")).click();

		//switch to main window
		driver.switchTo().defaultContent();
		
		//switch parent frame
		//driver.switchTo().parentFrame();
	}

}






