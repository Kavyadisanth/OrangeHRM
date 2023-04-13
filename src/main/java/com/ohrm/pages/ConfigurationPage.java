package com.ohrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;

import com.ohrm.base.OHRMBase;

public class ConfigurationPage extends OHRMBase{
	
	public void configuration()
	{
	driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//span[text()='PIM']")).click();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span")).click();
	}
	
	public void reports()
	{
		driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]/button/i")).click();
	}

}
