package com.watchtower.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	public void SearchFunctionCurrency() throws InterruptedException
	{
		ldriver.findElement(By.name("search")).sendKeys("US Dollar");
		
	}
	public void clickCountries() throws InterruptedException
	{
		
		//ldriver.findElement(By.xpath("(//*[text()='Countries' ])[1]")).click();
		ldriver.navigate().to("https://qa.watchtower-frontend.srv1.mtlstaging.com/settings/countries");
			
	}
	public void clickAddNewCountry() throws InterruptedException
	{
		//addnewclient.click();
		Thread.sleep(1000);
		ldriver.findElement(By.xpath("(//*[text()='Add new country' ])[1]")).click();
	}
	public void clickAddCountryDetails() throws InterruptedException
	{
		ldriver.findElement(By.name("name")).sendKeys("UAE");
		ldriver.findElement(By.xpath("(//*[text()='Add' ])[1]")).click();
		
	}
	public void SearchFunctionCountry() throws InterruptedException
	{
		ldriver.findElement(By.name("search")).sendKeys("UAE");
		
	}
	public void clickStates() throws InterruptedException
	{
		
		//ldriver.findElement(By.xpath("(//*[text()='States' ])[1]")).click();
		ldriver.navigate().to("https://qa.watchtower-frontend.srv1.mtlstaging.com/settings/states");
			
	}
	public void clickAddNewState() throws InterruptedException
	{
		
		ldriver.findElement(By.xpath("(//*[text()='Add new state' ])[1]")).click();
	}
	public void clickAddStateDetails() throws InterruptedException
	{
		Thread.sleep(1000);
		WebElement scountry=ldriver.findElement(By.name("country"));
		Select selectcountry=new Select(scountry);
		selectcountry.selectByVisibleText("UAE");
		ldriver.findElement(By.name("name")).sendKeys("Sharja");
		ldriver.findElement(By.xpath("(//*[text()='Add' ])[1]")).click();
		
	}
	public void SearchFunctionState() throws InterruptedException
	{
		ldriver.findElement(By.name("search")).sendKeys("Sharja");
		
	}
}
