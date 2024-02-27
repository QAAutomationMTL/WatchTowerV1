package com.watchtower.testCases;

import org.testng.annotations.Test;
import com.watchtower.pageObjects.MilestoneManager;

public class TC_MilestoneManager_003 extends BaseClass
{
	
	MilestoneManager mm;
  @Test(priority=2)
  public void MilestoneManager() throws InterruptedException
  {
	  mm=new MilestoneManager(driver);
	  
	  Thread.sleep(2000);
	  mm.clickMilestoneManager();
	  Thread.sleep(2000);
	  mm.searchFunction();
  }
  @Test(priority=2)
  public void MilestoneManagerSearch() throws InterruptedException
  {
	  	  
	  Thread.sleep(2000);
	  mm.searchFunction();
  }
}
