package CodingChallenge;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException, IOException {

		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Testleaf\\drivers\\chromedriver.exe");
	    //ChromeOptions op = new ChromeOptions();
	    //op.setHeadless(true);
	   //@BeforeSuite
	   ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
	   html.setAppendExisting(true);
	   ExtentReports extent = new ExtentReports();
	   extent.attachReporter(html);
	   
	   //@BeforeTest
	   String tCName = "TC001";
	   String tCDesc = "Create a new Lead in leaftap";
	   
	   //@BeforeClass
	   ExtentTest suiteTest = extent.createTest(tCName,tCDesc);
	   
	   //@BeforeMethod
	   ExtentTest test = suiteTest.createNode("Leads");
	   
	   
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://leaftaps.com/opentaps/");
		test.pass("Browser launched successfully", 
				MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		//test.pass("Browser launched successfully", 
			//	MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png"));
//		driver.findElementById("username").sendKeys("DemoSalesManager");
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("crmsfa");
//		driver.findElementByClassName("decorativeSubmit").click();
//		driver.findElementByLinkText("CRM/SFA").click();
//		driver.findElementByLinkText("Create Lead").click();
//		//driver.findElementByLinkText("Find Leads").click();
//		driver.findElementById("createLeadForm_companyName").sendKeys("Accenture");
//		driver.findElementById("createLeadForm_firstName").sendKeys("Geetha");
//		driver.findElementById("createLeadForm_lastName").sendKeys("Subramanian");
//		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Geetha");
//		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Subramanian");
//		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mrs");
//		Select source = new Select(driver.findElementById("createLeadForm_dataSourceId"));
//		source.selectByVisibleText("Conference");
//		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mrs");
//		driver.findElementById("createLeadForm_annualRevenue").sendKeys("300000");		
//		Select industry = new Select(driver.findElementById("createLeadForm_industryEnumId"));
//		industry.selectByVisibleText("Computer Software");
//		Select owner = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
//		owner.selectByVisibleText("Partnership");
//		driver.findElementById("createLeadForm_sicCode").sendKeys("234");
//		driver.findElementById("createLeadForm_description").sendKeys("Creating lead");
//		driver.findElementById("createLeadForm_importantNote").sendKeys("Important note");
//		driver.findElementByName("primaryPhoneCountryCode").clear();
//		driver.findElementByName("primaryPhoneCountryCode").sendKeys("0");
//		driver.findElementByName("primaryPhoneAreaCode").sendKeys("91");
//		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("65785");
//		driver.findElementById("createLeadForm_departmentName").sendKeys("CSE");
//		driver.findElementByName("primaryPhoneCountryCode").clear();
//		Select currency = new Select(driver.findElementById("createLeadForm_currencyUomId"));
//		currency.selectByVisibleText("AED - United Arab Emirates Dirham");
//		driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
//		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("ACC");
//		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Geetha");
//		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.accenture.com");
//		driver.findElementById("createLeadForm_generalToName").sendKeys("Geetha");
//		driver.findElementById("createLeadForm_generalAddress1").sendKeys("162, Meenkarai Raod");
//		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Pollachi");
//		driver.findElementById("createLeadForm_generalCity").sendKeys("Coimbatore");		
//		Select country = new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
//		country.selectByVisibleText("India");
//		Thread.sleep(2000);
//		Select state = new Select(driver.findElementById("createLeadForm_generalStateProvinceGeoId"));
//		state.selectByVisibleText("TAMILNADU");
//		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("642004");
//		//Thread.sleep(2000);
//		//driver.findElementById("createLeadForm_generalCity").sendKeys("Coimbatore");
//		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("642");
//		Select mc = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
//		mc.selectByVisibleText("Automobile");
//		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("8526797571");
//		driver.findElementById("createLeadForm_primaryEmail").sendKeys("gitaa0801@gmail.com");
//		driver.findElementByName("submitButton").click();
//		System.out.println(driver.findElementById("viewLead_firstName_sp").getText());
	   extent.flush();
	}

}
