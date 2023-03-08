package com.qa.portal.ecps.ca.tests;



import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.portal.ecps.ca.pages.Login.memberloginpage;
import com.qa.portal.ecps.ca.pages.Member.memberhomepage;



public class qaportalTest extends baseTest {
	
      private memberloginpage Membersloginpage;
      private memberhomepage Membershomepage;
      
      
      @BeforeTest
      public void setup() {
    	  this.Membersloginpage = new memberloginpage(driver);
    	  this.Membershomepage = new memberhomepage(driver);
      }
      
      
      @Test(dataProvider="getdata")
      public void logintoQA(String user_name,String password_details) {
    	  //String user_name = "cps-admin1";
    	  //String password_details = "passw0rd1";
    	  
    	  Membersloginpage.goTo();
    	  Assert.assertTrue(Membersloginpage.getmemberlogin().isDisplayed());
    	  Membersloginpage.getmemberlogin().click();
    	  
    	  Membersloginpage.getusername().enterusername(user_name);
    	  Assert.assertTrue(Membersloginpage.getusername().isDisplayed());
    	  
    	  Membersloginpage.getpassword().enterpassword(password_details);
    	  Assert.assertTrue(Membersloginpage.getpassword().isDisplayed());
    	  
    	  Assert.assertTrue(Membersloginpage.getloginbutton().isDisplayed());
    	  Membersloginpage.getloginbutton().loginBtn();	
    	  
    	  Membershomepage.getapplicationheader().isDisplayed();
    	  String apptxt = Membershomepage.getapplicationheader().getlogintxt();
    	  System.out.println("The apptxt:"+apptxt);
    	  Assert.assertEquals(apptxt, "Application Links", "The user not logged in");
    	      	  
      }
      
      @DataProvider
      public Object[][] getdata() {
    	  
    	  return new Object[][] {
    		  {"cps-admin1","passw0rd1"}
    	  };
      }
      
      
      
}
