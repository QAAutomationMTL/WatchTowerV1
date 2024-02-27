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
 @Test(priority=2)
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
  public void SettingsSearchCurrency() throws InterruptedException
  {
	  
	  sm.SearchFunctionCurrency();
  }
  
 @Test(priority=5)
   public void ClickCountries() throws InterruptedException
    {		
  	  //Thread.sleep(2000);
  	  sm.clickCountries();
    }
  @Test(priority=6)
  public void ClickAddNewCountry() throws InterruptedException
   {		
 	  //Thread.sleep(2000);
 	  sm.clickAddNewCountry();
   }
  @Test(priority=7)
  public void AddCountryDetails() throws InterruptedException
  {
	  sm.clickAddCountryDetails();
  }
  @Test(priority=8)
  public void SettingsSearchCountry() throws InterruptedException
  {
	  
	  sm.SearchFunctionCountry();
  }
  @Test(priority=9)
  public void ClickStates() throws InterruptedException
   {		
 	  //Thread.sleep(2000);
 	  sm.clickStates();
 	Thread.sleep(2000);
   }
 @Test(priority=10)
 public void ClickAddNewState() throws InterruptedException
  {		
	  
	  sm.clickAddNewState();
  }
 @Test(priority=12)
 public void AddStateDetails() throws InterruptedException
 {
	  sm.clickAddStateDetails();
 }
 @Test(priority=13)
 public void SettingsSearchState() throws InterruptedException
 {
	  
	  sm.SearchFunctionState();
 }
}

