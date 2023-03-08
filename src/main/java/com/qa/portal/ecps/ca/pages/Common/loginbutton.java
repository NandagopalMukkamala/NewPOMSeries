package com.qa.portal.ecps.ca.pages.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class loginbutton extends AbstractComponent{
	
	
	@FindBy(xpath= "//input[@name='btn_submit']")
	WebElement loginBtn;
	
	public loginbutton(final WebDriver driver) {
		super(driver);
	}
	
	public void loginBtn() {
		this.loginBtn.click();
	}
		
	@Override
	public boolean isDisplayed() {
		return this.wait.until((d) -> this.loginBtn.isDisplayed());
	}

}
