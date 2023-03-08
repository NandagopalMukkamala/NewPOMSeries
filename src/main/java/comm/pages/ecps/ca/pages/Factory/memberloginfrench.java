package comm.pages.ecps.ca.pages.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 class memberloginfrench extends memberloginenglish {
	 
	 @FindBy(xpath= "//a[contains(text(),'Connexion des Membres')]")
		WebElement memberloginTxtFRE;

	public memberloginfrench(WebDriver driver) {
		super(driver);
	}
	
	
	@Override
	public void navigatetoportal() {
		this.driver.get("https://qa-portal.ecps.ca/wps/portal/GESPRA/root/public/HomePublic");
		//this.memberloginTxtFRE.click();
	}
	
	
	@Override
	public void memberloginclick() {
		this.wait.until((d) -> this.memberloginTxtFRE.isDisplayed());
		this.memberloginTxtFRE.click();
}
	
 }
