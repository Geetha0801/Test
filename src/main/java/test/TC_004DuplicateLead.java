package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotations;

public class TC_004DuplicateLead extends Annotations {

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
	public void duplicateLead(String email,String fname) throws Exception
	{
		new MyHomePage()
		.clickLeads()
		.clickFindLeads()
		.clickEmail()
		.typeEmail(email)
		.clickFindLeadsButton()
		.timeOut()
		.getFirstLeadFirstName()
		.clickLeadId()
		.clickDuplicate()		
		.verifyLeadTitle("Duplicate Lead")
		.timeOut()
		.verifyForeName(fname);
		
		
		
		
		
		
	}
}
