package testcase;


import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;

public class DuplicateLead extends Annotations{
	
	@BeforeTest
	 public void setValues()
	 {
		 excelFName = "DuplicateLead";
		 testName = "Duplicate Lead";
		 testDesc = "Duplicate a Lead";
		 category = "sanity";
		 author = "geetha";
		 moduleName = "Leads";
		 
	 }
	
	@Test(dataProvider="fetchData")
	//@Test(enabled=false)
	public void duplicateLead(String email) throws Exception
	{
//		startApp("chrome", "http://leaftaps.com/opentaps");
//		WebElement eleUserName = locateElement("id", "username");
//		type(eleUserName, "DemoSalesManager");
//		WebElement elePassword = locateElement("id","password");
//		type(elePassword, "crmsfa");
//		WebElement eleLogin = locateElement("class","decorativeSubmit");
//		click(eleLogin);
//		WebElement eleCrmLink = locateElement("linkText","CRM/SFA");
//		click(eleCrmLink);
//		WebElement eleCreateLead = locateElement("linkText","Create Lead");
//		click(eleCreateLead);
		click(locateElement("linkText","Leads"));
		//driver.findElementByLinkText("Find Leads").click();
		click(locateElement("linkText","Find Leads"));
		//driver.findElementByXPath("//span[contains(text(),'Email')]").click();
		click(locateElement("xpath","//span[contains(text(),'Email')]"));
		//driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("athirasabu94@gmail.com");
		type(locateElement("xpath","//input[@name='emailAddress']"),email);
		//driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		click(locateElement("xpath","//button[contains(text(),'Find Leads')]"));
		timeOuts();
		String name = getText(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName']"));
		
		//driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		//driver.findElementByXPath("//a[contains(text(),'Duplicate Lead')]").click();
		click(locateElement("xpath","//a[contains(text(),'Duplicate Lead')]"));
		verifyTitle("Duplicate Lead");
		timeOuts();
		verifyExactAttribute(locateElement("createLeadForm_firstName"),"Value",name);
		closeBrowser();
	}


}
