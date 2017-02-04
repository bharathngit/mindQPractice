package com.Class.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class getLocatorPOF {
	//Declare a constructor and intialize all the elements in FindBy
	public getLocatorPOF(WebDriver driver) {
		// "this" keyword represents the current class
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//input[@name='txtUsername']") WebElement txtUsername;
@FindBy(xpath="//input[@name='txtPassword']") WebElement txtPassword;
@FindBy(linkText="PIM")WebElement lnkPim;
}
