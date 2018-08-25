package pagesimplementation;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.Annotations;
import wdMethods.SeMethods;

public class ViewLeadPage  extends SeMethods{
	
	public ViewLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="viewLead_firstName_sp")
	 WebElement eleFirstName;
	
	
	@FindBy(id="viewLead_companyName_sp")
	 WebElement eleCompanyName;
	
	@FindBy(xpath = "//a[@class='subMenuButtonDangerous']")
	 WebElement eleDeleteButton;
	
	@FindBy(xpath = "//a[contains(text(),'Duplicate Lead')]")
	 WebElement eleDuplicateButton;
	
	@FindBy(xpath = "//a[contains(text(),'Edit')]")
	 WebElement eleEditButton;
	
	@FindBy(linkText = "Find Leads")
	 WebElement eleFindLeadsButton;
	 
	@Then("Verify first name of created Lead as (.*)")	
	public ViewLeadPage verifyFirstName(String expected) {
		verifyExactText(eleFirstName,expected);
		return this;
	}
	@Then("Confirm the changed name as (.*)")
	public ViewLeadPage verifyCompanyName(String cName) {
		verifyPartialText(eleCompanyName,cName);
		return this;
	}
	@And("Click Delete button")
	public MyLeadsPage clickDelete() {
		clickNoSnap(eleDeleteButton);
		return new MyLeadsPage();
	}
	@When("Click Duplicate Leads button")
	public DuplicateLeadPage clickDuplicate() {
		clickNoSnap(eleDuplicateButton);
		return new DuplicateLeadPage();
	}
	@And("Click Edit button")
	public EditLeadPage clickEdit() {
		clickNoSnap(eleEditButton);
		return new EditLeadPage();
	}
	@And("Click Find Leads tab")
	public FindLeadPage clickFindLeads() {
		clickNoSnap(eleFindLeadsButton);
		return new FindLeadPage();
	}

}


