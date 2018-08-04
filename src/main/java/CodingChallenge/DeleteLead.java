package CodingChallenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Testleaf\\drivers\\chromedriver.exe");
		    //ChromeOptions op = new ChromeOptions();
		    //op.setHeadless(true);
			ChromeDriver driver = new ChromeDriver();		
			driver.get("http://leaftaps.com/opentaps/");
			driver.findElementById("username").sendKeys("DemoSalesManager");
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByLinkText("CRM/SFA").click();
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Find Leads").click();
			//driver.findElementByXPath("//label[contains(text(),'Lead ID')]/following::input[2]").sendKeys("Geetha");
			//driver.findElementByClassName("x-btn-text").click();
			driver.findElementByXPath("//span[contains(text(),'Phone')]").click();
			//driver.findElementByXPath("//input[@class=' x-form-text x-form-field '][1]").sendKeys("0");
			//driver.findElementByXPath("//input[@class=' x-form-text x-form-field '][2]").sendKeys("91");
			driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("453453455");
			driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
			Thread.sleep(2000);
			String Leadid = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
			driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
			driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
			driver.findElementByLinkText("Find Leads").click();
			driver.findElementByXPath("//label[contains(text(),'Lead ID')]/following::input").sendKeys(Leadid);
			driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
			Thread.sleep(2000);
			String error = "No records to display";
			if(driver.findElementByXPath("//div[contains(text(),'No records to display')]").getText().equals(error))			
			System.out.println("Success");
			//driver.close();

	}

}

