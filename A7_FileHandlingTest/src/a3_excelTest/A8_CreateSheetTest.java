package a3_excelTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A8_CreateSheetTest {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:/Users/Rohini/Desktop/Workspace/batch251/FileHandlingTest/File/empty.xlsx");
		FileInputStream fis =new FileInputStream(f);
		// .xls - 2003< HSSF - HSSFWorkbook
		// .xlsx - 2003> XSSF - XSSFWorkbook
		
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.createSheet("Vcentry");//new sheet will create 
		
		XSSFRow row= sheet.createRow(5);
		XSSFCell cell= row.createCell(5);
		
		cell.setCellValue("Vcentry Technoligies");
		
		FileOutputStream fos= new FileOutputStream(f);
		workbook.write(fos);
		fos.close();
	}
}
