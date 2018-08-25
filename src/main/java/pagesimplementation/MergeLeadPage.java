package pagesimplementation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.Annotations;

public class MergeLeadPage extends Annotations {
	
	public MergeLeadPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath = "//input[@id='partyIdFrom']/following::a[1]")
	WebElement eleFromLead;	
	
	@FindBy (xpath = "//input[@id='partyIdTo']/following::a[1]")
	WebElement eleToLead;	
	
	@FindBy (linkText = "Merge")
	WebElement eleMergeButton;
	
	
	@And("Click from icon")
	public MergeLeadPage clickFromLead()
	{
		clickNoSnap(eleFromLead);
		return this;
		
	}
	@And("Click to icon")
	public MergeLeadPage clickToLead()
	{
		clickNoSnap(eleToLead);
		
		return new MergeLeadPage();
		
	}
	@And("Switch Window (//d+)")
	public MergeFindLeadPage switchWindow(int index)
	{
		//int ind = Integer.parseInt(index);
		switchToWindow(index);
		return new MergeFindLeadPage();
	}
	//@And("Switch to Parent Window as (.*)")
	@And("Switch to Parent Window (//d+)")
	public MergeLeadPage switchMWindow(int index)
	{
		
		switchToWindow(index);
		return this;
	}
	
	@And("Hold") 
	public MergeLeadPage timeOut() throws Exception
	{
		timeOuts();
		return this;
	}
	@When("Click Merge")
	public MergeLeadPage clickMerge()
	{
		clickNoSnap(eleMergeButton);
		return this;
	}
	@And("Accept Alert")
	public ViewLeadPage actAlert()
	{
		acceptAlert();
		return new ViewLeadPage();
	}
}
	

