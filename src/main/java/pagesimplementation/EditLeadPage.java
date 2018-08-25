package pagesimplementation;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.Annotations;
import wdMethods.SeMethods;

public class EditLeadPage  extends SeMethods{
	
	public EditLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="updateLeadForm_companyName")
	 WebElement elecName;
	@FindBy(className="smallSubmit")
	 WebElement eleUpdate;
//	public DuplicateLeadPage verifyLeadTitle(String expected) {
//		verifyTitle(expected);
//		return this;
//	}
	@And("Clear company name")
	public EditLeadPage clearCName()
	{
		clear(elecName);
		return this;
	}
	@And("Change the Company name as (.*)")
	public EditLeadPage changeCName(String cName) {
		type(elecName,cName);
		return this;
	}
	@When("Click update")
	public  ViewLeadPage clickUpdate() {
		clickNoSnap(eleUpdate);
		return new ViewLeadPage();
	}

}


