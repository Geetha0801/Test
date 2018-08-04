package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;

public class MergeLead extends Annotations {
	//@Test(groups = {"regression"})
	
	@BeforeTest
	 public void setValues()
	 {
		 excelFName = "MergeLead";
		 testName = "Merge Lead";
		 testDesc = "Merge a Lead";
		 category = "sanity";
		 author = "geetha";
		 moduleName = "Leads";
		 
	 }
	@Test(dataProvider="fetchData")
	//@Test(enabled=false)
	//@Test(timeOut=20000)
	public void mergeLead(String sId,String dId) throws Exception
	{
		 //Thread.sleep(30000);
		// Locating "CRM/SFA"
//		WebElement eleCrmLink = locateElement("linkText","CRM/SFA");
//		//Clicking the link
//		click(eleCrmLink);
		//Locating and clicking Leads Link
		click(locateElement("linkText","Leads"));
		//Locating and clicking on Merge Leads
		click(locateElement("linkText","Merge Leads"));
		//Locating and Clicking on icon near from lead
		click(locateElement("xpath","//input[@id='partyIdFrom']/following::a[1]"));
		//Moving to new window
		switchToWindow(1);
		//Inside new Window
		//Locating and typing Lead Id
		type(locateElement("name","id"),sId);
		//Locating and clicking Find Leads Button
		click(locateElement("xpath","//td[@class='x-btn-center']"));
		//Locating and clicking  first resulting lead
		clickNoSnap(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		//switch back to primary window
		timeOuts();
		switchToWindow(0);
		//Locating and Clicking on icon near To lead
		clickNoSnap(locateElement("xpath","//input[@id='partyIdTo']/following::a[1]"));
		//Moving to new window
		switchToWindow(1);
		//Inside new Window
		//Locating and typing Lead Id
		type(locateElement("name","id"),dId);
		//Locating and clicking Find Leads Button
		click(locateElement("xpath","//td[@class='x-btn-center']"));
		//Locating and clicking  first resulting lead
		clickNoSnap(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		//switch back to primary window
		switchToWindow(0);
		//click Merge
        clickNoSnap(locateElement("linkText","Merge"));
        //Accept Alert
        acceptAlert();
        //timeout
        timeOuts();
        //click find leads
        click(locateElement("linkText","Find Leads"));
        //Locate and enter from Lead id
        type(locateElement("name","id"),"10087");
        //click Find Leads Button
        click(locateElement("xpath","//button[contains(text(),'Find Leads')]"));
        //verify error message
        verifyExactText(locateElement("xpath","//div[contains(text(),'No records to display')]"),"No records to display");
        //close the browser
       // closeBrowser();
	}
	
}
