package com.qa.portal.ecps.ca.pages.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.portal.ecps.ca.pages.Common.loginbutton;
import com.qa.portal.ecps.ca.pages.Common.memberlogin;
import com.qa.portal.ecps.ca.pages.Common.password;
import com.qa.portal.ecps.ca.pages.Common.username;

public class memberloginpage {
	
	private WebDriver driver;
	private memberlogin Memberlogin;
	private username Username;
	private password Password;
	private loginbutton Loginbutton;
	
	
	public memberloginpage(final WebDriver driver) {
		this.driver = driver;
		this.Memberlogin = PageFactory.initElements(driver, memberlogin.class);
		this.Username = PageFactory.initElements(driver, username.class);
		this.Password = PageFactory.initElements(driver, password.class);
		this.Loginbutton = PageFactory.initElements(driver, loginbutton.class);
		
	}
	
	public void goTo() {
		this.driver.get("https://qa-portal.ecps.ca/");
	}
	
	public memberlogin getmemberlogin() {
		return Memberlogin;
	}
	
	public username getusername() {
		return Username;
	}

	public password getpassword() {
		return Password;
	}
	
	public loginbutton getloginbutton() {
		return Loginbutton;
		
	}
	
	
}
