package a3_excelTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A3_GetAllValue {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Rohini\\Desktop\\Workspace\\batch251\\A7_FileHandlingTest\\File\\Sample.xlsx");
		FileInputStream fis =new FileInputStream(f);
		// .xls - 2003< HSSF - HSSFWorkbook
		// .xlsx - 2003> XSSF - XSSFWorkbook
		
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Home");
		
		int row =sheet.getLastRowNum()+1;
		int col=sheet.getRow(0).getLastCellNum();
		
		for (int rownum=0; rownum<row;rownum++){
			for (int colnum=0; colnum<col;colnum++){
				String data=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
				System.out.print(data +" ");	
			}
			System.out.println();
		}
		
		
	}
}
