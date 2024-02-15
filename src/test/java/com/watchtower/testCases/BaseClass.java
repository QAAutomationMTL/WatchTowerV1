package com.watchtower.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.watchtower.utilities.ReadConfig;

public class BaseClass 
{
	ReadConfig readconfig=new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUserName();
	public String password=readconfig.getPassword();
	public static WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void setUp(String br)
	{
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
				{
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			driver=new FirefoxDriver();
				}
		else if(br.equals("ie"))
			
		{
			System.setProperty("webdriver.ie.driver",readconfig.getIePath());
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
				driver.get(baseURL);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}


}
