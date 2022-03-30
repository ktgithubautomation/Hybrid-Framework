package com.acti.tests;

import org.testng.annotations.Test;

import com.acti.utils.Helper;

public class TaskListTest extends BaseTest 
{
    @Test
	public void createNewCustomer()
	
	{
    	lp.enterUserName("admin");
		lp.enterPassword("manager");
		lp.clickLogin();
		etp.tasklist();
		tl.addNew();
		tl.addNewCustomer();
		tl.CustomerName("Selenium");
		tl.enterCustomerDetails("Automation");
		tl.clickCreateCustomer();
		Helper.fn_sleep();
		etp.clickLoggedOut();
		
		
		
		
		
	}
	
	
	
	
}
