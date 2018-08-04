package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MyLeadsPage  extends Annotations{
	
	public MyLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create Lead")
	 WebElement eleLeads;
	 
	@FindBy(linkText="Find Leads")
	 WebElement eleFindLeads;
	
	@FindBy(linkText = "Merge Leads")
	WebElement eleMergeLead;
	
	
	
	public MergeLeadPage typeMergeTab()
	{
		clickNoSnap(eleMergeLead);
		return new MergeLeadPage();
		
	}
	
	public CreateLeadPage clickCreateLeads() {
		clickNoSnap(eleLeads);
		return new CreateLeadPage();
	}
	
	public MergeLeadPage clickMergeLead() {
		clickNoSnap(eleMergeLead);
		return new MergeLeadPage();
	}
	

	public FindLeadPage clickFindLeads() {
		clickNoSnap(eleFindLeads);
		return new FindLeadPage();
	}
	
	
}
