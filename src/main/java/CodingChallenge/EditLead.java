package CodingChallenge;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElementByXPath("//label[contains(text(),'Lead ID')]/following::input[2]").sendKeys("LATHA");
		//driver.findElementByClassName("x-btn-text").click();
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		System.out.println(driver.getTitle().toString());
		driver.findElementByXPath("(//div[contains(text(),'Lead')])[2]/following::a[3]").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Accenture");
		driver.findElementByName("submitButton").click();
		if(driver.findElementById("viewLead_companyName_sp").getText() == "Accenture");
		System.out.println("Success");
		//driver.close();
		
	}

}
