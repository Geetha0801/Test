package pagesimplementation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.Annotations;
import wdMethods.SeMethods;

public class FindLeadPage extends SeMethods {
	
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
	
	@FindBy(className ="x-paging-info")
	WebElement eleMTxt;
	
	@And("Enter the First Name as (.*)")
	public FindLeadPage typeFirstName(String fName)
	{
		type(eleFirstName,fName);
		return this;
	}
	
	@And("Click Phone Tab") 
	public FindLeadPage clickPhone()
	{
		clickNoSnap(elePhoneTab);
		return this;
	}
	@And("Click Email Tab") 
	public FindLeadPage clickEmail()
	{
		clickNoSnap(eleEmailTab);
		return this;
	}
	
	@And("Enter Phone Number as (.*)")
	public FindLeadPage typePhone(String phone)
	{
		type(elePhone,phone);
		return this;
	}
	@And("Enter Email as (.*)")
	public FindLeadPage typeEmail(String email)
	{
		type(eleEmail,email);
		return this;
	}
	
	@And("Click on Find Leads Button") 
	public FindLeadPage clickFindLeadsButton()
	{
		clickNoSnap(eleFindLead);
		return this;
	}
	
	 @And("Get first resulting lead id")
	public FindLeadPage getFirstLeadId()
	{
		leadId = getText(eleLeadId);
		return this;
	}
	@And("Get first resulting lead first name") 
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
	
	@And("Enter the Lead ID as (.*)")   
	public FindLeadPage typeLeadId(String sID)
	{
		type(eleLId,sID);
		return this;
	}
	
	@And("Wait for result")
	public FindLeadPage timeOut() throws Exception
	{
		timeOuts();
		return this;
	}
	@And("Click on resulting first Lead")
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
	@Then("Verify the resulting Lead as (.*)") 
	public FindLeadPage verifyResultingLeadMsg(String result)
	{
		verifyExactText(eleMTxt,result);
		return this;
	}
	}
	

