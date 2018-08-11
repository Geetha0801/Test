package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MergeFindLeadPage  extends Annotations{
	
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
	
	@FindBy (xpath = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleFirstLeadId;
	
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
	
	public MergeFindLeadPage clickFindButton()
	{
		clickNoSnap(eleFindLeadBtn);
		return this;
	}
	
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
	
	public MergeFindLeadPage timeOut() throws Exception
	{
		timeOuts();
		return  this;
	}

}


