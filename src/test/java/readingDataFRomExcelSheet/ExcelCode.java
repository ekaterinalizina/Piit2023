package readingDataFRomExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelCode {
	//create an Excel sheet which has the data
	//copy the excel sheet under this package
	//if you edit the excel sheet, it will make to difference to the excel sheet copied here
	//create a method void
	
	public static XSSFWorkbook workbook;
	public static FileInputStream ip;
	public static XSSFSheet sheet;
	
	@DataProvider
	public static void getRediffExcelData(){
		
	}
	
	public static Object[][] readDataFromExcel(String sheetName) throws IOException {
		//create the object of FileInput Stream
		
		 ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\readingDataFRomExcelSheet\\RediffData.xlsx");
		
		//you have to create the object of xssWorkbook
		 workbook = new XSSFWorkbook(ip);
		
		sheet = workbook.getSheet(sheetName);
		
		//determine the number of rows and columns
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object [rows][cols];
		for(int i = 0; i < rows; i++) {
			XSSFRow row = sheet.getRow(i+1); // so it will start from  the 1st value 
			
			for(int j=0; j<cols; j++) {
				XSSFCell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				switch (cellType) {
				case STRING:
					data[i][j] = cell.getStringCellValue();
					break;
					
				case NUMERIC:
					data [i][j] = Integer.toString((int)cell.getNumericCellValue());
					break;
					
					case BOOLEAN:
					data[i][j] = cell.getBooleanCellValue();
					break;
				}
			}
		}
		return data;
	}
}
