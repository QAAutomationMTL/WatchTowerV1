package com.watchtower.testCases;
import com.watchtower.pageObjects.UserManager;

import org.testng.annotations.Test;

public class TC_UserManager_005 extends BaseClass
{
	UserManager um;
  @Test(priority=1)
  public void UserManager() throws InterruptedException 
  {
	  
	  um=new UserManager(driver);
	  Thread.sleep(2000);
	  um.clickUserManager();
	  Thread.sleep(2000);
	  
  }
  
  @Test(priority=2)
  public void AddNewuser() throws InterruptedException 
  {
	  
	  um.clickAddNewUser();
	  um.addUserDetails();
  }
  
  @Test(priority=3)
  public void UserManagerSearch() throws InterruptedException 
  {
	  
	  
	  Thread.sleep(2000);
	  um.searchFunction();
  }
}
