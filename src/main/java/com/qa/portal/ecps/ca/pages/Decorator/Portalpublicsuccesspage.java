package com.qa.portal.ecps.ca.pages.Decorator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Portalpublicsuccesspage {
	
	
	protected WebDriverWait wait;
	
	@FindBy(xpath= "//ul[@class='navbar-public nav navbar-nav navbar-right']//a[contains(text(),'Success Stories')]")
	WebElement successstoriestab;

	@FindBy(xpath= "//h1[contains(text(),'Success Stories')]")
	WebElement successstoriestxt;


	public Portalpublicsuccesspage (WebDriver driver) {
		this.wait = new WebDriverWait(driver,30);
		PageFactory.initElements(driver, this);
	}

	
	public void successstoriestabclick() {
	this.successstoriestab.click();
   }

   public String getsuccessstoriestabtxt() {
   this.wait.until((d) -> this.successstoriestxt.isDisplayed());
   return this.successstoriestxt.getText().trim();
  }

	

}
