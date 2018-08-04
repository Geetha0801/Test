package wdMethods;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week6.day1.ReadExcel;

public class Annotations extends SeMethods {
	public String excelFName,testName,testDesc,category,author,moduleName;
	
	
	@BeforeSuite
	public void startSuite()
	{
		beginResult();
	}
	@BeforeClass
	public void startTest()
	{
		startTest(testName,testDesc);
	}
	@Parameters({"url","uName","pwd"})
	@BeforeMethod (groups= {"smoke","sanity"})
	public void login(String url,String uName,String pwd)
	 {
		startTestIteration(moduleName, author, category);
		startApp("chrome", url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, uName);
		WebElement elePassword = locateElement("id","password");
		type(elePassword, pwd);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);	
		//startTestIteration(iteration)
		WebElement eleCrmLink = locateElement("linkText","CRM/SFA");
		click(eleCrmLink);
	 }	
	
	//@AfterMethod(groups= {"smoke","regression"})
	@AfterMethod
	public void close()
	{
		closeBrowser();
	}
	@DataProvider(name = "fetchData")
	public Object[][] getData() throws IOException{
		//Object[][] data = ReadExcel.
		ReadExcel excel = new ReadExcel();
		return excel.readExcel(excelFName);
		
		}
	
	@AfterSuite
	public void endSuite() {
		endResult();
	}
	
}
