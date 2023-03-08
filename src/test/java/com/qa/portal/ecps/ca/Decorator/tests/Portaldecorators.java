package com.qa.portal.ecps.ca.Decorator.tests;

import java.util.function.Consumer;

import org.testng.Assert;

import com.qa.portal.ecps.ca.pages.Decorator.Portalpublicpage;
import com.qa.portal.ecps.ca.pages.Decorator.Portalpublicsuccesspage;

public class Portaldecorators {
	
	public static final Consumer<Portalpublicpage> homeclick = (p) -> p.hometabclick();
	public static final Consumer<Portalpublicpage> psclick = (p) -> p.productandservicestabclick();
	//public static final Consumer<Portalpublicpage> successstoriesclick = (p) -> p.successstoriestabclick();
	public static final Consumer<Portalpublicsuccesspage> successstoriesclick = (p) -> p.successstoriestabclick();
	
	
	public static final Consumer<Portalpublicpage> hometxt = (p) -> Assert.assertEquals(p.gethometabtxt(), "PRODUCTS & SERVICES");
	public static final Consumer<Portalpublicpage> pstxt = (p) -> Assert.assertEquals(p.getproductandservicestabtxt(), "BENEFITS");
	//public static final Consumer<Portalpublicpage> successtxt = (p) -> Assert.assertEquals(p.getsuccessstoriestabtxt(), "SUCCESS STORIES");
	public static final Consumer<Portalpublicsuccesspage> successtxt = (p) -> Assert.assertEquals(p.getsuccessstoriestabtxt(), "SUCCESS STORIES");


}
