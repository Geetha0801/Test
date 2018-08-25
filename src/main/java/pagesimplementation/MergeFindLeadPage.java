package pagesimplementation;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.Annotations;
import wdMethods.SeMethods;

public class MergeFindLeadPage  extends SeMethods{
	
	public MergeFindLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="viewLead_firstName_sp")
	 WebElement eleFirstName;
	
	@FindBy (name ="id")
	WebElement eleLeadID;
	
	@FindBy (xpath = "//td[@class='x-btn-center']")
	WebElement eleFindLeadBtn;
	
	@FindBy (xpath = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")
	WebElement eleFirstLeadId;
	
	@And("Enter Lead Id as (.*)")
	public MergeFindLeadPage typeLeadID(String LeadId) throws InterruptedException
	{
		type(eleLeadID,LeadId);
		Thread.sleep(1000);
		return this;
	}
	
//	public MergeFindLeadPage timeOut() throws Exception
//	{
//		timeOuts();
//		return this;
//	}
	@And("Click Find Button") 
	public MergeFindLeadPage clickFindButton()
	{
		clickNoSnap(eleFindLeadBtn);
		return this;
	}
	@And("Click first Lead Id")  
	public MergeLeadPage clickFirstLeadId() 	{
		clickNoSnap(eleFirstLeadId);
		//Thread.sleep(1000);
		//switchToWindow(0);
		return new MergeLeadPage();
	}
	
//	public MergeLeadPage switchWindow(int index)
//	{
//		switchToWindow(index);
//		return new MergeLeadPage();
//	}
	@And("Wait for window") 
	public MergeFindLeadPage timeOut() throws Exception
	{
		timeOuts();
		return  this;
	}

}


