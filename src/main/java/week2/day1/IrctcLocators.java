package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Testleaf\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementById("userRegistrationForm:userName").sendKeys("GeethaS");
		driver.findElementById("userRegistrationForm:password").sendKeys("Llewsilla08");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Llewsilla08");
		Select dd = new Select(driver.findElementById("userRegistrationForm:securityQ"));
		dd.selectByVisibleText("Who was your Childhood hero?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Vijay");
		Select dd1 = new Select(driver.findElementById("userRegistrationForm:prelan"));
		dd1.selectByIndex(0);
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Geetha");	
		driver.findElementById("userRegistrationForm:gender:1").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		Select dddate = new Select(driver.findElementById("userRegistrationForm:dobDay"));
		dddate.selectByValue("08");
		Select ddmonth = new Select(driver.findElementById("userRegistrationForm:dobMonth"));
		ddmonth.selectByValue("01");
		Select ddyear = new Select(driver.findElementById("userRegistrationForm:dateOfBirth"));
		ddyear.selectByValue("1992");
		Select ddoccupation = new Select(driver.findElementById("userRegistrationForm:occupation"));
		ddoccupation.selectByValue("2");
		Select ddcountry = new Select(driver.findElementById("userRegistrationForm:countries"));
		ddcountry.selectByValue("94");
		driver.findElementById("userRegistrationForm:email").sendKeys("gitaa0801@gmail.com");	
		driver.findElementById("userRegistrationForm:mobile").sendKeys("8526797571");
		Select ddnation = new Select(driver.findElementById("userRegistrationForm:nationalityId"));
		ddnation.selectByValue("94");
		driver.findElementById("userRegistrationForm:address").sendKeys("162,Meenakarai Road");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("642004");
		//driver.findElementById("userRegistrationForm:statesName").sendKeys("TAMIL NADU",Keys.TAB);
		Thread.sleep(2000);
		Select ddcity = new Select(driver.findElementById("userRegistrationForm:cityName"));
		ddcity.selectByIndex(1);
		Thread.sleep(2000);
		Select ddpo = new Select(driver.findElementById("userRegistrationForm:postofficeName"));
		ddpo.selectByIndex(1);
		driver.findElementById("userRegistrationForm:landline").sendKeys("8526797571");
		
	}

}
