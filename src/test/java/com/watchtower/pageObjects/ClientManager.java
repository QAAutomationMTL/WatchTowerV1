package com.watchtower.pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class ClientManager
{
	
WebDriver ldriver;

	
	public ClientManager(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	/*@FindBy(xpath="(//*[text()='Client Manager' ])[1]")
	WebElement clientmanager;
	@FindBy(xpath="(//*[text()='Add new client' ])[1]")
	WebElement addnewclient;*/
	
	
	
	
	public void clickClientManager() throws InterruptedException
	{
		//clientmanager.click();
		//Thread.sleep(1000);
		ldriver.findElement(By.xpath("(//*[text()='Client Manager' ])[1]")).click();
		//WebElement cmmanager=ldriver.findElement(By.xpath("(//*[text()='Client Manager' ])[1]"));
		//JavascriptExecutor js = (JavascriptExecutor) ldriver;
        //js.executeScript("arguments[0].click();", cmmanager);
		//Thread.sleep(1000);
		
		
	}
	public void clickAddNewClient() throws InterruptedException
	{
		//addnewclient.click();
		Thread.sleep(1000);
		ldriver.findElement(By.xpath("(//*[text()='Add new client' ])[1]")).click();
	}
	public void addClientDetails() throws InterruptedException
	{
		ldriver.findElement(By.name("name")).sendKeys("RadisonIndustries");
		ldriver.findElement(By.name("primary_contact")).sendKeys("Anoop");
		ldriver.findElement(By.name("phone")).sendKeys("1234567896");
		ldriver.findElement(By.name("email")).sendKeys("radison123@gmail.com");
		ldriver.findElement(By.name("address")).sendKeys("Mumbai");
		ldriver.findElement(By.name("zip")).sendKeys("686825");
		ldriver.findElement(By.name("registration_number")).sendKeys("1122334455");
		ldriver.findElement(By.name("gst")).sendKeys("55AACCV9022B1Z2");
		ldriver.findElement(By.name("pan")).sendKeys("ABCDE1234F");
		WebElement country = ldriver.findElement(By.name("country"));
		Select selectcountry=new Select(country);
		selectcountry.selectByIndex(1);
		Thread.sleep(2000);
		WebElement state=ldriver.findElement(By.name("state"));
		Select selectstate=new Select(state);
		selectstate.selectByIndex(1);
		ldriver.findElement(By.xpath("(//*[text()='Add' ])[1]")).click();
	}
	public void searchFunction()
	{
		WebElement searchbox = ldriver.findElement(By.name("search"));
		searchbox.clear();
		searchbox.sendKeys("RadisonIndustries");
		//searchbox.sendKeys(Keys.ENTER);
		
	}
	public void deleteClient() throws InterruptedException
	{
		ldriver.findElement(By.xpath("//tbody/tr[1]/td[6]/a[2]")).click();
		Thread.sleep(2000);
		ldriver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/button[2]")).click();
		
		
	}
	
}
