package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotations;

public class TC_001CreateLead extends Annotations {

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
	public void createLead(String cName,String fName,String lName,String pNum,String email )
	{
		new MyHomePage()
		.clickLeads()
		.clickCreateLeads()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.typePhoneNum(pNum)
		.typeEmail(email)
		.clickSubmit()
		.verifyFirstName(fName);
	}
}
