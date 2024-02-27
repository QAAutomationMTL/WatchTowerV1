package com.watchtower.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserManager
{

WebDriver ldriver;

	
	public UserManager(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	public void clickUserManager() throws InterruptedException
	{
		
		ldriver.findElement(By.xpath("(//*[text()='User Manager' ])[1]")).click();
			
	}
	public void clickAddNewUser() throws InterruptedException
	{
		//addnewclient.click();
		Thread.sleep(1000);
		ldriver.findElement(By.xpath("(//*[text()='Add new user' ])[1]")).click();
	}
	public void addUserDetails() throws InterruptedException
	{
		ldriver.findElement(By.name("username")).sendKeys("SalesManager");
		ldriver.findElement(By.name("name")).sendKeys("Jeena");
		ldriver.findElement(By.name("email")).sendKeys("jeena@gmail.com");
		
		WebElement usertype = ldriver.findElement(By.name("user_type"));
		Select selectusertype=new Select(usertype);
		selectusertype.selectByIndex(2);
		//Thread.sleep(2000);
		
		ldriver.findElement(By.name("password")).sendKeys("jeena@123");
		ldriver.findElement(By.name("confirm_password")).sendKeys("jeena@123");
		
		ldriver.findElement(By.xpath("(//*[text()='Add' ])[1]")).click();
	}
	public void searchFunction()
	{
		WebElement searchbox = ldriver.findElement(By.name("search"));
		searchbox.clear();
		searchbox.sendKeys("aimee-sales");
		//searchbox.sendKeys(Keys.ENTER);
		
	}
}
