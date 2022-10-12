package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotationprgm {
	@BeforeClass
	public void OpenBrowser() {
		Reporter.log("OpenBrowser",true);
	}
	
	
	
	@AfterClass
	public void CloseBrowser() {
		Reporter.log("CloseBrowser",true);
	}
	
	
		
	
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	
	

	@Test
	public void CreateCustomer() {
		Reporter.log("CreateCustomer",true);
	}
	
	
	
	@Test
	public void DeleteCustomer() {
		Reporter.log("DeleteCustomer",true);
	}
	
}
