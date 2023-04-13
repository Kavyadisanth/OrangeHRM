package com.ohrm.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.ohrm.pages.LoginPage;
import com.ohrm.pages.PIMPage;

public class PIMTest{
	
	LoginPage lp;
	
	@BeforeMethod
	public void browserConfig()
	{
		lp=new LoginPage();
		lp.initialization();			
	}
	
	@Test
	public void validatePIM() {
		lp.login();
		PIMPage pim=new PIMPage();
		pim.pim();	
	}
	

	@Test
	public void validatePIMEmployeeList() {
		lp.login();
		PIMPage pim=new PIMPage();
		pim.pimEmployeeList();	
	}
	

	@Test
	public void validatePIMEdit() {
		lp.login();
		PIMPage pim=new PIMPage();
		pim.pimEdit();	
	}
	
	
	@Test
	public void deletePIM() {
		lp.login();
		PIMPage pim=new PIMPage();
		pim.pimDelete();
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		lp.tearDown();
	}
	
	

}
