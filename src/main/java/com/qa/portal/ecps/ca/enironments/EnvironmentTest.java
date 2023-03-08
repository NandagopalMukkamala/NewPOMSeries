package com.qa.portal.ecps.ca.enironments;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EnvironmentTest {
	
	Environment testEnvironment;

    @Test
    public void functionalTest() {
        System.out.println(testEnvironment.url());
        //System.out.println(testEnvironment.getDBHostname());
        //System.out.println(testEnvironment.getDBPassword());
    }
    
    

    @BeforeTest
    @Parameters({"environment"})
    public void beforeTest(String environemnt) {
        ConfigFactory.setProperty("env", environemnt);
        testEnvironment = ConfigFactory.create(Environment.class);
    }
    
    @Test
    public void filename() {
    Path filePath = Paths.get(".", "Udemy Design patterns");
    System.out.println("The pathname:"+filePath);
    }

    @Test
    public void filename2() {
    	 Path relative = Paths.get("Supplier List By Name.pdf");
    	    System.out.println("Relative path: " + relative);
    	    Path absolute = relative.toAbsolutePath();
    	    System.out.println("Absolute path: " + absolute);
    }
    
    
    @Test
    public void filename3() {
    	String myHomePath= System.getProperty("user.home");
		String pdfpath = myHomePath+"/Downloads/Supplier List By Name.pdf";
    Path filePath = Paths.get(pdfpath);
    System.out.println("The pathname2:"+filePath);
    }
    
    @Test
    public void filename4() {
    Path filePath = Paths.get(".");
    System.out.println("The pathname3:"+filePath);
    }
    
}


//mvn clean test -Denvironment=dev