package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.util.Date; 

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook; 
import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.Workbook; 
import org.apache.poi.xssf.usermodel.XSSFSheet;

/** * Simple Java Program to read and write dates from Excel file in Java. * This example particularly read Excel file in OLE format i.e. * Excel file with extension .xls, also known as XLS files. * * @author WINDOWS 8 * */ 

public class ExcelDateReader { 
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		writeIntoExcel("birthdays.xlsx"); readFromExcel("birthdays.xlsx"); }
	
	public static void readFromExcel(String file) throws IOException{ 
		XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(file));
	
	XSSFSheet myExcelSheet = myExcelBook.getSheet("Birthdays");
	
	XSSFRow row = myExcelSheet.getRow(0); 
	
	if(row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING){ String name = row.getCell(0).getStringCellValue();
	
	System.out.println("NAME : " + name); 
	
	} if(row.getCell(1).getCellType() == HSSFCell.CELL_TYPE_NUMERIC){ Date birthdate = row.getCell(1).getDateCellValue(); System.out.println("DOB :" + birthdate); } myExcelBook.close(); } @SuppressWarnings("deprecation") public static void writeIntoExcel(String file) throws FileNotFoundException, IOException{ Workbook book = new XSSFWorkbook(); Sheet sheet = book.createSheet("Birthdays"); Row row = sheet.createRow(0); Cell name = row.createCell(0); name.setCellValue("Gokul"); Cell birthdate = row.createCell(1); DataFormat format = book.createDataFormat(); CellStyle dateStyle = book.createCellStyle(); dateStyle.setDataFormat(format.getFormat("dd.mm.yyyy")); birthdate.setCellStyle(dateStyle); birthdate.setCellValue(new Date(115, 10, 10)); sheet.autoSizeColumn(1); book.write(new FileOutputStream(file)); book.close(); } }

	//Read more: http://javarevisited.blogspot.com/2015/06/how-to-read-write-excel-file-java-poi-example.html#ixzz3ds9aybbu