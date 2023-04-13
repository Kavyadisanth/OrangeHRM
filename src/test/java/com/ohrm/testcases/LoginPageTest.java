package com.ohrm.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ohrm.base.OHRMBase;
import com.ohrm.pages.LoginPage;

public class LoginPageTest{
	
	LoginPage lp;
	
	@BeforeMethod
	public void browserConfig()
	{
		lp=new LoginPage();
		lp.initialization();
			
	}
	
	@Test
	public void validateLoginTest()
	{
		lp.login();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		lp.tearDown();
	}
}



