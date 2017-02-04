package com.testng.basics.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class POMDriverTestNG {

	OhrmIntegDriverTestNG integDr;
	@BeforeClass
	@Parameters({"browserType","appURL"})
	public void openApp(String bname, String appUrl){

		integDr=new OhrmIntegDriverTestNG(bname,appUrl);
		
	}
	@AfterClass
	public void closeBrowser(){
		
		System.out.println("CLosing browser!");
		Reporter.log("CLosing browser!");
		integDr.driver.close();//Closing browser
		//integDr.driver.quit();

	}
	@Test(priority=1)
	public void login(){
		
				integDr.loginPage.enterUname("admin");
				integDr.loginPage.enterPwd("admin");
				integDr.loginPage.submit();
	}
	@Test(priority=2)
	public void addEmp(){
		
		integDr.welPage.clickPIM();
		integDr.welPage.clickAddEmp();
		integDr.welPage.enterFirstName("Firstname");
		integDr.welPage.enterLastName("Lastname");
		
	}

}







