package projectphaseone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//timeout
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Get url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Login
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		//Click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
		//Click Create Contact
		driver.findElementByLinkText("Create Contact").click();
		//Enter First Name
		driver.findElementById("firstNameField").sendKeys("Poomathi");
		//Enter Last Name
		driver.findElementById("lastNameField").sendKeys("Rajan");
		//Enter firstNameLocal
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Mathi");
		//Enter lastNameLocal
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("Rajan");
		//Enter Salutation
		driver.findElementById("createContactForm_personalTitle").sendKeys("Ms");
		//Enter Title
		driver.findElementById("createContactForm_generalProfTitle").sendKeys("Ms");
		//Enter Department
		driver.findElementById("createContactForm_departmentName").sendKeys("CSE");
		//Choose Preferred Currency
		Select currency = new Select(driver.findElementById("createContactForm_preferredCurrencyUomId"));
		currency.selectByVisibleText("ALL - Albanian Lek");
		//Enter Description
		driver.findElementById("createContactForm_description").sendKeys("Contact creation");
		//Enter Important Note
		driver.findElementById("createContactForm_importantNote").sendKeys("Contact creation");
		//Enter Area Code
		driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("044");
		//Enter Extension
		driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("91");
		//Enter E-Mail Address
		driver.findElementById("createContactForm_primaryEmail").sendKeys("mathi@gmail.com");
		//Enter Phone Number
		driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("8526797571");
		//Enter Person to Ask For
		driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("Mathi");
		//capture name Appers in To Name field 
		String text = driver.findElementById("generalToNameField").getAttribute("value");
		System.out.println(text);
		//Enter the Address Line 1
		driver.findElementById("createContactForm_generalAddress1").sendKeys("162,Meenkarai road");
		//Enter the City name
		driver.findElementById("createContactForm_generalCity").sendKeys("Coimbatore");
		//Enter Zip/Postal Code
		driver.findElementById("createContactForm_generalPostalCode").sendKeys("642004");
		//Enter Zip/Postal Code Extension
		driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("004");
		//Enter Attention Name
		driver.findElementById("createContactForm_generalAttnName").sendKeys("Guru");	
		//Enter Address Line 2 (optional)
		driver.findElementById("createContactForm_generalAddress2").sendKeys("Nanjegoundenpudur");
		//Choose Country
		Select country = new Select(driver.findElementById("createContactForm_generalCountryGeoId"));
		country.selectByValue("IND");
		//timeout
		Thread.sleep(3000);
		//Choose State/Province
		Select state = new Select(driver.findElementById("createContactForm_generalStateProvinceGeoId"));
		state.selectByValue("IN-TN");
		//Click Create Contact button
		driver.findElementByName("submitButton").click();
		//Verify the First name appears with capture name in To Field
		String firstName = driver.findElementById("viewContact_firstName_sp").getText();
		if(text.contains(firstName))
		{
			System.out.println("Captured name is matched");
		
	    }
		else
		{
			System.out.println("Captured name is not matched");
		}
		//click edit
		driver.findElementByLinkText("Edit").click();
		//choose New Marketing Campaign
		Select campaign = new Select(driver.findElementById("addMarketingCampaignForm_marketingCampaignId"));
		campaign.selectByIndex(2);		
		//click add
		driver.findElementByXPath("//input[@value='Add']").click();
		Thread.sleep(3000);
		String mcamp = driver.findElementByXPath("//table[@class='crmsfaListTable']//tr[2]//td[1]/a").getText();
		System.out.println("App Text :"+mcamp);
		//click update button
		driver.findElementByXPath("//input[@value='Update']").click();
		//Confirm the choosen Marketing Campaigns appears
		Thread.sleep(5000);
		
		if(mcamp.equals("Car and Driver (CATRQ_CARNDRIVER)"))
		{
			System.out.println("Choosen Marketing Campaigns appears");
		}
		else
		{
			System.out.println("Choosen Marketing Campaigns doesn't appear");
		}
		
	}	
		
}
