package com.qa.portal.ecps.ca.Factory.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.qa.portal.ecps.ca.tests.baseTest;

import comm.pages.ecps.ca.pages.Factory.Commoncomponents;
import comm.pages.ecps.ca.pages.Factory.portalFactory;

public class qaportalFactoryTest extends baseTest{
	
	private Commoncomponents commomcomponents;
	
	
	@Test(dataProvider = "getData")
	public void logintoqa(String language , String user_name , String password_details) {
		this.commomcomponents = portalFactory.get(language, driver);
		this.commomcomponents.navigatetoportal();
		this.commomcomponents.memberloginclick();
		this.commomcomponents.enterusername(user_name);
		this.commomcomponents.enterpassword(password_details);
		this.commomcomponents.loginbtnclick();
		String text = this.commomcomponents.applicationlinktxt();
		System.out.println("The Application link text"+text);
		this.commomcomponents.educationtab();
		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		this.commomcomponents.usernamelogout();
		//this.commomcomponents.logoutpopup();
		this.commomcomponents.logout();
		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
	}
	
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {
			{"ENG","cps-admin1","passw0rd1"},
			{"FRE","gf-admin1","passw0rd2"}
		
	};
	

}

	
}