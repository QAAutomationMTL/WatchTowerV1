package com.watchtower.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Settings {
	
WebDriver ldriver;

	
	public Settings(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	public void clickSettings() throws InterruptedException
	{
		
		ldriver.findElement(By.xpath("(//*[text()='Settings' ])[1]")).click();
			
	}
	public void clickAddNewCurrency() throws InterruptedException
	{
		//addnewclient.click();
		Thread.sleep(1000);
		ldriver.findElement(By.xpath("(//*[text()='Add new currency' ])[1]")).click();
	}
	public void clickAddCurrencyDetails() throws InterruptedException
	{
		ldriver.findElement(By.name("name")).sendKeys("US Dollar");
		ldriver.findElement(By.name("code")).sendKeys("USD");
		ldriver.findElement(By.xpath("(//*[text()='Add' ])[1]")).click();
	}
	public void SearchFunction() throws InterruptedException
	{
		ldriver.findElement(By.name("search")).sendKeys("US Dollar");
		
	}
	public void clickCountries() throws InterruptedException
	{
		
		ldriver.findElement(By.xpath("(//*[text()='Countries' ])[1]")).click();
			
	}
	
}
