package com.ohrm.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ohrm.pages.LoginPage;
import com.ohrm.pages.RecruitmentPage;
import com.ohrm.pages.VacanciesPage;

public class VacanciesTest {

LoginPage lp;
	
	@BeforeMethod
	public void browserConfig()
			{
				lp=new LoginPage();
				lp.initialization();
				
			}
	
	@Test
	public void validateVacancies() {
		lp.login();
		VacanciesPage vac=new VacanciesPage();
		vac.vacancies();	
	}
	
	@Test
	public void validateJobTitleDropdown() {
		lp.login();
		VacanciesPage vac=new VacanciesPage();
		vac.jobTitleDropdown();	
	}
	
	
	
	@Test
	public void validateReset()
	{
		lp.login();
		VacanciesPage vac=new VacanciesPage();
		vac.reset();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		lp.tearDown();
	}
}
