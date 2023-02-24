package a3_excelTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A1_ExcelTest {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Rohini\\Desktop\\Workspace\\batch251\\A7_FileHandlingTest\\File\\Sample.xlsx");
		FileInputStream fis =new FileInputStream(f);
		// .xls - 2003< HSSF - HSSFWorkbook - Horrible SpreadSheet Format
		// .xlsx - 2003> XSSF - XSSFWorkbook - XML SpreadSheet Format
		
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Home");
		//XSSFSheet sheet=workbook.getSheetAt(0);
		
		int row =sheet.getLastRowNum()+1;
		System.out.println("Total Row - "+row);
		
		int col=sheet.getRow(0).getLastCellNum();
		System.out.println("Total Column - "+col);
		
	}
}
