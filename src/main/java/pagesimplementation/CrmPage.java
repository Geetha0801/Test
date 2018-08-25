package pagesimplementation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.Annotations;
import wdMethods.SeMethods;

public class CrmPage extends SeMethods{
	
	public CrmPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="CRM/SFA")
	 WebElement eleCRM;
	
	@And("Click CRMSFA")
	public MyHomePage clickCRM()
	{
		clickNoSnap(eleCRM);
		return new MyHomePage();
	}

}
