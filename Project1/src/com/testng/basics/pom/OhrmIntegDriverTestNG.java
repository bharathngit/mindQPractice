package com.testng.basics.pom;

import java.util.concurrent.TimeUnit;

import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OhrmIntegDriverTestNG {
	
	WebDriver driver;
	LoginPageObjMTestNG loginPage;
	WelcomPageObjMTestNG welPage;
	
	//Constructor to initialize instances of all page classes
	public OhrmIntegDriverTestNG(String brName,String apUrl) {
	
	openApp(brName,apUrl); //NOTE!! Open the browser and then create instances of pages
	
	loginPage=new LoginPageObjMTestNG(driver);
	welPage=new WelcomPageObjMTestNG(driver);
	}
	
	public void openApp(String browser, String appURL){
		switch(browser.toLowerCase()){
		case "chrome":
			System.setProperty("webdriver.chrome.driver", 
					"C:/Users/Bharath/Downloads/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		case "ff":
			System.setProperty("webdriver.chrome.driver", 
					"C:/Users/Bharath/Downloads/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		}
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.navigate().to(appURL);
	}
}
