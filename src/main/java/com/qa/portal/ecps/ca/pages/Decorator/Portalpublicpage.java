package com.qa.portal.ecps.ca.pages.Decorator;

import java.util.function.Predicate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Portalpublicpage {

	public WebDriver driver;
protected WebDriverWait wait;

@FindBy(css= "a.active-link")
WebElement hometab;

@FindBy(xpath= "//h2[contains(text(),'Products & Services')]")
WebElement hometabtxt;

@FindBy(xpath= "//ul[@class='navbar-public nav navbar-nav navbar-right']//a[contains(text(),'Product & Services')]")
WebElement productandservicestab;

@FindBy(xpath= "//h2[contains(text(),'Benefits')]")
WebElement productandservicestxt;

//@FindBy(xpath= "//ul[@class='navbar-public nav navbar-nav navbar-right']//a[contains(text(),'Success Stories')]")
//WebElement successstoriestab;
//
//@FindBy(xpath= "//h1[contains(text(),'Success Stories')]")
//WebElement successstoriestxt;


public Portalpublicpage (WebDriver driver) {
	this.driver=driver;
	this.wait = new WebDriverWait(driver,30);
	PageFactory.initElements(driver, this);
}

//public void goTo() {
//	this.driver.get("https://qa-portal.ecps.ca/");
//}


public void hometabclick() {
	this.hometab.click();
}

public String gethometabtxt() {
	this.wait.until((d) -> this.hometabtxt.isDisplayed());
	return this.hometabtxt.getText().trim();
}

public void productandservicestabclick() {
	this.productandservicestab.click();
}

public String getproductandservicestabtxt() {
	this.wait.until((d) -> this.productandservicestxt.isDisplayed());
	return this.productandservicestxt.getText().trim();
}

//public void successstoriestabclick() {
//	this.successstoriestab.click();
//}
//
//public String getsuccessstoriestabtxt() {
//	this.wait.until((d) -> this.successstoriestxt.isDisplayed());
//	return this.successstoriestxt.getText().trim();
//}
//	
//	
	/*public void predicatetest() {
		Predicate<WebElement> sample = (e) -> e.getText().trim() == "success";
		
		sample.test(productandservicestxt);
	
		
	
	}*/			
				
	
	/*public void predicatetest() {
		Predicate<String> sample = (e) -> e.contains("Success");
		
		sample.test(gethometabtxt());
	
		
	
	}*/
	
	
	
	
	
	


}
