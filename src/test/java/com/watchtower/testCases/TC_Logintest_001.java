package com.watchtower.testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.watchtower.pageObjects.LoginPage;



public class TC_Logintest_001 extends BaseClass
{
	@Test
	public void loginTest() throws InterruptedException
	{
	// driver.get(baseURL);
	// String cururl=driver.getCurrentUrl();
	// System.out.println(title);
	 
	 LoginPage lp=new LoginPage(driver);
	
	 lp.setuserName(username);
	 lp.setPassword(password);
	 lp.clickSubmit();
	
	 
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
}

