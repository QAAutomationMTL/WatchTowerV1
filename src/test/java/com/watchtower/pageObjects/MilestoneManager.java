package com.watchtower.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MilestoneManager {
	
WebDriver ldriver;

	
	public MilestoneManager(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	public void clickMilestoneManager() throws InterruptedException
	{
		
		ldriver.findElement(By.xpath("(//*[text()='Milestone Manager' ])[1]")).click();
			
	}
	public void searchFunction()
	{
		WebElement searchbox = ldriver.findElement(By.name("search"));
		searchbox.clear();
		searchbox.sendKeys("ABC Constructions");
		//searchbox.sendKeys(Keys.ENTER);
		
	}
}

