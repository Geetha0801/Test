package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotations;

public class TC_001CreateLead_NEG extends Annotations {

	@BeforeTest
	 public void setValues()
	 {
		 excelFName = "CreateLeadNEG";
		 testName = "Create Lead Negative";
		 testDesc = "Create a Lead";
		 category = "sanity";
		 author = "geetha";
		 moduleName = "Leads";
		 
	 }
	@Test(dataProvider="fetchData")
	public void createLead(String cName,String fName,String lName,String pNum,String email,String errorMsg )
	{
		new MyHomePage()
		.clickLeads()
		.clickCreateLeads()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.typePhoneNum(pNum)
		.typeEmail(email)
		.clickSubmitFailure(errorMsg);
//		.clickSubmit()
//		.verifyFirstName(fName);
	}
}
