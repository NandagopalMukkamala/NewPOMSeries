package com.qa.portal.ecps.ca.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.google.common.util.concurrent.Uninterruptibles;

public class baseTest {
	
	public static WebDriver driver;
	
	
	
	
	
	@BeforeTest
	public void setupDriver() {
		//Redirects the logs in Console for Firefox browser
		  System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
		  System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"C:\\Nanda\\temp\\logsgecko.txt");
		  System.setProperty("webdriver.gecko.driver","C:\\Nanda\\Geckodriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		  FirefoxProfile profile =new FirefoxProfile();
		  FirefoxOptions option=new FirefoxOptions();
		  option.setProfile(profile);
		  this.driver = new FirefoxDriver(option);
		//this.driver = new FirefoxDriver(profile);
		driver.manage().window().maximize();
	}
	
	
//	@AfterTest
//	public void quitDriver() {
//		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
//		this.driver.quit();
//	}
	
	
	

}
