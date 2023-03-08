package com.qa.portal.ecps.ca.pages.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class password extends AbstractComponent {
	
	
	@FindBy(xpath= "//input[@id='passwordInput']")
	WebElement passwordTxt;
	
	public password(final WebDriver driver) {
		super(driver);
	}
	
	public void enterpassword(String password_details) {
		this.passwordTxt.clear();
		this.passwordTxt.sendKeys(password_details);
		
	}

	@Override
	public boolean isDisplayed() {
		return this.wait.until((d) -> this.passwordTxt.isDisplayed());
	}

}
