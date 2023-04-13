package com.ohrm.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ohrm.pages.LoginPage;
import com.ohrm.pages.RecruitmentPage;

public class RecruitmentTest {
	
LoginPage lp;
	
	@BeforeMethod
	public void browserConfig()
	{
		lp=new LoginPage();
		lp.initialization();			
	}
	
	@Test
	public void validateRecruitment() {
		lp.login();
		RecruitmentPage rec=new RecruitmentPage();
		rec.recruitment();	
	}
	
	@Test
	public void validateCandidate() {
		lp.login();
		RecruitmentPage rec=new RecruitmentPage();
		rec.candidate();	
	}
	
	@Test
	public void validateResumeUploaderTextbox() {
		lp.login();
		RecruitmentPage rec=new RecruitmentPage();
		rec.uploadResumeTextbox();	
	}
	
	
	@Test
	public void validateResumeUploader() {
		lp.login();
		RecruitmentPage rec=new RecruitmentPage();
		rec.uploadResume();	
	}
	
	@Test
	public void validateResumeUploaderLargeFiles() {
		lp.login();
		RecruitmentPage rec=new RecruitmentPage();
		rec.uploadResumeLargeFiles();	
	}
	

	@Test
	public void validateViewIcon() {
		lp.login();
		RecruitmentPage rec=new RecruitmentPage();
		rec.viewIcon();	
	}
	
	@Test
	public void validateDownloadIcon() {
		lp.login();
		RecruitmentPage rec=new RecruitmentPage();
		rec.downloadIcon();	
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		lp.tearDown();
	}
	
	
}
