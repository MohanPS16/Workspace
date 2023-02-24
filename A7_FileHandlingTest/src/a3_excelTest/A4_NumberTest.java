package a3_excelTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A4_NumberTest {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Rohini\\Desktop\\Workspace\\batch251\\A7_FileHandlingTest\\File\\number.xlsx");
		FileInputStream fis =new FileInputStream(f);
		// .xls - 2003< HSSF - HSSFWorkbook
		// .xlsx - 2003> XSSF - XSSFWorkbook
		
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Number");
		
		int row =sheet.getLastRowNum()+1;
		int col=sheet.getRow(0).getLastCellNum();
		
		for (int rownum=0; rownum<row;rownum++){
			for (int colnum=0; colnum<col;colnum++){
				sheet.getRow(rownum).getCell(colnum).setCellType(Cell.CELL_TYPE_STRING);
				String data=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
				System.out.print(data +" ");	
			}
			System.out.println();
	}
	}
}
