package com.qa.portal.ecps.ca.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldata {
	

	public static void main(String[] args) throws Exception {
	
		File src = new File ("C:\\Users\\Mukkamala-Nanda\\Downloads\\Partner Spotlight Report.xls");
		
		FileInputStream fls = new FileInputStream(src);
		
		//XSSFWorkbook wb = new XSSFWorkbook(fls);
		
		HSSFWorkbook wb = new HSSFWorkbook(fls);
		
		//XSSFSheet sheet1 = wb.getSheetAt(0);
		
		HSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rowcount = sheet1.getLastRowNum();
		
		System.out.println("Total rows is:"+rowcount);
		
		for (int i=0;i<rowcount;i++) {
			String value = sheet1.getRow(i).getCell(9).getStringCellValue();
			System.out.println("The value "+value);
			
			
			
		}
		
		wb.close();
		
		
	}

}
