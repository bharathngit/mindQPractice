package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C38HandlingElements_ListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bharath/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//navigate to page
		//driver.get("http://opensource.demo.orangehrmlive.com");
		
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
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("selenium");
		//enter text on last name
		driver.findElement(By.cssSelector("#lastName")).sendKeys("hq");
			
		//click on save button
		driver.findElement(By.cssSelector("#btnSave")).click();
		//click on edit button
		driver.findElement(By.xpath("//input[@value='Edit']")).click();
		//select gender as female
		driver.findElement(By.xpath("//input[@name='personal[optGender]'][@value='2']")).click();
		
		//select list value as indian		
		new Select(driver.findElement(By.xpath("//*[@id='personal_cmbNation']"))).selectByVisibleText("Indian");
		Thread.sleep(2000);
		WebElement elmCountry = driver.findElement(By.xpath("//*[@id='personal_cmbNation']"));
		new Select(elmCountry).selectByValue("2");
		Thread.sleep(2000);
		new Select(elmCountry).selectByIndex(1);
		
		//get all options from list box
		List<WebElement>elmLst =  new Select(elmCountry).getOptions();
		System.out.println("number of Options:"+elmLst.size());
		
		for(WebElement eLst: elmLst){
			System.out.println(eLst.getText());
			
			/*if(eLst.getText().equalsIgnoreCase("Indian")){
				new Select(elmCountry).selectByVisibleText(eLst.getText());
			}*/
		}
	}

}







