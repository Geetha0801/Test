package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class CreateLeadPage  extends Annotations{
	
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
	
	public CreateLeadPage typeCompanyName(String cName)
	{
		type(elecName,cName);
		return this;
	}
	
	public CreateLeadPage typeFirstName(String fName)
	{
		type(elefName,fName);
		return this;
	}
	
	public CreateLeadPage typeLastName(String lName)
	{
		type(elelName,lName);
		return this;
	}
	
	public CreateLeadPage typePhoneNum(String pNum)
	{
		type(elePnum,pNum);
		return this;
	}
	
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
	public ViewLeadPage clickSubmit() {
		clickNoSnap(eleSubmit);
		return new ViewLeadPage();
	}

}
