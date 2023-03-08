package com.qa.portal.ecps.ca.tests;

import org.testng.asserts.SoftAssert;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class testfillo {

	public static void main(String[] args) throws Exception {
		String myHomePath= System.getProperty("user.home");
		String excelpath = myHomePath+"\\Downloads\\Partner Spotlight Report.xls";
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection(excelpath);
		//Connection connection = fillo.getConnection("C:\\Users\\Mukkamala-Nanda\\Downloads\\Partner Spotlight Report.xls");
		
		String strQuery = "Select * from \"Partner Spotlight Report\"";
		Recordset rs = connection.executeQuery(strQuery);
		
		while(rs.next())
		{
			
		//System.out.println(rs.getField("Promotion Name"));
		String pname = rs.getField("Partner Spotlight Name");
		System.out.println("The vlaue:"+pname);
		if (pname.equalsIgnoreCase("Partner Spot light check")){
			SoftAssert assertion = new SoftAssert();
			assertion.assertEquals(pname, "Partner Spot light check");
			//assertion.assertTrue(pname.contains("Partner Spot light check"),"The data exists");
			assertion.assertAll();
		}
			
		
		
		
		}
		
		
		/*String strQuery = "Select * from \"Partner Spotlight Report\" where Partner Spotlight Name= 'Nanda_pst'";
		Recordset rs = connection.executeQuery(strQuery);
		
		while(rs.next())
			
		{
			System.out.println(rs.getField("Province"));
		}*/
		
		
		
		
		rs.close();
		
		//rs.next();
		
		//System.out.println(rs.getField(9).value());
		
//		Thread.sleep(7000);
//		SoftAssert assertion = new SoftAssert();
//		assertion.assertTrue(pname.contains("Testing clicks"),"The data exists");
//		assertion.assertAll();

	}

	
	
	/*try {
		element.isDisplayed();
		doSomething();
		}
		catch (NoSuchElementException e) {
		throw new RuntimeException("This is where you put the message");
		}*/
	
	
}
