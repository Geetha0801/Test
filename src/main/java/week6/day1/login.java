package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class login {
    
	@Test
	public void login() throws IOException
	{ 
		//open the workbook
		XSSFWorkbook wBook = new XSSFWorkbook("./data/login.xlsx");
		//go to the sheet
		XSSFSheet sheet = wBook.getSheet("login");
		// find row count
		int rowCount = sheet.getLastRowNum();
		//find cell count
		int columnCount = sheet.getRow(0).getLastCellNum();
		// read data
		for(int i=1;i<=rowCount;i++)
		{
			//go to the specific row
			XSSFRow row= sheet.getRow(i);
			for(int j=0;j<columnCount;j++)
			{
				XSSFCell cell =row.getCell(j);
				// fetch the data
				String data = cell.getStringCellValue();
				System.out.println(data);
			}
		}
		wBook.close();
		
	}
}
