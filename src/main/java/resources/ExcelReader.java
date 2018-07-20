package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelReader extends TestBase {

	public WebDriver driver;
	public boolean writeToExcel(String xlsFilePath, String Sheetname, String[][] obj) {
		boolean result = false;
		try {
			System.out.println("Writing Data into Excel Sheet");
			FileInputStream fis = new FileInputStream("C:\\Assignment\\FOX_Assig_Madhavi\\data.xlsx");
			@SuppressWarnings("resource")
			XSSFWorkbook excel = new XSSFWorkbook(fis);
			XSSFSheet sheet = excel.getSheet(Sheetname);
/*
			int rows = obj.length;
			int cols = obj[0].length;
			for (int i = 0; i <= rows - 1; i++) // rows
			{
				Row row = sheet.createRow(i);
				for (int j = 0; j <= cols - 1; j++) // cols
				{
					row.createCell(i).setCellValue(obj[i][j]);
				}
			}
			*/
			
			
			XSSFRow row = sheet.getRow(0);
			XSSFRow newRow = sheet.createRow(sheet.getFirstRowNum()+1);
			for(int i=0; i < row.getLastCellNum();i++) {
				XSSFCell cell = newRow.createCell(i);
				cell.setCellValue(obj[0][i]);
			}
			
			// Close input stream
			fis.close();
			// Create an object of FileOutputStream class to create write data in excel file
			FileOutputStream fos = new FileOutputStream(xlsFilePath);
			// write data in the excel file
			excel.write(fos);
			// close output stream
			fos.close();
		}
		catch (Exception e) {
			
			System.out.print("file not created ");
		}
		return result;
	}
}
