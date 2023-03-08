package com.qa.portal.ecps.ca.Decorator.tests;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.qa.portal.ecps.ca.pages.Decorator.Portalpublicpage;
import com.qa.portal.ecps.ca.pages.Decorator.Portalpublicsuccesspage;
import com.qa.portal.ecps.ca.tests.baseTest;

import static com.qa.portal.ecps.ca.Decorator.tests.Portaldecorators.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PortalpublicpageTest extends baseTest {
	
	
	
		
	private Portalpublicpage portalpublicpage;
	private Portalpublicsuccesspage portalpublicsuccesspage;
	
	@BeforeTest
	public void setPortalpublicpage() {
		this.portalpublicpage = new Portalpublicpage(driver);
		this.portalpublicsuccesspage = new Portalpublicsuccesspage(driver);
	}
	
	@Test
	public void goTo() {
		this.driver.get("https://qa-portal.ecps.ca/");
		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
	}
	
	
	@Test(dataProvider = "getData")
	public void portalTest(Consumer<Portalpublicpage> consumer) {
		//portalpublicpage.goTo();
		consumer.accept(portalpublicpage);
		//Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
	}
	
	
	@Test(dataProvider = "getData1")
	public void portalTest1(Consumer<Portalpublicsuccesspage> consumer1) {
		//portalpublicpage.goTo();
		consumer1.accept(portalpublicsuccesspage);
		//Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
	}
	
	@Test
	public void assertiontest() throws Exception {
		File expected = Paths.get("C:\\Users\\Mukkamala-Nanda\\Downloads\\mytext.txt").toFile();
		//File actual = Paths.get("C:\\Users\\Mukkamala-Nanda\\Downloads\\FirstTestCase.csv").toFile();
		//List<String > expected = Files.readAllLines(Paths.get("C:\\Users\\Mukkamala-Nanda\\Downloads\\Myfile.xlsx"));
  	      assertThat(expected).as("File comparison").hasContent("SRI");
		//assertThat(expected).as("File comparison").contains("atlanta");
	}
	

	@DataProvider
	public Object[] getData() {
		return new Object[] {
				homeclick.andThen(hometxt),
				psclick.andThen(pstxt)
				//successstoriesclick.andThen(successtxt)
		};
	}	
	
	
	@DataProvider
	public Object[] getData1() {
		return new Object[] {
//				homeclick.andThen(hometxt),
//				psclick.andThen(pstxt),
				successstoriesclick.andThen(successtxt)
		};
	}	
		
	

	
}
