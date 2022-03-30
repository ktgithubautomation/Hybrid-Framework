package com.acti.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;

//import com.acti.utils.Helper;



public class TaskList extends BaseTest 
{
	                  
	//********************************** page elements *****************
	
	@FindBy(xpath = "//div[contains(@class,'title ellipsis')]") WebElement addNewText;
	@FindBy(xpath = "//div[text()='+ New Customer']") WebElement createNew;
	@FindBy (xpath = "(//input[@placeholder='Enter Customer Name'])[2]") WebElement enterCustomerName;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']") WebElement enterCustomerDescription;
	@FindBy(xpath = "//div[contains(text(),'Create Customer')]") WebElement createCustomerButton;
	
	//********************************** page Initialization *****************
	 	
	public TaskList()
	 {			
		 PageFactory.initElements(driver, this);		
		 
	 }
		 
	////********************************** page method *****************
			
	//@Test
	//public void task()
	//{	
		 
		//enterCustomerName.sendKeys("ROSS");
		
		
	//}
	
  
 
	public void addNew()
	{
		addNewText.click();
	}
 
	public void addNewCustomer()
	{
		createNew.click();
	}
   
	public void CustomerName(String name)
	{
		enterCustomerName.sendKeys(name);
		
	}
  
	public void enterCustomerDetails(String details)
	{
		enterCustomerDescription.sendKeys(details);
		
	}
    
	public void clickCreateCustomer()
	{
		createCustomerButton.click();
		System.out.println("Customer Added successfully");
		
	}
}
