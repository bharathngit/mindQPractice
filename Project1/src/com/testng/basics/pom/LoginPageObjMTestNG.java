package com.testng.basics.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class LoginPageObjMTestNG {
WebDriver driver;

	public LoginPageObjMTestNG(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}
	
	//Locating objects
	public WebElement txtUsername(){
		return driver.findElement(By.xpath("//input[@name='txtUsername']"));
		
	}
	public WebElement txtPassword(){
		return driver.findElement(By.xpath("//input[@name='txtPassword']"));
		
	}
	//click on login button
	public WebElement loginButton(){
		return driver.findElement(By.xpath("//input[@value='LOGIN']"));	
	}
	
			
	//Operation method
	public void enterUname(String uname){
		txtUsername().sendKeys(uname);
		System.out.println(uname+" was entered in Username field");
		Reporter.log(uname+" was entered in Username field");
	}
	public void enterPwd(String pwd){
		txtPassword().sendKeys(pwd);
		System.out.println(pwd+" was entered in Username field");
		Reporter.log(pwd+" was entered in Username field");
	}
	public void submit(){
		loginButton().click();
		System.out.println("Clicked login button");
		Reporter.log("Clicked login button");

	}
}
