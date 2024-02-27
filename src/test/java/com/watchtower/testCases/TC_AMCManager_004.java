package com.watchtower.testCases;

import org.testng.annotations.Test;

import com.watchtower.pageObjects.AMCManager;

public class TC_AMCManager_004 extends BaseClass
{
	AMCManager am;
  @Test(priority=1)
  public void AMCManager() throws InterruptedException 
  {
	  am=new AMCManager(driver);
	  
	  Thread.sleep(2000);
	  am.clickAMCManager();
		
  }
  @Test(priority=2)
  public void AMCManagerSearch() throws InterruptedException 
  {
	  
	  Thread.sleep(2000);
	  am.searchFunction();
	  
  }
}
