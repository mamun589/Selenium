package integrateExcelWithDataProvider;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		
		// enter into a file
		XSSFWorkbook wb = new XSSFWorkbook("./data/ExcelSheet.xlsx");
// XSSFWorkbook is the syntax and import
// inside "" this is the project path starting from ./
// data is the folder name (check note)
// ExcelSheet.xlsx is the excel file name with extension

		// enter into sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
// Sheet1 is the sheet name in excel

		// enter into row
		XSSFRow row = sheet.getRow(1);
// 1 is the row number starting from index 0

		// enter into column
		XSSFCell cell = row.getCell(2);
// 2 is the column number starting from index 0

		// creating object of the cell number	
		String value = cell.getStringCellValue();
// this is how we call any name 
// cell.getStringCellValue() this is we right down first the ctrl+2 L

		System.out.println(value);
// this is how we print

// changing the row and column index we can print the different different name or value from excel

}
	
}
