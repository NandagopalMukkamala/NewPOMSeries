package com.qa.portal.ecps.ca.pages.Member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class memberhomepage {
	
	private applicationheader Applicationheader;

	public memberhomepage(final WebDriver driver) {
		this.Applicationheader = PageFactory.initElements(driver, applicationheader.class);
	}
	
	public applicationheader getapplicationheader() {
		return Applicationheader;
	}

}
