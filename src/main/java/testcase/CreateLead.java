package testcase;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;
import week6.day1.ReadExcel;

public class CreateLead extends Annotations {
	
	 @BeforeTest
	 public void setValues()
	 {
		 excelFName = "CreateLead";
		 testName = "Create Lead";
		 testDesc = "Create a Lead";
		 category = "sanity";
		 author = "geetha";
		 moduleName = "Leads";
		 
	 }
	@Test(dataProvider="fetchData")
	//@Test(invocationCount=2)
	//@Test
	public void createLead(String cName,String fName,String lName,String pNum ) throws InterruptedException {
		//Thread.sleep(3000);
		
		WebElement eleCreateLead = locateElement("linkText","Create Lead");
		click(eleCreateLead);
		WebElement eleCompanyName = locateElement("createLeadForm_companyName");
		type(eleCompanyName, cName);
		WebElement eleFirstName = locateElement("createLeadForm_firstName");
		type(eleFirstName, fName);
		WebElement eleSurName = locateElement("createLeadForm_lastName");
		type(eleSurName, lName);
		/*type(locateElement("createLeadForm_firstNameLocal"),"Geetha");
		type(locateElement("createLeadForm_lastNameLocal"),"Subramaniam");
		type(locateElement("createLeadForm_personalTitle"),"Mrs");
		WebElement eleSource = locateElement("createLeadForm_dataSourceId");
		selectDropDownUsingText(eleSource,"Conference");
		type(locateElement("createLeadForm_annualRevenue"),"300000");
		selectDropDownUsingIndex(locateElement("createLeadForm_industryEnumId"),1);
		selectDropDownUsingText(locateElement("createLeadForm_ownershipEnumId"),"Partnership");
		type(locateElement("createLeadForm_sicCode"),"234");
		type(locateElement("createLeadForm_description"),"Creating lead");
		type(locateElement("createLeadForm_importantNote"),"Important note");
		clear(locateElement("createLeadForm_primaryPhoneCountryCode"));
		type(locateElement("createLeadForm_primaryPhoneCountryCode"),"0");
		//driver.findElementByName("primaryPhoneCountryCode").sendKeys("0");
		//driver.findElementByName("primaryPhoneAreaCode").sendKeys("91");
		type(locateElement("createLeadForm_primaryPhoneAreaCode"),"91");
		//driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("65785");
		type(locateElement("createLeadForm_primaryPhoneExtension"),"65785");
		//driver.findElementById("createLeadForm_departmentName").sendKeys("CSE");
		type(locateElement("createLeadForm_departmentName"),"CSE");
		//driver.findElementByName("primaryPhoneCountryCode").clear();
		clear(locateElement("createLeadForm_primaryPhoneCountryCode"));
		//Select currency = new Select(driver.findElementById("createLeadForm_currencyUomId"));
		//currency.selectByVisibleText("AED - United Arab Emirates Dirham");
		selectDropDownUsingText(locateElement("createLeadForm_currencyUomId"),"AED - United Arab Emirates Dirham");
		//driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		type(locateElement("createLeadForm_numberEmployees"),"100");
		//driver.findElementById("createLeadForm_tickerSymbol").sendKeys("ACC");
		type(locateElement("createLeadForm_tickerSymbol"),"ACC");
		//driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Geetha");
		type(locateElement("createLeadForm_primaryPhoneAskForName"),"Geetha");
		//driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.accenture.com");
		type(locateElement("createLeadForm_primaryWebUrl"),"www.accenture.com");
		//driver.findElementById("createLeadForm_generalToName").sendKeys("Geetha");
		type(locateElement("createLeadForm_generalToName"),"Geetha");
		//driver.findElementById("createLeadForm_generalAddress1").sendKeys("162, Meenkarai Raod");
		type(locateElement("createLeadForm_generalAddress1"),"162, Meenkarai Road");
		//driver.findElementById("createLeadForm_generalAddress2").sendKeys("Pollachi");
		type(locateElement("createLeadForm_generalAddress2"),"Pollachi");
		//driver.findElementById("createLeadForm_generalCity").sendKeys("Coimbatore");
		type(locateElement("createLeadForm_generalCity"),"Coimbatore");
		//Select country = new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
		//country.selectByVisibleText("India");
		selectDropDownUsingText(locateElement("createLeadForm_generalCountryGeoId"),"India");
		Thread.sleep(2000);
		//Select state = new Select(driver.findElementById("createLeadForm_generalStateProvinceGeoId"));
		//state.selectByVisibleText("TAMILNADU");
		selectDropDownUsingText(locateElement("createLeadForm_generalStateProvinceGeoId"),"TAMILNADU");
		//driver.findElementById("createLeadForm_generalPostalCode").sendKeys("642004");
		type(locateElement("createLeadForm_generalPostalCode"),"642004");
		//driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("642");
		type(locateElement("createLeadForm_generalPostalCodeExt"),"642");
		//Select mc = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		//mc.selectByVisibleText("Automobile");
		selectDropDownUsingText(locateElement("createLeadForm_marketingCampaignId"),"Automobile");
		//driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("8526797571");*/
		type(locateElement("createLeadForm_primaryPhoneNumber"),pNum);
		//driver.findElementById("createLeadForm_primaryEmail").sendKeys("gitaa0801@gmail.com");
		type(locateElement("createLeadForm_primaryEmail"),"gitaa0801@gmail.com");
		//driver.findElementByName("submitButton").click();
		WebElement eleButton = locateElement("name","submitButton");
		click(eleButton);
		//System.out.println(driver.findElementById("viewLead_firstName_sp").getText());
		//if(verifyExactText(locateElement(("viewLead_firstName_sp"),"Geetha") == true)
			
		verifyExactText(locateElement("viewLead_firstName_sp"), "Geetha");		
		
	}
	
	
}


