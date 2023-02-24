package f2_excelTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelClass {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Rohini\\Desktop\\Workspace\\batch251\\D4_frameWorkTask\\file\\Excel.xlsx");
		FileInputStream fis =new FileInputStream(f);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Home");
		
		String data=sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data);
		
	}
}
