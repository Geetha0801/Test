package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	

	public MergeLeadPage clickFromLead()
	{
		clickNoSnap(eleFromLead);
		return new MergeLeadPage();
		
	}
	
	public MergeLeadPage clickToLead()
	{
		clickNoSnap(eleToLead);
		
		return new MergeLeadPage();
		
	}
	
	public MergeFindLeadPage switchWindow(int index)
	{
		switchToWindow(index);
		return new MergeFindLeadPage();
	}
	
	public MergeLeadPage switchMWindow(int index)
	{
		switchToWindow(index);
		return this;
	}
	
	
	public MergeLeadPage timeOut() throws Exception
	{
		timeOuts();
		return this;
	}
	
	public MergeLeadPage clickMerge()
	{
		clickNoSnap(eleMergeButton);
		return this;
	}
	
	public ViewLeadPage actAlert()
	{
		acceptAlert();
		return new ViewLeadPage();
	}
}
	

