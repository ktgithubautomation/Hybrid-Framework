package com.acti.tests;

import com.acti.utils.Helper;


   

public class LoginTest extends BaseTest
{
	/*this is all we written base class here we extends BaseTest
	 * LoginPage lp;
	EnterTimePage etp;

	@BeforeMethod
	public void setUp()
	{
		initApplication();
		 lp = new LoginPage();
		 etp = new EnterTimePage();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		quitDriver();
	}*/
	

	public void login() 
	{
		//initApplication();
		lp.enterUserName("admin");
		lp.enterPassword("manager");
		lp.clickLogin();
		
		String actual = etp.verifyUserLogged();
		System.out.println(actual);
		
		
		etp.clickLoggedOut();
		Helper.fn_sleep();
		
		
			
	}
	
	public void verifylinkpassword() 
	{
		
		boolean flag = lp.verifylinkpassword();
		System.out.println(flag);
		Helper.fn_sleep();
		
	}
	
}
