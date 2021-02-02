package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelAll {

	public static void main(String[] args) throws IOException {
		// to read and print all value from excel sheet

		XSSFWorkbook wb = new XSSFWorkbook("./data/ExcelSheet.xlsx");
	
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
				//get row count
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		// ctrl+2 l
		// if we get the last row number the selenium will count the row number automatic
		
				// get column count
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		// ctrl+2 L
		// 0 means use the first row to count the column
		// if we get the last column number the selenium will count the columnnumber automatic

		for (int i = 0; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i); // changed indexing with i
			
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j); // changed the indexing with j
				
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
		}
		
		// how to do this, check the screenshot or note book


	}

}
