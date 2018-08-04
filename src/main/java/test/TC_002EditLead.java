package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotations;

public class TC_002EditLead extends Annotations {

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
	public void editLead(String fName) throws Exception
	{
		new MyHomePage()
		.clickLeads()
		.clickFindLeads()
		.typeFirstName(fName)
		.clickFindLeadsButton()
		.timeOut()
		.clickLeadId()
		.verifyFirstName(fName);
	}
}
