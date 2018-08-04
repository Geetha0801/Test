package testcase;


import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import wdMethods.Annotations;
import wdMethods.SeMethods;

public class EditLead  extends Annotations{
	//@Test(dependsOnMethods = {"testcase.CreateLead.createLead"})
	//@Test
	//@Test(groups= {"sanity"},dependsOnMethods="testcase.CreateLead.createLead")
	
	 @BeforeTest
	 public void setValues()
	 {
		 excelFName = "EditLead";
		 testName = "Edit Lead";
		 testDesc = "Edit a Lead";
		 category = "sanity";
		 author = "geetha";
		 moduleName = "Leads";
		 
	 }
	
	
	@Test(dataProvider="fetchData")
	public void editLead(String fName) throws InterruptedException {
//	startApp("chrome", "http://leaftaps.com/opentaps");
//	WebElement eleUserName = locateElement("id", "username");
//	type(eleUserName, "DemoSalesManager");
//	WebElement elePassword = locateElement("id","password");
//	type(elePassword, "crmsfa");
//	WebElement eleLogin = locateElement("class","decorativeSubmit");
//	click(eleLogin);
//	WebElement eleCrmLink = locateElement("linkText","CRM/SFA");
//	click(eleCrmLink);
	//WebElement eleCreateLead = locateElement("linkText","Create Lead");
	//click(eleCreateLead);
	click(locateElement("linkText","Leads"));
	
	//driver.findElementByLinkText("Find Leads").click();
	click(locateElement("linkText","Find Leads"));
	
	//driver.findElementByXPath("//label[contains(text(),'Lead ID')]/following::input[2]").sendKeys("LATHA");
	type(locateElement("xpath","//label[contains(text(),'Lead ID')]/following::input[2]"),fName);
	
	//driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
	click(locateElement("xpath","//button[contains(text(),'Find Leads')]"));
	Thread.sleep(2000);
	//driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	
	//System.out.println(driver.getTitle().toString());
	verifyTitle("View Lead");
	//driver.findElementByXPath("(//div[contains(text(),'Lead')])[2]/following::a[3]").click();
	click(locateElement("xpath","//a[contains(text(),'Edit')]"));
	//driver.findElementById("updateLeadForm_companyName").clear();
	clear(locateElement("updateLeadForm_companyName"));
	//driver.findElementById("updateLeadForm_companyName").sendKeys("Accenture");
	type(locateElement("updateLeadForm_companyName"),"Accenture");
	//driver.findElementByName("submitButton").click();
	click(locateElement("name","submitButton"));
	verifyExactText(locateElement("viewLead_companyName_sp"),"Accenture");
	 //closeBrowser();
	}
	
}	
