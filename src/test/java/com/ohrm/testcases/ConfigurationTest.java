package com.ohrm.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ohrm.pages.AddEmployeePage;
import com.ohrm.pages.ConfigurationPage;
import com.ohrm.pages.LoginPage;

public class ConfigurationTest {
	
	LoginPage lp;
	
	@BeforeMethod
	public void browserConfig()
	{
		lp=new LoginPage();
		lp.initialization();
				
	}
	
	@Test
	public void validateConfiguration() 
	{
		lp.login();
		ConfigurationPage con=new ConfigurationPage();
		con.configuration();	
	}
	
	@Test
	public void validateReports()
	{
		lp.login();
		ConfigurationPage con=new ConfigurationPage();
		con.reports();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		lp.tearDown();
	}

}
