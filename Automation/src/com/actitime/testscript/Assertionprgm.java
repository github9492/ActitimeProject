package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertionprgm {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	@Test
	public void verifyTitle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String etitle = "Google";
		String atitle = driver.getTitle();
		
		// I we use if condition in testng annotation it will execute even if the title didnt match it 
		// doesnt have capacity  to fail the testscript; 
		/*if(atitle .equals(etitle)) {
			Reporter.log("Title is matching and pass",true);
		}
		else {
			Reporter.log("title is not matching and fails",false);
		}
		*/
		
		// INSTEAD OF THIS WE WILL GO WITH ASSERT METHOD ....
		
		Assert.assertEquals(etitle, atitle);
		
		driver.close();
	}

}
