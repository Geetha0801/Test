package pagesimplementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import wdMethods.Annotations;
import wdMethods.SeMethods;

public class Login extends SeMethods{
	
	public Login()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	 WebElement elecUName;
	 
	@FindBy(id="password")
	 WebElement elePwd;
	
	@FindBy(className = "decorativeSubmit")
	 WebElement eleLogin;
	
//public static ChromeDriver driver;
	
//	@Given("Open the browser")
//	public void openBrowser()
//	{
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//	}
//	@And("Maxmize the window")
//	public void maxWindow() {
//		driver.manage().window().maximize();
//	}
//	@And("Load the url")
//	public void loadUrl() {
//		driver.get("http://leaftaps.com/opentaps/control/main");
//	}
//	@And("Set the timeout")
//	public void setTimeOut() {
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	}
	
	@Given("Enter user name as (.*)")
	public Login typeUserName(String uName)
	{
		type(elecUName,uName);
		return this;
	}
	
	@And("Enter password as (.*)")
	public Login typePwd(String cName)
	{
		type(elePwd,cName);
		return this;
	}

    @And("Click Login button")
    public CrmPage clickLogin()
    {
    	clickNoSnap(eleLogin);
    	return new CrmPage();
    }
}
