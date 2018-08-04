package week2.day1;

	import java.awt.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.support.ui.Select;

	public class Dropdown {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Testleaf\\drivers\\chromedriver.exe");
		   // ChromeOptions op = new ChromeOptions();
		   // op.setHeadless(true);
			ChromeDriver driver = new ChromeDriver();		
			driver.get("http://leaftaps.com/opentaps/");
			driver.findElementById("username").sendKeys("DemoSalesManager");
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByLinkText("CRM/SFA").click();
			driver.findElementByLinkText("Create Lead").click();
			driver.findElementById("createLeadForm_companyName").sendKeys("Accenture");
			driver.findElementById("createLeadForm_firstName").sendKeys("Geetha");
			driver.findElementById("createLeadForm_lastName").sendKeys("Subramanian");
			//WebElement source = driver.findElementById("createLeadForm_industryEnumId");
			Select dd = new Select(driver.findElementById("createLeadForm_industryEnumId"));
			//dd.selectByVisibleText("Insurance");
			java.util.List<WebElement> allOptions = dd.getOptions();
			//driver.findElementByName("submitButton").click();
			int size = allOptions.size();
			System.out.println(size);
			for(WebElement opt : allOptions)
			{
				String text = opt.getText();
				System.out.println(text);
			}
			
		}

	}
