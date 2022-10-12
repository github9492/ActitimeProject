package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.generic.LoginPage;

public class TestMethodLogin {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
@Test 
public void validLogin() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	LoginPage l = new LoginPage();
	PageFactory.initElements(driver, l);
	l.setlogin("admin","manager");
}
}
