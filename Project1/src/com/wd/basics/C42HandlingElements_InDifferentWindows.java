package com.wd.basics;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C42HandlingElements_InDifferentWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bharath/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.navigate().to("https://www.linkedin.com/start/join");

		// by default findElement will find the elements in the window opened by
		// program
		// sometimes in application when you click on a link or button or
		// something a new browser window will get open
		// to instruct program to find the elements in newly opened window wee
		// need to switch window
		// To switch a window we have to use handler value
		// to get handler value we have to use getWindowHandles method
		// This method will return set of handler values of windows which are in
		// the current session
		// we have to switch to every window by using handler value and get the
		// title of that window
		// If the window title matches the we stop the switching and continue
		// operations on that switched window
		
		//this will open facebook window
		driver.findElement(By.xpath("//button[@class='fb-btn']")).click();
		//Linkedin's window handle is retireved by the below line
		String cWndHandle = driver.getWindowHandle();

		// switch to facebook window

		switchToWindowByTitle(driver, "facebook");
		/*Set<String> wndHandles = driver.getWindowHandles();

		for (String wnd : wndHandles) {
			System.out.println(wnd);
			driver.switchTo().window(wnd);

			if (driver.getTitle().equalsIgnoreCase("facebook")) {
				break;
			}
		}
*/
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(
				"sudhakar@qtpsudhakar.com");
		Thread.sleep(3000);
		//close the facebook window
		//close method will close the focused window
		driver.close();
		
		
		driver.switchTo().window(cWndHandle); //Switches to linkedin window
		driver.findElement(By.xpath("//*[@id='first-name']")).sendKeys("abcd"); //Enters abcd in firstname field
		Thread.sleep(3000);
		//close all opened windows by session
		driver.quit();
	}

	public static void switchToWindowByTitle(WebDriver driver, String pageTitle) {
		//get windowhandles returns a set of values, hence Set<> is declared
		Set<String> wndHandles = driver.getWindowHandles();

		for (String wnd : wndHandles) {
			System.out.println(wnd);
			driver.switchTo().window(wnd);

			if (driver.getTitle().equalsIgnoreCase(pageTitle)) {
				System.out.println("switched to "+pageTitle+" window");
				break;
			}
		}
	}
}
