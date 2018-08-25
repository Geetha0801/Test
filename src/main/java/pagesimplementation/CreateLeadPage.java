package pagesimplementation;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.Annotations;
import wdMethods.SeMethods;

public class CreateLeadPage  extends SeMethods{
	
	public CreateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_companyName")
	 WebElement elecName;
	 
	@FindBy(id="createLeadForm_firstName")
	 WebElement elefName;
	
	@FindBy(id="createLeadForm_lastName")
	 WebElement elelName;
	
	@FindBy(id="createLeadForm_primaryPhoneNumber")
	 WebElement elePnum;
	
	@FindBy(id="createLeadForm_primaryEmail")
	 WebElement eleEmail;
	
	@FindBy(name="submitButton")
	 WebElement eleSubmit;
	

	@FindBy(className="errorList")
	 WebElement eleErrorMsg;
	
	@And("Enter company Name as (.*)")
	public CreateLeadPage typeCompanyName(String cName)
	{
		type(elecName,cName);
		return this;
	}
	
	@And("Enter First Name as (.*)")
	public CreateLeadPage typeFirstName(String fName)
	{
		type(elefName,fName);
		return this;
	}
	
	@And("Enter Last Name as (.*)")
	public CreateLeadPage typeLastName(String lName)
	{
		type(elelName,lName);
		return this;
	}
	
	@And("Enter the phone number as (.*)")
	public CreateLeadPage typePhoneNum(String pNum)
	{
		type(elePnum,pNum);
		return this;
	}
	
	@And("Enter the email as (.*)")
	public CreateLeadPage typeEmail(String email)
	{
		type(eleEmail,email);
		return this;
	}
	
	public CreateLeadPage clickSubmitFailure(String expected)
	{
		clickNoSnap(eleSubmit);
		verifyPartialText(eleErrorMsg, expected);
		return this;
	}
	
	@When("Click submit button")
	public ViewLeadPage clickSubmit() {
		clickNoSnap(eleSubmit);
		return new ViewLeadPage();
	}

}
