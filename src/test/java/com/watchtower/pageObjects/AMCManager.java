package com.watchtower.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AMCManager 
{
	
WebDriver ldriver;

	
	public AMCManager(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	public void clickAMCManager() throws InterruptedException
	{
		
		ldriver.findElement(By.xpath("(//*[text()='AMC Manager' ])[1]")).click();
			
	}
	public void searchFunction()
	{
		WebElement searchbox = ldriver.findElement(By.name("search"));
		searchbox.clear();
		searchbox.sendKeys("AMC 1");
		searchbox.sendKeys(Keys.ENTER);
		
	}
}
