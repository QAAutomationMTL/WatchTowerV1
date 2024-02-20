package com.watchtower.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.watchtower.pageObjects.ClientManager;
import com.watchtower.pageObjects.LoginPage;

public class TC_ClientManager_002 extends BaseClass
{
 // WebDriver driver;
  @Test
  public void ClientManagerTest() throws InterruptedException 
  {
	 	  
	 ClientManager cm=new ClientManager(driver);
	 Thread.sleep(2000);
	 cm.clickClientManager();
	 Thread.sleep(2000);
	 cm.clickAddNewClient();
	 cm.addClientDetails();
	 
	}
  
}
