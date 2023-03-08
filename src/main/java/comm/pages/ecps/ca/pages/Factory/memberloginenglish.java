package comm.pages.ecps.ca.pages.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

 class memberloginenglish extends Commoncomponents {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	@FindBy(xpath= "//a[contains(text(),'Member Log In')]")
	WebElement memberloginTxt;
	
	@FindBy(xpath= "//input[@id='usernameInput']")
	WebElement usernameTxt;
	
	@FindBy(xpath= "//input[@id='passwordInput']")
	WebElement passwordTxt;
	
	@FindBy(xpath= "//input[@name='btn_submit']")
	WebElement loginBtn;
	
	@FindBy(xpath= "//span[@name='applicationHeader']")
	WebElement applicationheaderTxt;
	
	@FindBy(css="a.dropdown-toggle")
	WebElement user_namelogout;
	
	@FindBy(css= "li.quasep-dropdown li:nth-of-type(2) a")
	WebElement namelogout;
	
	@FindBy(xpath= "//ul[@class='dropdown-menu user-dropdown-toggle']")
	WebElement dptoggle;
		
	@FindBy(css= "li#Z6_0QJ4AB1A00I870AI1UOTCU30O6")
	WebElement education;
	
	
	public memberloginenglish(final WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver,30);
		PageFactory.initElements(driver, this);
	}
	

	@Override
	public void navigatetoportal() {
		this.driver.get("https://qa-portal.ecps.ca/");
		
	}

	@Override
	public void memberloginclick() {
		this.wait.until((d) -> this.memberloginTxt.isDisplayed());
		this.memberloginTxt.click();
		
	}

	@Override
	public void enterusername(String user_name) {
		this.wait.until((d) -> this.usernameTxt.isDisplayed());
		this.usernameTxt.clear();
		this.usernameTxt.sendKeys(user_name);
	}

	@Override
	public void enterpassword(String password_details) {
		this.wait.until((d) -> this.passwordTxt.isDisplayed());
		this.passwordTxt.clear();
		this.passwordTxt.sendKeys(password_details);
	}

	@Override
	public void loginbtnclick() {
		this.wait.until((d) -> this.loginBtn.isDisplayed());
		this.loginBtn.click();
	}
	
	@Override
	public String applicationlinktxt() {
		this.wait.until((d) -> this.applicationheaderTxt.isDisplayed());
		return this.applicationheaderTxt.getText();
	}
	
	@Override
	public void usernamelogout() {
		this.wait.until((d) -> this.user_namelogout.isDisplayed());
		this.user_namelogout.click();
	}
	

	@Override
	public void logoutpopup() {
		this.wait.until((d) -> this.dptoggle.isDisplayed());
		
	}

	@Override
	public void logout() {
		this.wait.until((d) -> this.namelogout.isDisplayed());
		this.namelogout.click();
	}


	@Override
	public void educationtab() {
		this.wait.until((d) -> this.education.isDisplayed());
		this.education.click();
		System.out.println("My New Update");
		
	}




	



}
