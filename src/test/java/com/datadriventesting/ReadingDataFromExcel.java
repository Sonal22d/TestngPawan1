package com.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(
				"D:\\D Drive_bkp\\Java_Workspace1\\TestngPawan\\src\\test\\java\\com\\datadriventesting\\DDTesting.xlsx");

		// FileInputStream fis = new
		// FileInputStream(System.getProperty("user.dir")+"//com//datadriventesting//DDTesting.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Data_Sheet1");
		int totalrows = sheet.getLastRowNum();
		int totalcell = sheet.getRow(0).getLastCellNum();

		System.out.println("Totl rows:" + totalrows);
		System.out.println("Totl cells:" + totalcell);

		for (int i = 0; i <= totalrows; i++) {
			// XSSFRow currentrow = sheet.getRow(i);
			for (int j = 0; j < totalcell; j++) {
//				XSSFCell location = currentrow.getCell(j);
//				String value = location.toString();

				XSSFCell location = sheet.getRow(i).getCell(j);
				String value = location.toString();
				System.out.print(" " + value + " ");
				System.out.print("\t");
			}
			System.out.println();
		}
		workbook.close();
		fis.close();
	}
}

//		FileInputStream fis = new FileInputStream(
//				"D:\\D Drive_bkp\\Java_Workspace1\\TestngPawan\\src\\test\\java\\com\\datadriventesting\\DDTesting.xlsx");
//
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		XSSFSheet sheet = workbook.getSheet("Data_Sheet1");
//		int totalrows = sheet.getLastRowNum();
//		int totalcells = sheet.getRow(0).getLastCellNum();
//
//		System.out.println("Total no.of rows:"+totalrows);
//		System.out.println("Total no.of cells:"+totalcells);
//
//		for (int i = 0; i <= totalrows; i++) {
//
//			for (int j = 0; j < totalcells; j++) {
//				XSSFCell data = sheet.getRow(i).getCell(j);
//				System.out.print(data);
//				System.out.print("\t");
//				// String value = data.toString();
//				// System.out.print( " "+value);
//			}
//			System.out.println();
//		}
//	}
//}

//Reading data from excel sheet. Use third party library -Apache-POI
//Add its dependencies in POM.xml