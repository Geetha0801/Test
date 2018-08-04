package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class ViewLeadPage  extends Annotations{
	
	public ViewLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="viewLead_firstName_sp")
	 WebElement eleFirstName;
	
	@FindBy(xpath = "//a[@class='subMenuButtonDangerous']")
	 WebElement eleDeleteButton;
	
	@FindBy(xpath = "//a[contains(text(),'Duplicate Lead')]")
	 WebElement eleDuplicateButton;
	
	@FindBy(linkText = "Find Leads")
	 WebElement eleFindLeadsButton;
	 
	public ViewLeadPage verifyFirstName(String expected) {
		verifyExactText(eleFirstName,expected);
		return this;
	}

	public MyLeadsPage clickDelete() {
		clickNoSnap(eleDeleteButton);
		return new MyLeadsPage();
	}
	
	public DuplicateLeadPage clickDuplicate() {
		clickNoSnap(eleDuplicateButton);
		return new DuplicateLeadPage();
	}
	
	public FindLeadPage clickFindLeads() {
		clickNoSnap(eleFindLeadsButton);
		return new FindLeadPage();
	}

}


