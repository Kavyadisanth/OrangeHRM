package com.ohrm.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ohrm.base.OHRMBase;

public class LoginPage extends OHRMBase{
	

public void login()
	{ 
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
