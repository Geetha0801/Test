package week6.day1;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ReadExcel  {    

	public  Object[][] readExcel(String fileName) throws IOException
	{ 
		//open the workbook
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+fileName+".xlsx");
		//go to the sheet
		XSSFSheet sheet = wBook.getSheetAt(0);
		// find row count
		int rowCount = sheet.getLastRowNum();
		//find cell count
		int columnCount = sheet.getRow(0).getLastCellNum();
		// read data
		Object[][] data = new Object[rowCount][columnCount];
		for(int i=1;i<=rowCount;i++)
		{
			//go to the specific row
			XSSFRow row= sheet.getRow(i);
			for(int j=0;j<columnCount;j++)
			{
				try {
					XSSFCell cell =row.getCell(j);
					// fetch the data
					data[i-1][j] = cell.getStringCellValue();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					data[i-1][j] = "";
				}
				//System.out.println(data);
			}
		}
		wBook.close();
		return data;
		
	}
}
