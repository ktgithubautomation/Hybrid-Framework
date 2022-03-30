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
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]") WebElement enterCustomerName;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']") WebElement enterCustomerDescription;
	@FindBy(xpath = "//div[contains(text(),'Create Customer')]") WebElement createCustomerButton;
	
	@FindBy(xpath = "(//input[@placeholder='Start typing name ...'])[1]") WebElement searchbox;
	@FindBy(xpath = "//span[@class='highlightToken']") WebElement searchitem;
	@FindBy(xpath = "//div[@class='titleEditButtonContainer']//div[@class='editButton']") WebElement editbutton;	
	@FindBy(xpath = "//div[@class='actionButtonWrapper pressed']//div[@class='action'][normalize-space()='ACTIONS']") WebElement actionButton;
   	@FindBy(xpath = "(//div[@class='taskManagement_customerPanel']//div[@class='title'][normalize-space()='Delete']") WebElement deletebutton;
   	@FindBy(xpath = "//span[normalize-space()='Delete permanently']") WebElement deletepermananat;
  
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
	
	public void searchCustomer(String Cname)
	{
		searchbox.sendKeys(Cname);
		System.out.println("searchCustomer");
		
	}

   public void searchResult()
   {
	   searchitem.click();
	   System.out.println("SearchResult");
   }
   
   public void editAction()
   
   {
	   editbutton.click();
	   System.out.println("editAction");
   }

   public void actionButtoncustomer()
   {
	   actionButton.click();
	   System.out.println("actionButtoncustomer");
   }
  
   public void deletecustomer()
   {
	   deletebutton.click();
	   System.out.println("delete cust");
   }
   
   public void deletePermanantly()
   {
	   deletepermananat.click();
	   System.out.println("perm delete");
   }

       
   
}

