package pagesimplementation;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.Annotations;
import wdMethods.SeMethods;

public class MyLeadsPage  extends SeMethods{
	
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
	
	
	@And("Click Merge Lead")
	public MergeLeadPage typeMergeTab()
	{
		clickNoSnap(eleMergeLead);
		return new MergeLeadPage();
		
	}
	
	@And("Click Create Lead")
	public CreateLeadPage clickCreateLeads() {
		clickNoSnap(eleLeads);
		return new CreateLeadPage();
	}
	
	public MergeLeadPage clickMergeLead() {
		clickNoSnap(eleMergeLead);
		return new MergeLeadPage();
	}
	
	@And("Click Find Leads")
	public FindLeadPage clickFindLeads() {
		clickNoSnap(eleFindLeads);
		return new FindLeadPage();
	}
	
	
}
