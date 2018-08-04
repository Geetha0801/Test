package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import wdMethods.Annotations;

public class DuplicateLeadPage  extends Annotations{
	
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
	
	public DuplicateLeadPage timeOut() throws Exception
	{
		timeOuts();
		return this;
	}
	
	public DuplicateLeadPage verifyForeName(String expected) {
		verifyExactText(eleForeName,expected);
		return this;
	}

	public  DuplicateLeadPage verifyLeadTitle(String expected) {
		verifyTitle(expected);
		return this;
	}

}


