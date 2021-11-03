package com.demo.actitimeGeneric;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

 public String getStringData(String filepath,String sheetName,int rowNo,int columnNo) {
	 try {
		 FileInputStream file = new FileInputStream(filepath);
		 Workbook workBook = WorkbookFactory.create(file);
		 return workBook.getSheet(sheetName).getRow(rowNo).getCell(columnNo).getStringCellValue();
	 } catch(Exception e) {
		 e.printStackTrace();		 
	 }
	 return null;
	 
 }
 
 public double getNumericData(String filepath,String sheetName,int rowNo,int columnNo) {
	 try {
		 FileInputStream file = new FileInputStream(filepath);
		 Workbook workBook = WorkbookFactory.create(file);
		 return workBook.getSheet(sheetName).getRow(rowNo).getCell(columnNo).getNumericCellValue();
	 } catch(Exception e) {
		 e.printStackTrace();		 
	 }
	 return 0;
	 
 }
 
 public String getData(String filepath,String sheetName,int rowNo,int columnNo) {
	 try {
		 FileInputStream file = new FileInputStream(filepath);
		 Workbook workBook = WorkbookFactory.create(file);
		 return workBook.getSheet(sheetName).getRow(rowNo).getCell(columnNo).toString();
	 } catch(Exception e) {
		 e.printStackTrace();		 
	 }
	 return null;
 }
 public Boolean getBooleanData(String filepath,String sheetName,int rowNo,int columnNo) {
	 try {
		 FileInputStream file = new FileInputStream(filepath);
		 Workbook workBook = WorkbookFactory.create(file);
		 return workBook.getSheet(sheetName).getRow(rowNo).getCell(columnNo).getBooleanCellValue();
	 } catch(Exception e) {
		 e.printStackTrace();		 
	 }
	 return null;
 }
}
