package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class LoginPage extends DriverScript {

	
	//********************************** page elements *****************
	
	@FindBy(id="username") WebElement textboxusername;
	@FindBy(name="pwd") WebElement textboxpassword;
	@FindBy(xpath="//div[text()='Login ']") WebElement buttonlogin;
	@FindBy(id="toPasswordRecoveryPageLink") WebElement linkrecoverypassword;
	//********************************** page Initialization *****************

	public LoginPage()
	{
		PageFactory.initElements(driver, this);			
	
	}
	
	////********************************** page method *****************
	
	public boolean verifylinkpassword()
	{
		return linkrecoverypassword.isDisplayed();
	}
	
	public void enterUserName(String username) 
	
	{
		textboxusername.sendKeys(username);		
	}
	
	public void enterPassword(String password) 
	{
		textboxpassword.sendKeys(password);
	}
	
	public void clickLogin()
	{
		buttonlogin.click();
	}
	
	
}
