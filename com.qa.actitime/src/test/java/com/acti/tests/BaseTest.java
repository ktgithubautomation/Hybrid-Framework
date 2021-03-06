package com.acti.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;

public class BaseTest extends DriverScript{

	LoginPage lp;
	EnterTimePage etp;
	TaskList tl;

	@BeforeMethod
	public void setUp()
	{
		initApplication();
		 lp = new LoginPage();
		 etp = new EnterTimePage();
		 tl = new TaskList();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		quitDriver();
	}
	
}
