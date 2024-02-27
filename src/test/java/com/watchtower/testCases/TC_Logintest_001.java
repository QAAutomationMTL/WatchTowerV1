package com.watchtower.testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.watchtower.pageObjects.LoginPage;



public class TC_Logintest_001 extends BaseClass
{
	 LoginPage lp;
	 
	@Test(priority=1)
	public void loginTest() throws InterruptedException
	{
	
	 
	 lp=new LoginPage(driver);
	
	 lp.setuserName(username);
	 lp.setPassword(password);
	 lp.clickSubmit();
	 Thread.sleep(1000);
	
	 
	String cururl=driver.getCurrentUrl();
	 System.out.println(cururl);
	 
	 if(driver.getCurrentUrl().equals(cururl))
	 {
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Assert.assertTrue(false);
	 }
	}
	@Test(priority=2,enabled=false)
	public void logout() throws InterruptedException
	{
		lp.logout();
	}
}

