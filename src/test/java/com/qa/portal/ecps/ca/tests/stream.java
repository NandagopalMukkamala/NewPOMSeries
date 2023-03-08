package com.qa.portal.ecps.ca.tests;

import static java.util.concurrent.TimeUnit.SECONDS;

import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.logging.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.ListIterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


//import Samplebase.Hashmap_WCM;

public class stream extends baseTest{
	
	WebDriverWait wait2;
	
	@FindBy(css= "li.loginlink a")
	WebElement memberloginTxt;
	
	@FindBy(xpath= "//input[@id='usernameInput']")
	WebElement usernameTxt;
	
	@FindBy(xpath= "//input[@id='passwordInput']")
	WebElement passwordTxt;
	
	@FindBy(xpath= "//input[@name='btn_submit']")
	WebElement loginBtn;
	
	@FindBy(css = "div.aramarkHomeNews_new.m-top15 div.moreLink_new_home a")
	WebElement Viewall_programupdates;
	
	
	@FindBy(css="div.aramarkHomeAlerts_new.m-top15 div.wcm_width_1 a")
	List <WebElement> Alerts_homecount;
	
	@FindBy(css="div.aramarkHomeNews_new.m-top15 div.wcm_width_1 a")
	List <WebElement> program_homecount;
	
	@FindBy(css="div#collateralsDiv1 div.table-responsive table tbody tr")
	List <WebElement> colletral_count;
	
	@FindBy(css="tbody.hightlighted-search-content tr")
	List <WebElement> Programupdates_count;
	
	@FindBy(xpath= "//ul[@id='nav_aramark']//a[contains(text(),'Theme Days')]")
	WebElement themedaystab;
	
	@FindBy(css="div.demoContainerFull table tbody tr td:nth-of-type(2) a")
	List <WebElement> themedays_count;
	
	@FindBy(css="div.ga-themedays-list table tbody tr")
	List <WebElement> tdays_count;
	
	@FindBy(css = "a[id$='_nextPage']")
	WebElement themedays_nextpage;
	
	@FindBy(css="div.col-md-12 table tbody tr td a")
	List <WebElement> themedayscount_nextpage;
	
	@FindBy(css="div.demoContainerFull table tbody tr td.actions a:nth-of-type(1)")
	List <WebElement> themedayscount_editicon;
	
	@FindBy(css="div.demoContainerFull table tbody tr td:nth-of-type(4)")
	List <WebElement> themedayscount_stardate;
	
	
	@FindBy(css = "div.adminButtons a img")
	WebElement Themedays_addBTN;
	
	@FindBy(css="table.datepicker tbody tr:nth-of-type(n) td.date")
	List <WebElement> themedayscount_stardatecalander;
	
	@FindBy(css = "img#startDate_icon:nth-of-type(1)")
	WebElement Themedays_startcalandericon;
	
	@FindBy(css="ul[role='tree'] li")
	List <WebElement> Scormlist;
	
	@FindBy(css = "a.gridBtn.resumeBtn")
	WebElement scormresume;
	
	@FindBy(css = "h1.presentation-title.cs-title div")
	WebElement scormheading;
	
	@FindBy(css = "input.gLFyf.gsfi")
	WebElement googletext;
	
	@FindBy(css="table#FacilityAdminPortletfacilityMenuPagefacilityMyMenuDp_RowSet_Row_table tbody tr")
	List <WebElement> pmenulist;
	
	@FindBy(css="table#listingGrid tbody tr")
	List <WebElement> ebinderlist;
	
	@FindBy(css = "div.col-md-12 table tbody tr:nth-of-type(2) td")
	WebElement themedayspaginationcount;
	
	@FindBy(css="div.panel-collapse.col-sm-12.white-bg.acc_dist_list.ng-scope.collapse.in div.main2AfterCatDiv.ng-isolate-scope")
	List <WebElement> suppliercount;
	
	@FindBy(css="#promotionsOnly_Id > div.ng-scope:nth-child(1) > div.collateral-list-header.collateral-header-listing.ng-scope.ng-isolate-scope:nth-child(n) > h2")
	List <WebElement> promotioncount;
	
	@FindBy(css = "div[role='option'] h2[class='distName']")
	List <WebElement> promotiontitlecount;
	
	@FindBy(css="table.table.table-striped.table-bordered.user-manage-table.table-hover.table-actions tbody tr")
	List <WebElement> partnerspotlightcount;
	
	
	@FindBy(css = "div.listing-content-heading h1 a")
	List <WebElement> promotionlistcount;
	
	
	@FindBy(css = "div.listing-content-heading h1")
	List <WebElement> promotionlistcount1;
	
	@FindBy(css = "li[ng-if='directionLinks'] a[ng-click='setCurrent(pagination.current + 1); highlightTextOnPage();']")
	WebElement nextbtn;
	
	
	@FindBy(css = "div.aramarkHomeAlerts_new.m-top15 div.wcm_width_1 a")
	List <WebElement> alertslistcount;
	
	@FindBy(css = "div.aramarkHomeAlerts_new.m-top15 div.wcm_width_1 a")
	List <WebElement> Alertsall;
	
	@FindBy(css = "div.col-sm-12 span ul li:nth-of-type(1)")
	WebElement Homebreadcrumb;
	
	@FindBy(css = "div#bam_captcha canvas#captcha")
	WebElement captcha;
	
	
	@FindBy(xpath="//table[@id='tblActionRequiredWeb']// tr//td /a")
	List <WebElement> po_count;
	
	@FindBy(css="table#poList tr")
	List <WebElement> pocount;
	
	
	
	@FindBy(css="table[role='grid'] tbody[role='rowgroup'] tr")
	List <WebElement> pocounting;
	
	public stream(WebDriver driver12) {
		//this.wait = new WebDriverWait(driver12, 25);
		this.wait2 = new WebDriverWait(driver12, 65);
		PageFactory.initElements(driver12, this);
	}
	

	public static void main(String[] args) {
		
		//driver.get("https://qa-portal.ecps.ca/");
		//Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		
	
	}
	

	public void streamtest() {
		driver.get("https://qa-portal.ecps.ca/");
		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		driver.findElements(By.cssSelector("li.loginlink a"))
		.stream()
		.forEach(WebElement::click);
	}

	
//	@Test
//	public void streamtest2() {
//		driver.get("https://qa-portal.ecps.ca/");
//		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
//		driver.findElements(By.xpath("//div[@id='bs-example-navbar-collapse-1']//a[contains(text(),'Success Stories')]"))
//	    .stream()
//	    //.filter(e -> e.click())
//	    .peek(a -> System.out.println("Actual:"+a))
//	    .map(p -> p.findElement(By.cssSelector("div.col-md-10.main-message.center-block a")))
//	    .filter(m -> m.getText().equalsIgnoreCase("How can"))
//	    .forEach(WebElement::click);
// 
//	}
	
	
	public void login() {
		this.usernameTxt.sendKeys("cps-admin1");
		this.passwordTxt.sendKeys("passw0rd1");
		this.loginBtn.click();
		Uninterruptibles.sleepUninterruptibly(8, TimeUnit.SECONDS);
	}
	
	
	//Content Check 
//		public void memberpagealerts() throws Exception {
//			
//			int alertscount = this.Alerts_homecount.size();
//		System.out.println("The sample CSS text:"+alertscount);
//		
//		for(int i=0; i<=alertscount ; i++) {
//			String Alerts_homecounttext = this.Alerts_homecount.get(i).getText();
//			System.out.println("The home CSS text:"+Alerts_homecounttext);
//			
//			if (Alerts_homecounttext.contentEquals(Hashmap_WCM.getAlertsdetails().get("Title"))) {
//				driver.findElement(By.xpath("//a[contains(text(),'"+Hashmap_WCM.getAlertsdetails().get("Title")+"')]")).click();
//				break;
//			}
//		}
//		    test.info("Acess Alerts Content from memberhome page");
//		    log.info("Acess Alerts Content from memberhome page");
//		    Reporter.log("Acess Alerts Content from memberhome page", true);
//		}
	
	
	
	
	
	public void viewall() {
		
		this.Viewall_programupdates.click();
	}
	
	
	
	/*
	  public void streamtest3() {
	  //driver.findElements(By.cssSelector("li.loginlink a"))
	  program_homecount.stream() .filter(p ->
	  p.getText().equalsIgnoreCase("Testing")).findAny().get().
	  click();
	  }
	 */
	  
	  public void streamtest5() {
		 Programupdates_count.stream()
		  .map(w -> w.findElements(By.tagName("td")))
		  .filter(T -> T.get(0).getText().equalsIgnoreCase("Conséquences du coronavirus (COVID-19) pour les membres GESPRA"))
		  .map(D -> D.get(2))
		  .map(E -> E.findElements(By.tagName("a")))
          .map(Q -> Q.get(0))
          .peek(L -> System.out.println("Edit icon"+L))
		  .forEach(P -> P.click());
	  }
	 
	  public void streamtest6() {
			   Programupdates_count.stream()
			  .map(w -> w.findElements(By.tagName("td")))
			  .map(T -> T.get(0).getText())
			  .forEach(P -> System.out.println("The value"+P));
		  }
	  
	  
	  public void streamtest7() {
		    DateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");
			Date currentDate = new Date();
			System.out.println(dateFormat.format(currentDate));			
		
		  this.themedaystab.click();
		 // Uninterruptibles.sleepUninterruptibly(6, TimeUnit.SECONDS);
		 /* themedays_count.stream()
		  .filter(p ->
		  p.getText().equalsIgnoreCase("A1 Auto Test Themedays")).findAny().get().click();*/
		  //.map(w -> w.findElements(By.tagName("td")))
		 // .map(D -> D.get(1))
		  //.map(W -> W.findElement(By.tagName("a")))
		  //.forEach(P -> System.out.println("The themedays text"+P.getText()));
		  
		 
	  }
	  
	  
	  public void streamtest18() {
            this.pmenulist.stream()
                          .skip(1)
                          .map(w -> w.findElements(By.tagName("td")))
       		           .filter(T -> T.get(0).getText().equalsIgnoreCase("RDS Test Menu"))
       		           .map(U -> U.get(8))
       		           .map(P -> P.findElements(By.tagName("a")))
       		           .map(O -> O.get(2))
       		           .forEach(S -> S.click());   
	  }
	  
	  
	  public void streamtest19() {
		  this.ebinderlist.stream()
		  .skip(1)
		  .map(Y -> Y.findElements(By.tagName("td")))
		  .filter(W -> W.get(0).getText().equalsIgnoreCase("New Personalize to Check Delete Icon"))
		  .map(U -> U.get(5))
		  .map(P -> P.findElements(By.tagName("span")))
		  .map(R -> R.get(0))
		  .forEach(S -> S.click());   
	  }
	  
	  
	  public void streamtest20() {
		  String tpaginationcount = this.themedayspaginationcount.getText();
		  String[] arrSplit_3 = tpaginationcount.split("\\s");
		  System.out.println(arrSplit_3[0]);
		  System.out.println(arrSplit_3[1]);
		  System.out.println(arrSplit_3[2]);
		  
		  int ipage = Integer.parseInt(arrSplit_3[2]);
		  System.out.println("The Vale of ipage"+ipage);
		  
		  
	  }
	  
	  
	  public void streamtest8() {
		  int icount = this.themedays_count.size();
		  System.out.println("The icount size"+icount);
		  //for (int i = 0; i<icount; i++) {
		  for(WebElement item : this.themedays_count) {
			  //String themedaystext = this.themedays_count.get(i).getText();
			  System.out.println("The value of item"+item);
			  String themedaystext = item.getText();
			  System.out.println("The Value of Themedaystext"+themedaystext);
	  }
		  
		  
	  }
	  
	  public void streamtest9() {
		  
		    
		  
	  int ipage = this.themedayscount_nextpage.size();
	  System.out.println("The icount size"+ipage);
	  outerloop:
	  for (int i = 0; i<ipage; i++) {
		  int icount = this.themedays_count.size();
		  System.out.println("The icount size"+icount);
		     for (int j=0; j<icount; j++) {
		    	 String themedaystext = this.themedays_count.get(j).getText();
		    	 System.out.println("The Themdays text:"+themedaystext);
		    	 String icontext = this.themedayscount_stardate.get(j).getText();
	    		   System.out.println("Themedays Content start date:"+icontext);
	    		   DateFormat dateFormat2 = new SimpleDateFormat("MMM dd");
	   			   Date currentDate2 = new Date();
	   			System.out.println(dateFormat2.format(currentDate2));
		    	   if (themedaystext.equalsIgnoreCase("Test Themedays - 001") && (icontext.equalsIgnoreCase(dateFormat2.format(currentDate2)))) {
		    		   String myname = this.themedays_count.get(j).getText();
		    		   System.out.println("Themedays Content Name:"+myname);
		    		   System.out.println("The expired content exists");
		    		   //String icontext = this.themedayscount_stardate.get(j).getText();
		    		   //System.out.println("Themedays Content start date:"+icontext);
//		    		   if (myname.trim().equalsIgnoreCase("A1 Auto Test Themedays") && (icontext.equalsIgnoreCase("May 25"))) {
//		    			   System.out.println("The expired content exists");
//		    		   }
		    		   //driver.findElement(By.linkText(myname)).click();
		    		   //
		    		   //this.themedayscount_editicon.get(j).click();
		    		   break outerloop;
		    	   }
		    	 
		     }
		     
		     this.themedays_nextpage.click();
	  }
		  
	  }
	  
	  
	  public void streamtest15() {
		  
		  this.Themedays_addBTN.click();
		  
		  wait2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe[id$='-iframe']")));
		  
		  this.Themedays_startcalandericon.click();
		  
		  int startdatescount = this.themedayscount_stardatecalander.size();
		  System.out.println("The icount size"+startdatescount);
		  
		  for (int i = 0; i<startdatescount; i++) {
			  
			  String starttext = this.themedayscount_stardatecalander.get(i).getText();
			  System.out.println("The start text:"+starttext);
			  
			  if (starttext.equalsIgnoreCase("4")) {
				  this.themedayscount_stardatecalander.get(i).click();
				  break;
			  }
			  
		  }
		  
		  
		  
	  }
	  
	  public void streamtest16() {
		 
				
				 int ipage = this.themedayscount_nextpage.size();
				  System.out.println("The icount size"+ipage);
				  outerloop:
				  for (int i = 1; i<ipage; i++) {
					  int icount = this.themedays_count.size();
					  System.out.println("The icount size"+icount);
					     for (int j=0; j<icount; j++) {
					    	 String themedaystext = this.themedays_count.get(j).getText();
					    	 System.out.println("The Themdays text:"+themedaystext);
					    	   if (themedaystext.equalsIgnoreCase("A1 Auto Test Themedays")) {
					    		   String myname = this.themedays_count.get(j).getText();
					    		   System.out.println("Themedays Content Name:"+myname);
					    		   driver.findElement(By.linkText(myname)).click();
					    		 
					   			break outerloop;   
					    	   }
					    	 
					     }
					     
					     this.themedays_nextpage.click();
					    
				  }
					  
			}
	  
	  
	  
	  
	  public void streamtest14() {
		  int icount = this.themedays_count.size();
		  System.out.println("The icount size"+icount);
		     for (int j=0; j<icount; j++) {
		    	 String themedaystext = this.themedays_count.get(j).getText();
		    	 System.out.println("The Themdays text:"+themedaystext);
		    	   if (themedaystext.equalsIgnoreCase("Robbi Burns Day")) {
		    		   this.themedays_count.get(j).click();
		    		   //String icontext = this.themedayscount_editicon.get(j).getText();
		    		   this.themedayscount_editicon.get(j).click();
		    		   break ;
		    	   } else {
		    		   this.themedays_nextpage.click();
		    	   }
		    	 
		     }
		  
	  }
	  
	  
	  public void streamtest10() {
		  
		  int ipage = this.themedayscount_nextpage.size();
		 // System.out.println("The icount size"+ipage);
		  outerloop:
		  for (int i = 0; i<ipage; i++) {
			  int icount = this.themedays_count.size();
			  System.out.println("The icount size"+icount);
			  tdays_count.stream()
			                 .map(M -> M.findElements(By.tagName("td")))
			                 .filter(T-> T.get(1).getText().equalsIgnoreCase("La St-patrick"))
			                 .map(P -> P.get(5))
			                 .map(F -> F.findElements(By.tagName("a")))
			                 .map(R -> R.get(0))
			                 .forEach(U ->U.click());
			  				  break outerloop;
			     //this.themedays_nextpage.click();
		  }
			  
		  }
	  
	  
	  
	  public void streamtest13() {
		  
		  List<String> tname= tdays_count.stream()
	                 .map(M -> M.findElements(By.tagName("td")))
	                 .map(Y -> Y.get(1).getText())
	                 .collect(Collectors.toList());
			         System.out.println("The list:"+tname);
		  
		 tname.stream()
         
          .forEach(T -> {
        	  if (T.equalsIgnoreCase("Robbi Burns Day")) {
        		  
        	  }
        		  
          });
		  
	  }
	  
	 
		
	  
	  
	  
//	  program_homecount.stream() .filter(p ->
//	  p.getText().equalsIgnoreCase("Testing")).findAny().get().
//	  click();
	  
	  public void streamtest11() {
		  				 
				 List<String> tname= tdays_count.stream()
		                 .map(M -> M.findElements(By.tagName("td")))
		                 .map(Y -> Y.get(1).getText())
		                 .collect(Collectors.toList());
				         System.out.println("The list:"+tname);
				         
				          tname.stream()
				             // .filter(W -> W.equalsIgnoreCase("Mardi Gras"))				            
				              .forEach(T -> {
				    	            if ((T).equalsIgnoreCase("Mardi Gras")) {
				    		  tdays_count.stream()
	                            .map(M -> M.findElements(By.tagName("td")))
	                            .filter(Q-> Q.get(1).getText().equalsIgnoreCase("Mardi Gras"))
	                            .map(P -> P.get(5))
	                            .map(F -> F.findElements(By.tagName("a")))
	                            .map(R -> R.get(0))
	                            .forEach(U ->U.click());
				    	  } else {
				    		  this.themedays_nextpage.click();
				    		  tdays_count.stream()
	                            .map(M -> M.findElements(By.tagName("td")))
	                            .filter(Q-> Q.get(1).getText().equalsIgnoreCase("Mardi Gras"))
	                            .map(P -> P.get(5))
	                            .map(F -> F.findElements(By.tagName("a")))
	                            .map(R -> R.get(0))
	                            .forEach(U ->U.click());
				    	  }
				      } 
				    	  
				      );
				      
				 
				               
				        tname.forEach(System.out::println);
				        
				
				  
			  }
	  
	  
	  public void streamtest12() {
		  
		 // int ipage = this.themedayscount_nextpage.size();
		 // System.out.println("The icount size"+ipage);
		  //outerloop:
		  //for (int i = 0; i<ipage; i++) {
			 // int icount = this.themedays_count.size();
			 // System.out.println("The icount size"+icount);
			 List<String> tname= tdays_count.stream()
			                 .map(M -> M.findElements(By.tagName("td")))
			                 .map(Y -> Y.get(1).getText())
			                 //.map(P -> P.get(5))
			                 //.map(F -> F.findElements(By.tagName("a")))
			                 //.map(R -> R.get(0))
			                 .collect(Collectors.toList());
			               
			        tname.forEach(System.out::println);
			        
			       // tname.stream()
			           //  .filter(Y -> Y.equalsIgnoreCase("Robbi Burns Day"))
			            // .map(P -> P.get)
			             
			                  
			             
			     
			     //this.themedays_nextpage.click();
		//  }
			  
		  }
	  
	  
	/*
	public void streamtest4() {
		colletral_count.stream()
		.map(w -> w.findElements(By.tagName("td")))
		.filter(f -> f.get(1).getText().equalsIgnoreCase("Doc 1.xlsx"))
		.map(b -> b.get(0))
		.map(r -> r.findElement(By.tagName("input")))
		//.peek(i -> System.out.println("The text value3"+i))
	//	.map(k -> k.get(0))
		//.map(a -> a.findElement(By.cssSelector("div.table-responsive tr td input")))
		.forEach(WebElement::click);
		
	}
	
	*/
	
	  
	 
	  public void streamtest17() {
		  
		  String parent = driver.getWindowHandle();
		  System.out.println("The parent window"+parent);
		 
		  this.scormresume.click();
		  
		  Set<String>allWindows = driver.getWindowHandles();
		  
          ArrayList<String> tabs=new ArrayList<>(allWindows);
		  
		  driver.switchTo().window(tabs.get(1));
		  
          wait2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe[id='obj_id']")));
		  
		  wait2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe[id='ScormContent']")));
		  
         String heading = this.scormheading.getText();
		  
		  System.out.println("The heading:"+heading);
		    Scormlist.stream()
		   .map(P -> P.findElements(By.tagName("div")))
		   .map(O -> O.get(0))
		   .filter(W -> !W.getText().equals(""))
		   .forEach(Q -> System.out.println(Q.getText())); 
		  
		 
		    
		  
		    
		  
		/* Iterator<String> I1= allWindows.iterator();
		  
		  while(I1.hasNext())
		  {
		   
		     String child_window=I1.next();
		   
		   System.out.println("The Child window:"+child_window); 
		  // Here we will compare if parent window is not equal to child window then we            will close
		   
		  if(!parent.equals(child_window))
		  {
		  driver.switchTo().window(child_window);
		   
		  String chiletitle = driver.switchTo().window(child_window).getCurrentUrl();
		  
		  System.out.println("The child window title:"+chiletitle);
		
		  wait2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe[id='obj_id']")));
		  
		  wait2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe[id='ScormContent']")));
		  
         String heading = this.scormheading.getText();
		  
		  System.out.println("The heading:"+heading);
		    Scormlist.stream()
		   .map(P -> P.findElements(By.tagName("div")))
		   .map(O -> O.get(0))
		   .filter(W -> !W.getText().equals(""))
		   .forEach(Q -> System.out.println(Q.getText())); 
		  
		  
		  }
		   
		  } */
		  // once all pop up closed now switch to parent window
		  driver.switchTo().window(parent);
		   
	 
	  }
	  
	  public void streamtest21() {
		List <String> LS=suppliercount.stream()
		 .map(Q ->Q.getText())
		 .collect(Collectors.toList());
		  
		  //System.out.println(LS.get(2));
		  
		  boolean flag = LS.stream().anyMatch(S->S.equalsIgnoreCase("A_AUTO SAMPLE SUPPLIER_CHROME_GOB"));
		  System.out.println(flag);
		  
		  Assert.assertTrue(flag,"The Supplier did not add up in my favorities");
	    }
	    

	  
	  public void streamtest22() {
		  promotioncount.stream()
		  .filter(U -> U.getText().equalsIgnoreCase("A_AUTO SAMPLE SUPPLIER_FIREFOX_Goy"))
		  .forEach(T -> T.click());
		  //.forEach(T -> System.out.println(T.getText()));
	  }
	  
	  
	  public void streamtest23() {
			List <String> LS=promotiontitlecount.stream()
			 .map(Q ->Q.getText())
			 .collect(Collectors.toList());
			  
			  //System.out.println(LS.get(2));
			
			  
			  boolean flag = LS.stream().anyMatch(S->S.equalsIgnoreCase("P_tupdate_FIREFOX_xMT"));
			  System.out.println(flag);
			  
			  Assert.assertTrue(flag,"The Promotion did not add up in my favorities");
		    }

	  
	  
	  public void streamtest24() {
		 /* this.pmenu_count.stream()
          .skip(1)
          .map(w -> w.findElements(By.tagName("td")))
          .filter(T -> T.get(0).getText().equalsIgnoreCase(basemenuname))
          .map(U -> U.get(4))
          .map(P -> P.findElements(By.tagName("a")))
          .map(O -> O.get(3))
          .forEach(S -> S.click());  */
		  
		  
		  this.partnerspotlightcount.stream()
		  .map(w -> w.findElements(By.tagName("td")))
		  .filter(T -> T.get(0).getText().equalsIgnoreCase("Maple Leaf"))
		  .map(U -> U.get(4))
		  .map(P -> P.findElement(By.tagName("span")))
		  .forEach(S -> S.click());
	  }
	  
	  public void streamtest25() {
		  this.promotionlistcount.stream()
		  .filter(U -> U.getText().equalsIgnoreCase("Sysco Produce Quality Assurance"))
		  .forEach(T -> T.click());
	  }
	  
	  
	  public void streamtest26() throws Exception {
		  List<WebElement> LS;
		  do
		  {
		   LS =  this.promotionlistcount1.stream()
				  .map(Q -> Q.findElement(By.tagName("a")))
				  .filter(T -> T.getText().equalsIgnoreCase("Savoury & Buttery Croissants and Pastries"))
				  .collect(Collectors.toList());
				   
		  int value = LS.size();
		  System.out.println("The size of LS:"+value);
		  LS.forEach(a -> System.out.println(a.getText()));
		  
		  if (LS.size()>0) {
			  LS.forEach(P -> P.click());
			  break;
		  } else if (LS.size()<1) {
			  this.nextbtn.click();
			  Thread.sleep(4000);
		  }
		  
		  }while(LS.size()<1);
		  
	  }
	  
	  public void streamtest27() {
		  int alertscount = this.Alertsall.size();
			for (int i=0; i<alertscount;i++) {
				String allalertstext = this.Alertsall.get(i).getText();
				
		  this.alertslistcount.stream()
		  .filter(U -> U.getText().equalsIgnoreCase(allalertstext))
		  .forEach(T -> T.click());
		  
		  this.Homebreadcrumb.click();
		  
	  }
	  
	 
}
	  
      public void streamtest28() {
	      String cap = this.captcha.getText();
	      System.out.println("my captcha text:"+cap);
		  
	  }
      
      
      
      
      public void streamtest29() {
    	  this.po_count.stream()
 	     .filter(T -> T.getText().equalsIgnoreCase("32747890259")).findAny().get().click();
 	      
      }
      
      
      public void streamtest30() {
    	  this.pocount.stream()
	  	 	.skip(1)
	  	 	.map(w -> w.findElements(By.tagName("td")))
	  	 	.filter(T -> T.get(10).getText().equalsIgnoreCase("32747902915"))
	  	 	.map(U -> U.get(0).findElement(By.tagName("input")))
	  	 	.forEach(S -> S.click());  
      }
      
      /*public void streamtest30() {
    	  this.pocount.stream()
    	  .skip(1)
    	  .map(w -> w.findElements(By.tagName("td")))
    	  .map(T -> T.get(9).getText())
    	  .forEach(P -> System.out.println("The value"+P));	
    	  
    	  
    	  
      }*/
    			  
     
     /* public void xmlreader12() {
    	  try{
  			String filePath = "C:\\Users\\Mukkamala-Nanda\\Downloads\\AvendraDemoIndependent_20210618_011632369.xml";
  			File file = new File(filePath);
  			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
  			DocumentBuilder dBuilder = dbf.newDocumentBuilder();
  			Document doc = dBuilder.parse(file);
  			doc.getDocumentElement().normalize();
  			System.out.println(doc.getDocumentElement().getNodeName());
  			NodeList nodeList = doc.getElementsByTagName("Invoice");
  		
  			int tLength = nodeList.getLength();
  			
  		
  		for(int i=0; i<tLength; i++){
  				Node node = nodeList.item(i);
  				
  				if(node.getNodeType()==Node.ELEMENT_NODE){
  					Element element = (Element)node;
  					//System.out.println("Number: "+element.getAttribute("acn"));
  					System.out.println("Number: "+element.getElementsByTagName("Number").item(0).getNodeValue());
  					//System.out.println("Last Name: "+element.getElementsByTagName("lastname").item(0).getTextContent());
  					//System.out.println("Balance: "+element.getElementsByTagName("balance").item(0).getTextContent());
  				}
  				
  			}
  		}catch (Exception e){
  			e.printStackTrace();
  		}
      }*/
      
      public void xmlreader() throws ParserConfigurationException, SAXException, IOException {
    	  
    	  String filePath = "C:\\Users\\Mukkamala-Nanda\\Downloads\\AvendraDemoIndependent_20210618_011632369.xml";
			File file = new File(filePath);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbf.newDocumentBuilder();
			Document doc = dBuilder.parse(file);
    	    
			NodeList children = doc.getChildNodes();
			Element accknowledgeelement = (Element)children.item(0);
			System.out.println("The Value:"+accknowledgeelement.getNodeName());
			
			NodeList items = doc.getElementsByTagName("Vendor");
			Element firstitem = (Element)items.item(0);
			NodeList numbers = firstitem.getElementsByTagName("Number");
			NodeList names = firstitem.getElementsByTagName("Name");
			Element number = (Element)numbers.item(0);
			Element name = (Element)names.item(0);
			System.out.println("The Number:"+number.getTextContent());
			System.out.println("The Name:"+name.getTextContent());
			
			 /*JavascriptExecutor js1 = (JavascriptExecutor)driver;
			String fileName = (String) js1.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('#downloadsList downloads-item').shadowRoot.querySelector('div#content #file-link').text");
			System.out.println("File Name :-" + fileName);*/
			
			
    	  
      }
      
      
    

    

      public String pickLatestFileFromDownloads() {

          String currentUsersHomeDir = System.getProperty("user.home");

          String downloadFolder = currentUsersHomeDir + File.separator + "Downloads" + File.separator;

          File dir = new File(downloadFolder);
          File[] files = dir.listFiles();
          if (files == null || files.length == 0) {
              //testLogger.info("There is no file in the folder");
          }

          File lastModifiedFile = files[0];
          for (int i = 1; i < files.length; i++) {
              if (lastModifiedFile.lastModified() < files[i].lastModified()) {
                  lastModifiedFile = files[i];
              }
          }
          String k = lastModifiedFile.toString();

          System.out.println("The Last modified file was:"+lastModifiedFile);
          Path p = Paths.get(k);
          String file = p.getFileName().toString();
          System.out.println("The last downloaded file is " + file);
          return file;

      }
      
      
      public void streamtest31() {
    	  this.pocounting.stream()
	  	 	.skip(1)
	  	 	.map(w -> w.findElements(By.tagName("td")))
	  	 	.filter(T -> T.get(6).getText().equalsIgnoreCase("K2FLA"))
	  	 	.map(U -> U.get(0).findElement(By.tagName("input")))
	  	 	.forEach(S -> S.click());  
      }
      
}