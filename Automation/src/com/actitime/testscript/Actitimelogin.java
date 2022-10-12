package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseActitime;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class Actitimelogin extends BaseActitime{
	@Test
	public void loginpage() {
		Reporter.log("loginpage",true);
		Assert.fail();
	}

}
