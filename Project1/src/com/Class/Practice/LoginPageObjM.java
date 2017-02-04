package com.Class.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjM {
WebDriver driver;

	public LoginPageObjM(WebDriver driver) {
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
	}
	public void enterPwd(String pwd){
		txtPassword().sendKeys(pwd);
		System.out.println(pwd+" was entered in Username field");
	}
	public void submit(){
		loginButton().click();
		System.out.println("Clicked login button");
	}
}
