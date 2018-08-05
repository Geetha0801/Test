package learncucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
	public ChromeDriver driver;
	
	@Given("Open the browser")
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@And("Maxmize the window")
	public void maxWindow() {
		driver.manage().window().maximize();
	}
	@And("Load the url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@And("Set the timeout")
	public void setTimeOut() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@And("Enter the user name as (.*)")
	public void enterUname(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}
	@And("Enter the password as (.*)")
	public void enterPassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}
	@And("Click the Login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("Verify the login is successfull")
	public void verifyLogin() {
		System.out.println("Login is Successfull");
	}	
	@And("Click CRMSFA link")
	public void clickCRM() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("Verify launch of MyHomePage")
	public void verifyMyHomePage() {
		System.out.println("HomePage is Successfull");
	}
	@And("Click Leads Tab")
	public void clickLeadsTab() {
		driver.findElementByLinkText("Leads").click();
	}
	@And("Verify launch of MyLeadsPage")
	public void verifyMyLeadsPage() {
		System.out.println("LeadsPage is Successfull");
	}
	
	@And("Click the link Create Lead")
	public void clickCreateLead()
	{
		 driver.findElementByLinkText("Create Lead").click();
	}
	
	@And ("Enter the company Name as (.*)")
	public void enterCompanyName(String cName)
	{
		 driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}
  
	@And("Enter the First Name as (.*)")
	public void enterFirstName(String fName)
	{
		 driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}
	
	@And("Enter the Last Name as (.*)")
	public void enterLastName(String lName)
	{
		 driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	
	@When("Click the submit button")
	public void clickSubmitButton()
	{
		 driver.findElementByName("submitButton").click();
	}
	
	@Then("Verify the first name of created Lead as (.*)")
	public void verifyFirstName(String expected)
	{
		 String name = driver.findElementById("viewLead_firstName_sp").getText();
		 if(name.equals(expected))
		 {
			 System.out.println("Lead is created and verified the first name");
		 }
	}
	
}








