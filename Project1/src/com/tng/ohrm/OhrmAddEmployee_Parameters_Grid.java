package com.tng.ohrm;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OhrmAddEmployee_Parameters_Grid {
	WebDriver driver;

	@BeforeClass
	@Parameters({ "browsertype", "appUrl" ,"nurl"})
	public void OpenApp(String bName, String aUrl,String nodeUrl) throws MalformedURLException {

		switch (bName.toLowerCase()) {
		case "ff":

			// open Firefox window
			driver = new RemoteWebDriver(new URL(nodeUrl), 
					DesiredCapabilities.firefox());
			break;
		case "chrome":
			// open chrome window
			driver = new RemoteWebDriver(new URL(nodeUrl), 
					DesiredCapabilities.chrome());
			break;
		case "ie":

			// open IE window
			driver = new RemoteWebDriver(new URL(nodeUrl), 
					DesiredCapabilities.internetExplorer());
			break;
		default:
			System.out.println("no valid browser found");
			// to make test fail
			Assert.fail();
		}

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.navigate().to(aUrl);

	}

	@AfterClass
	public void CloseApp() {
		driver.close();
	}

	@Test
	public void Login() {
		// enter text on username
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(
				"admin");
		// enter text on password
		driver.findElement(By.xpath("//*[@id='txtPassword']"))
				.sendKeys("admin");
		// click on login button
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

	}

	@Test(dependsOnMethods = { "Login" })
	public void AddEmployee() {
		// click on PIM link
		driver.findElement(By.linkText("PIM")).click();
		// click on add employee link
		driver.findElement(By.linkText("Add Employee")).click();
		// enter text on first name
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(
				"selenium");
		// enter text on last name
		driver.findElement(By.cssSelector("#lastName")).sendKeys("hq");
		// click on save button
		driver.findElement(By.cssSelector("#btnSave")).click();

	}
}
