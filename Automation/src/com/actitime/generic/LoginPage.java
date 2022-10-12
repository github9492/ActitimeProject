package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "username")
	private WebElement untbx;
	
	@FindBy(name ="pwd")
	private WebElement pswtbx;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbx;
	
	
	// if we dont use this counstructor in this generic package we have to declare it in 
	// testMethod 
	
	//public LoginPage(WebDriver driver) {
	//PageFactory.initElements(driver, this);
	
	//}
	public void setlogin(String un , String pw) {
		untbx.sendKeys(un);
		pswtbx.sendKeys(pw);
		loginbx.click();
	}

}
