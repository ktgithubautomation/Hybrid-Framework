package com.acti.tests;

import org.testng.annotations.Test;

import com.acti.utils.Helper;

public class TaskListTest extends BaseTest 
{
    @Test (priority =1)
	public void createNewCustomer()
	
	{
    	lp.enterUserName("admin");
		lp.enterPassword("manager");
		lp.clickLogin();
		etp.tasklist();
		tl.addNew();
		tl.addNewCustomer();
		tl.CustomerName("Selenium12222222227");
		tl.enterCustomerDetails("Automation");
		tl.clickCreateCustomer();
		Helper.fn_sleep();
		etp.clickLoggedOut();
		
			
	}
	@Test (priority =2)
    public void testDeleteCustomer()
	{
		lp.enterUserName("admin");
		lp.enterPassword("manager");
		lp.clickLogin();
		etp.tasklist();
		tl.searchCustomer("Selenium12222222227");
		tl.searchResult();
		tl.editAction();
		tl.actionButtoncustomer();
		tl.deletecustomer();
		tl.deletePermanantly();
	
	}
	
	
}
