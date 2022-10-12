package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertprgm {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	@Test
	public void verifyTitle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String etitle = "Google";
		String atitle = driver.getTitle();
		
	//	Assert.assertEquals(etitle, atitle);
   // HERE IF WE HAVE MORE THAN ONE STATEMENT AND THE FIRST STATEMENT IS FAIL THEN IT WILL NOT EXECUTE THE 
  //  REST STATEMENT ... SO INSTEAD OF USING ASSERT METHOD WE GO FOR SOFT ASSERT (HERE ALL METHOD ARE  NON STATIC METHOD)
 // SO WE TO CALL THE METHOD BY CREATING OBJECT REFERENCE ....
		
		SoftAssert s =  new SoftAssert();
		s.assertEquals(etitle, atitle);
		driver.close();
		s.assertAll();        // THIS METHOD IS MANDATORY AT THE LAST FOR SOFT ASSERT.....
	}

}
