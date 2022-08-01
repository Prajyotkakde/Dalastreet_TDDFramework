package exOfDataProviderWIthExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	String path = "C:\\Users\\232338\\eclipse-workspace\\April02DalalStreetProject\\dataProviderEx\\exOfDataProviderWIthExcel\\TestData1.xlsx";
	
	File file ;
	FileInputStream fis;
	XSSFWorkbook wb ;
	XSSFRow row;
	XSSFSheet sheet;
	XSSFCell cell;
	
	
	public String readDataFromExcel(String sheetname,int row,int cel) throws IOException
	{
		 file = new File(path);
		 fis= new FileInputStream(file);
		 wb = new XSSFWorkbook(fis);
		 sheet = wb.getSheet(sheetname); 
		
		 cell= sheet.getRow(row).getCell(cel);
		String data = cell.getStringCellValue();
		
		return data;
	}
	
	public int getRowCount(String sheetname) throws IOException
	{
		 file = new File(path);
		 fis= new FileInputStream(file);
		 wb = new XSSFWorkbook(fis);
		 sheet = wb.getSheet(sheetname); 
		
		int rowcount = sheet.getLastRowNum();
		return rowcount;
	}
	
	public int getCellCount(String sheetname,int r) throws IOException
	{
		file = new File(path);
		fis= new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(sheetname); 
		
		row= sheet.getRow(r);
		int cellcount =row.getLastCellNum();
		return cellcount;
	}
	

}
