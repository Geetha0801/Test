package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotations;

public class TC_003DeleteLead extends Annotations {

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
	public void deleteLead(String phone,String ID) throws Exception
	{
		new MyHomePage()
		.clickLeads()
		.clickFindLeads()
		.clickPhone()
		.typePhone(phone)
		.clickFindLeadsButton()
		.getFirstLeadId()
		.clickLeadId()
		.clickDelete()
		.clickFindLeads()
		.typeLeadId(ID)
		.clickFindLeadsButton()
		.verifyResultingLead("No records to display");
		
		
		
	}
}
