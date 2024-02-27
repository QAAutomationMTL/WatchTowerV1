package com.watchtower.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.watchtower.pageObjects.ClientManager;
import com.watchtower.pageObjects.LoginPage;


public class TC_ClientManager_002 extends BaseClass
{
	
	ClientManager cm;
	
	
  @Test(priority=1)
  public void ClientManagerTest() throws InterruptedException 
  {
	 cm=new ClientManager(driver);
	 Thread.sleep(2000);
	 cm.clickClientManager();
	 Thread.sleep(2000);
	 
	 
  }
  
  @Test(priority=2)
  public void AddNewClient() throws InterruptedException
  {
	  cm.clickAddNewClient();
	  cm.addClientDetails();
  }
  
  @Test(priority=3)
  public void SearchFunctionalityTest() throws InterruptedException
  {
	 // Thread.sleep(2000);
	  //cm.clickClientManager();
	 // Thread.sleep(2000);
  	  
	  cm.searchFunction();
	  Thread.sleep(5000);
	 // driver.navigate().refresh();
	  
  }
  @Test(priority=4)
  public void DeleteFunction() throws InterruptedException
  {
	  cm.deleteClient();
	 	
  }
}
