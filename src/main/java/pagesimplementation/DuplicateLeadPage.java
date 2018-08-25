package pagesimplementation;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import cucumber.api.java.en.Then;
import wdMethods.Annotations;
import wdMethods.SeMethods;

public class DuplicateLeadPage  extends SeMethods{
	
	public DuplicateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_firstName")
	 WebElement eleForeName;
	
	
//	public DuplicateLeadPage verifyLeadTitle(String expected) {
//		verifyTitle(expected);
//		return this;
//	}
	@Then("Wait")
	public DuplicateLeadPage timeOut() throws Exception
	{
		timeOuts();
		return this;
	}
	@Then("Verify Forename as (.*)")
	public DuplicateLeadPage verifyForeName(String expected) {
		verifyExactAttribute(eleForeName,"Value",expected);
		return this;
	}
	@Then("Verify Lead Title as (.*)")
	public  DuplicateLeadPage verifyLeadTitle(String expected) {
		verifyTitle(expected);
		return this;
	}

}


