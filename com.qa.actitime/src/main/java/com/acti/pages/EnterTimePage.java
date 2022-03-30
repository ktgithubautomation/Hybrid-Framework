package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class EnterTimePage extends DriverScript
{

	 @FindBy(xpath="//a[@class='userProfileLink username ']") WebElement userlogged;
	 @FindBy(id="logoutLink") WebElement userloggedout;
	 @FindBy(xpath="//div[@id='container_tasks']") WebElement taskmenu;
	 
	 
	 
	 public EnterTimePage()
	 {
		 PageFactory.initElements(driver, this);
		 
	 }
	
	 public void clickLoggedOut()
	 {
		 userloggedout.click();
	 }
	 
	 public String verifyUserLogged()
	 {
		return userlogged.getText();
	 }
	 
	 public void tasklist()
	 {
		 taskmenu.click();
	 }
	 
}
