package com.testng.basics.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomPageObjMTestNG {
	WebDriver driver;
	
	public WelcomPageObjMTestNG(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locators
	public WebElement linkPIM(){
		return driver.findElement(By.linkText("PIM"));
	}
	public WebElement addEmp(){
		return driver.findElement(By.linkText("Add Employee"));
	}
	
	public WebElement firstName(){
		return driver.findElement(By.xpath("//*[@id='firstName']")); 
	}
	public WebElement lastName(){
		return driver.findElement(By.cssSelector("#lastName")); 
	}	
	
	//Operation methods
	public void clickPIM(){
		linkPIM().click();
		System.out.println("Clicked on PIM link");
	}
	public void clickAddEmp(){
		addEmp().click();
		System.out.println("Clicked on Add Emp link");
	}
	
	
	public void enterFirstName(String fname){
		firstName().sendKeys(fname);
		System.out.println("Entered "+fname+" in Firstname field");
	}
	public void enterLastName(String lname){
		lastName().sendKeys(lname);
		System.out.println("Entered "+lname+" in lastname field");
	}
}
