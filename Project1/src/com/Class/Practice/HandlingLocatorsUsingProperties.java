package com.Class.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingLocatorsUsingProperties {

	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bharath/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//navigate to page
		//driver.get("http://opensource.demo.orangehrmlive.com");
		
		driver.navigate().to("http://opensource.demo.orangehrmlive.com");
		getLocatorPOF pofLoc=new getLocatorPOF(driver);
		//enter text on username using POM locator
		driver.findElement(getLocatorPOM.txtUsername).sendKeys("admin"); //Here we have replaced By.xpath("xpath") with txtUsername
		//enter text on password using POM locator
		driver.findElement(getLocatorPOM.txtPassword).sendKeys("admin");
		//click on login button
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		//click on PIM link using POF locators
		pofLoc.lnkPim.click();
		//click on add employee link
		driver.findElement(By.linkText("Add Employee")).click();
		//enter text on first name
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("selenium");
		//enter text on last name
		driver.findElement(By.cssSelector("#lastName")).sendKeys("hq");
		
		//select login details check box
		WebElement elm = driver.findElement(By.cssSelector("#chkLogin"));
		
		//select checkbox
		if(elm.isSelected()!=true){
			elm.click();
		}
		Thread.sleep(3000);
		//deselect checkbox
		if(elm.isSelected()){
			elm.click();
		}
		
		//click on save button
		driver.findElement(By.cssSelector("#btnSave")).click();
		//click on edit button
		driver.findElement(By.xpath("//input[@value='Edit']")).click();
		//select gender as female
		driver.findElement(By.xpath("//input[@name='personal[optGender]'][@value='2']")).click();
		
		//select list value as indian		
		new Select(driver.findElement(By.xpath("//*[@id='personal_cmbNation']"))).selectByVisibleText("Indian");
		
		/*WebElement elmCountry = driver.findElement(By.xpath("//*[@id='personal_cmbNation']"));
		new Select(elmCountry).selectByVisibleText("Indian");
		*/
		
	}

}







