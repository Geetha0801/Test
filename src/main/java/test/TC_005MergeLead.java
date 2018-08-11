package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotations;

public class TC_005MergeLead extends Annotations {

	@BeforeTest
	 public void setValues()
	 {
		 excelFName = "MergeLead";
		 testName = "Merge Lead";
		 testDesc = "Merging a Lead";
		 category = "sanity";
		 author = "geetha";
		 moduleName = "Leads";
		 
	 }
	@Test(dataProvider="fetchData")
	public void mergeLead(String sID,String dID) throws Exception
	{
		new MyHomePage()
		.clickLeads()
		.clickMergeLead()
		.clickFromLead()
		.switchWindow(1)
		.timeOut()
		.typeLeadID(sID)
		.clickFindButton()
		.timeOut()
		.clickFirstLeadId()
		.timeOut()
		.switchMWindow(0)
		//.timeOut()		
		.clickToLead()
		.switchWindow(1)
		.timeOut()
		.typeLeadID(dID)
		.clickFindButton()
		.timeOut()
		.clickFirstLeadId()
		.timeOut()
		.switchMWindow(0)
		//.timeOut()
		.clickMerge()
		.actAlert()
		//.timeOut()
		.clickFindLeads()
		.timeOut()
		.typeLeadId(sID)
		.timeOut()
		.clickFindLeadsButton()
		.timeOut()
		.verifyResultingLeadMsg("No records to display");
		
				
		
		
		
	}
}
