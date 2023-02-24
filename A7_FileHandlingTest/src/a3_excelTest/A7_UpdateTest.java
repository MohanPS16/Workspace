package a3_excelTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A7_UpdateTest {

	public static void main(String[] args) throws IOException {
		File f=new File("C:/Users/Rohini/Desktop/Workspace/batch251/FileHandlingTest/File/empty.xlsx");
		FileInputStream fis =new FileInputStream(f);
		// .xls - 2003< HSSF - HSSFWorkbook
		// .xlsx - 2003> XSSF - XSSFWorkbook
		
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Empty");
		
		int row =sheet.getLastRowNum()+1;
		int col=sheet.getRow(0).getLastCellNum();
		
		for (int rownum=0; rownum<row;rownum++){
			for (int colnum=0; colnum<col;colnum++){
			//	sheet.getRow(rownum).getCell(colnum).setCellType(Cell.CELL_TYPE_STRING);
				
				if(sheet.getRow(rownum).getCell(colnum)!=null){
				
				if(sheet.getRow(rownum).getCell(colnum).getCellType()==Cell.CELL_TYPE_STRING){
				String data=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
				System.out.print(data +" ");	
			}  else if (sheet.getRow(rownum).getCell(colnum).getCellType()==Cell.CELL_TYPE_NUMERIC){
				int data=(int)sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
				System.out.print(data +" ");
			}
			}
				else {
					System.out.print ("This is Empty Cell   ");
				}
			}
			System.out.println();
}
			//update excel
		FileOutputStream fos = new FileOutputStream(f);
		sheet.getRow(1).getCell(2).setCellValue("Guindy");
		workbook.write(fos);
		fos.close();
}
}
