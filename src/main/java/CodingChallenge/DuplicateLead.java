package CodingChallenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElementByXPath("//span[contains(text(),'Email')]").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("athirasabu94@gmail.com");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(2000);
		String name = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']").getText();
		System.out.println(name);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByXPath("//a[contains(text(),'Duplicate Lead')]").click();
		if(driver.getTitle().contains("Duplicate Lead"))
		{
			System.out.println("Title Success");
		}
		else
		{
			System.out.println("Title failed");
		}
		Thread.sleep(2000);
		//System.out.println(driver.findElementById("createLeadForm_firstName"));		
		String namecheck = driver.findElementById("createLeadForm_firstName").getAttribute("value");
		System.out.println(namecheck);
		if(namecheck.equals(name))
		{
			System.out.println("name; Success");
		}
		else
		{
			System.out.println("Name : Failed");
			//driver.close();
			
	}

	}
}
