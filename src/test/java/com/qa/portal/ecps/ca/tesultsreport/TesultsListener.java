package com.qa.portal.ecps.ca.tesultsreport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.portal.ecps.ca.tests.baseTest;
import com.tesults.tesults.Results;

public class TesultsListener extends baseTest implements ITestListener {
	
	List<Map<String,Object>> testCases = new ArrayList<Map<String, Object>>();
	
	
	private static String getTestMethodName(ITestResult iTestResult) {
	    return iTestResult.getMethod().getConstructorOrMethod().getName();
	  }
	
	
	public static Object[] getTestParams(ITestResult iTestResult) {
		return iTestResult.getParameters();
	}
	
	public byte[] saveScreenshotPNG(WebDriver driver) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}
	
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("I am in onTestStart method" +getTestMethodName(result)+ "start");
	}

	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		//System.out.println("I am in onTestSuccess method " +  getTestMethodName(iTestResult) + " succeed");
	    Map<String, Object> testCase = new HashMap<String, Object>();
	    testCase.put("name", getTestMethodName(iTestResult));
	    testCase.put("suite", "TesultsExample");
	    testCase.put("result", "pass");
	    testCases.add(testCase);
	}

	@Override
	public void onTestFailure(ITestResult iTestResult) {
		//System.out.println("I am in onTestFailure method " +  getTestMethodName(iTestResult) + " failed");
	    Map<String, Object> testCase = new HashMap<String, Object>();
	    testCase.put("name", getTestMethodName(iTestResult));
	    testCase.put("suite", "TesultsExample");
	    testCase.put("result", "fail");
	    testCase.put("params", getTestParams(iTestResult));
	    List<String> files = new ArrayList<String>();
	    //files.add(getScreenshot());
	    testCase.put("files", files);
	    testCases.add(testCase);
		
	}

	
	@Override
	public void onTestSkipped(ITestResult iTestResult) {
		  System.out.println("I am in onTestSkipped method "+  getTestMethodName(iTestResult) + " skipped");
		    Map<String, Object> testCase = new HashMap<String, Object>();
		    testCase.put("name", getTestMethodName(iTestResult));
		    testCase.put("suite", "TesultsExample");
		    testCase.put("result", "unknown");
		    testCases.add(testCase);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext iTestContext) {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("target", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6Ijk5MTUzNjhlLTQ1MTYtNGI0Yi04YWI1LTE1MzZhOWU5YWMwZS0xNTg1NTkxMTM2NjUxIiwiZXhwIjo0MTAyNDQ0ODAwMDAwLCJ2ZXIiOiIwIiwic2VzIjoiNzU3ODU3MjgtODMzNC00NzE2LWFhMzYtNzc4ZWYxYjU1M2M2IiwidHlwZSI6InQifQ.A_y4K9sZTOGejXuyVa3A9ah94g-UBewcIxKczgYcc2g");
		
		Map<String, Object> results = new HashMap<String, Object>();
		results.put("cases",testCases);
		data.put("results", results);
		
		//Upload 
		Map<String, Object> response = Results.upload(data);
	    System.out.println("success: " + response.get("success"));
	    System.out.println("message: " + response.get("message"));
	    System.out.println("warnings: " + ((List<String>) response.get("warnings")).size());
	    System.out.println("errors: " + ((List<String>) response.get("errors")).size());
		
	}

}
