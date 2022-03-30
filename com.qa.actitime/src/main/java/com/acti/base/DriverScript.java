package com.acti.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverScript {

	public static WebDriver driver;
	Properties prop;
	
	public DriverScript()
	{
		try
		{
			File src = new File("./atconfig/config.properties");
			FileInputStream fis = new FileInputStream(src);
			 prop = new Properties();
			 prop.load(fis);
			 
			
			
		}catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Unbale to load page"+ e.getMessage());
			
		}
	}
	
	
	public void initApplication() //throws InterruptedException
	{
	  String browser = prop.getProperty("browser");
	  
	   if( browser.equalsIgnoreCase("CHROME"))
	   {
		   System.setProperty("webdriver.chrome.driver", "./acbrowser/chromedriver.exe");
		   driver = new ChromeDriver();
	   }
	   
	   else if( browser.equalsIgnoreCase("EDGE"))
	   {
		   System.setProperty("webdriver.edge.driver", "./acbrowser/edgedriver.exe");
		   driver = new EdgeDriver();
	   }
	   
	   else if( browser.equalsIgnoreCase("FIREFOX"))
	   {
		   System.setProperty("webdriver.gecko.driver", "./acbrowser/geckodriver.exe");
		   driver = new  FirefoxDriver();
	   }
	   
	   else {
		      System.out.println("Different browser");
		      return ;
	         }
	   
	   driver.manage().window().maximize();
	   driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   String url = launchUrl();
	   //Thread.sleep(2000);
	   driver.get(url);
	  // quitDriver();
	}
	
	
	public String launchUrl()
	{	
		String url = prop.getProperty("url");		
		return url;
		 
     }
 
 
 public static void quitDriver()
 
 {
	 driver.quit();
 }


}
