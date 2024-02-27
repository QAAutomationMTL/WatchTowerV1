package com.watchtower.testCases;

import org.testng.annotations.Test;

import com.watchtower.pageObjects.Settings;

public class TC_Settings_006 extends BaseClass
{
	Settings sm;
	
  @Test(priority=1)
  public void Settings() throws InterruptedException
  { 
	  sm=new Settings(driver);
	  Thread.sleep(2000);
	  sm.clickSettings();
	  
  }
 /* @Test(priority=2)
  public void AddNewCurrency() throws InterruptedException
  {		
	  Thread.sleep(2000);
	  sm.clickAddNewCurrency();
  }
  @Test(priority=3)
  public void AddCurrencyDetails() throws InterruptedException
  {
	  sm.clickAddCurrencyDetails();
  }
  @Test(priority=4)
  public void SettingsSearch() throws InterruptedException
  {
	  
	  sm.SearchFunction();
  }*/
  
  @Test(priority=1)
   public void ClickCountries() throws InterruptedException
    {		
  	  Thread.sleep(2000);
  	  sm.clickCountries();
    }
  
}
