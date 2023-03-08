package com.qa.portal.ecps.ca.pages.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class username extends AbstractComponent{
	
	
	@FindBy(xpath= "//input[@id='usernameInput']")
	WebElement usernameTxt;
	
	public username(final WebDriver driver) {
		super(driver);
	}
	
	public void enterusername(String user_name) {
		this.usernameTxt.clear();
		this.usernameTxt.sendKeys(user_name);
		
	}
	

	@Override
	public boolean isDisplayed() {
		return this.wait.until((d) -> this.usernameTxt.isDisplayed());
	}

}
