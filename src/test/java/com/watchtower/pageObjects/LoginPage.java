package com.watchtower.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(id="kt_sign_in_submit")
	WebElement submit;
	
	public void setuserName(String uname)
	{
		username.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickSubmit()
	{
		submit.click();
		//password.sendKeys(pwd);
	}
}
