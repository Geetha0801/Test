package testcase;




import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;

public class DeleteLead extends Annotations{
	
	 @BeforeTest
	 public void setValues()
	 {
		 excelFName = "DeleteLead";
		 testName = "Delete Lead";
		 testDesc = "Delete a Lead";
		 category = "sanity";
		 author = "geetha";
		 moduleName = "Leads";
		 
	 }
	
	
	
	@Test(dataProvider="fetchData")
	//@Test
	//@Test(dependsOnMethods = {"testcase.CreateLead.createLead"})
	public void deleteLead(String phone) throws InterruptedException
	{
		//Thread.sleep(6000);
//		WebElement eleCrmLink = locateElement("linkText","CRM/SFA");
//		click(eleCrmLink);
//		WebElement eleCreateLead = locateElement("linkText","Create Lead");
//		click(eleCreateLead);
		click(locateElement("linkText","Leads"));
		//driver.findElementByLinkText("Find Leads").click();
		click(locateElement("linkText","Find Leads"));
		//driver.findElementByXPath("//span[contains(text(),'Phone')]").click();
		click(locateElement("xpath","//span[contains(text(),'Phone')]"));
		
		//driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9843532322");
		type(locateElement("xpath","//input[@name='phoneNumber']"),phone);
		
		//driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		click(locateElement("xpath","//button[contains(text(),'Find Leads')]"));
		Thread.sleep(2000);
		
		String Leadid = getText(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		//driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		//driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		click(locateElement("xpath","//a[@class='subMenuButtonDangerous']"));
		//driver.findElementByLinkText("Find Leads").click();
		click(locateElement("linkText","Find Leads"));
		
		//driver.findElementByXPath("//label[contains(text(),'Lead ID')]/following::input").sendKeys(Leadid);
		type(locateElement("xpath","//label[contains(text(),'Lead ID')]/following::input"),Leadid);
		//driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		click(locateElement("xpath","//button[contains(text(),'Find Leads')]"));
		Thread.sleep(2000);
		//String error = "No records to display";
		//if(driver.findElementByXPath("//div[contains(text(),'No records to display')]").getText().equals(error))			
		//System.out.println("Success");
		
		verifyExactText(locateElement("xpath","//div[contains(text(),'No records to display')]"),"No records to display");
		//driver.close();
		
	}
	}
