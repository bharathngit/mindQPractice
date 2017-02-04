package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C39HandlingElements_Tables_GetData {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:/SeleniumSoftware/BrowserDrivers/chromedriver.exe");
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

		//find emp tabel
		WebElement empTable = driver.findElement(By.id("resultTable"));
		
		List<WebElement> trLst = empTable.findElements(By.tagName("tr"));
				
		//print headers
		List<WebElement> thLst = trLst.get(0).findElements(By.tagName("th"));
		for(int h=0;h<thLst.size();h++){
			System.out.println(thLst.get(h).getText());
		}
		
		//print data
		for(int r=1;r<trLst.size();r++){
				List<WebElement> tdLst = trLst.get(r).findElements(By.tagName("td"));
				for(int c=0;c<tdLst.size();c++){
					System.out.println(tdLst.get(c).getText());
				}
		}
	}

}










