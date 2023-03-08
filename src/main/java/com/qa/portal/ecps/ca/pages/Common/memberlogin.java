package com.qa.portal.ecps.ca.pages.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class memberlogin extends AbstractComponent {
	
	
	@FindBy(css= "li.loginlink a')]")
	WebElement memberloginTxt;
	
	
	public memberlogin(final WebDriver driver) {
		super(driver);
	}
	
	public void click() {
		this.memberloginTxt.click();
	}
	

	@Override
	public boolean isDisplayed() {
		this.wait.until(ExpectedConditions.visibilityOf(this.memberloginTxt));
		return this.memberloginTxt.isDisplayed();
	}

}
