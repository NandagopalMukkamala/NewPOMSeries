package com.qa.portal.ecps.ca.pages.Member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.portal.ecps.ca.pages.Common.AbstractComponent;

public class applicationheader extends AbstractComponent {
	
	@FindBy(xpath= "//span[@name='applicationHeader']")
	WebElement applicationheaderTxt;

	public applicationheader(WebDriver driver) {
		super(driver);
	}
	
	public String getlogintxt() {
		return this.applicationheaderTxt.getText();
		
	}

	@Override
	public boolean isDisplayed() {
		return this.wait.until((d) -> this.applicationheaderTxt.isDisplayed());
	}

}
