package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class FindLeadPage extends Annotations {
	
	public FindLeadPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[contains(text(),'Lead ID')]/following::input[2]")
	WebElement eleFirstName;
	
	@FindBy(xpath = "//button[contains(text(),'Find Leads')]")
	WebElement eleFindLead;
	
	@FindBy(xpath = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleLeadId;
	
	@FindBy(xpath = "//input[@name='phoneNumber']")
	WebElement elePhone;
	
	@FindBy(xpath = "//span[contains(text(),'Phone')]")
	WebElement elePhoneTab;
	
	@FindBy(xpath = "//span[contains(text(),'Email')]")
	WebElement eleEmailTab;
	
	@FindBy(xpath = "//input[@name='emailAddress']")
	WebElement eleEmail;
	
	@FindBy(name ="id")
	WebElement eleLId;
	
	@FindBy(xpath ="//div[@class='x-grid3-cell-inner x-grid3-col-firstName']")
	WebElement eleLFName;
	
	public FindLeadPage typeFirstName(String fName)
	{
		type(eleFirstName,fName);
		return this;
	}
	
	public FindLeadPage clickPhone()
	{
		clickNoSnap(elePhoneTab);
		return this;
	}
	
	public FindLeadPage clickEmail()
	{
		clickNoSnap(eleEmailTab);
		return this;
	}
	
	public FindLeadPage typePhone(String phone)
	{
		type(elePhone,phone);
		return this;
	}
	
	public FindLeadPage typeEmail(String email)
	{
		type(eleEmail,email);
		return this;
	}
	
	public FindLeadPage clickFindLeadsButton()
	{
		clickNoSnap(eleFindLead);
		return this;
	}
	
	public FindLeadPage getFirstLeadId()
	{
		leadId = getText(eleLeadId);
		return this;
	}
	
	public FindLeadPage getFirstLeadFirstName()
	{
		leadFName = getText(eleLFName);
		return this;
	}
	
	public FindLeadPage getFirstLeadName()
	{
		leadId = getText(eleLeadId);
		return this;
	}
	
	public FindLeadPage typeLeadId(String sID)
	{
		type(eleLId,sID);
		return this;
	}
	
	public FindLeadPage timeOut() throws Exception
	{
		timeOuts();
		return this;
	}
	
	public ViewLeadPage clickLeadId()
	{
		clickNoSnap(eleLeadId);
		return new ViewLeadPage();
	}
	
	public FindLeadPage verifyResultingLead(String result)
	{
		verifyExactText(eleFirstName,result);
		return this;
	}
	}
	

