package learncucumber;

import org.openqa.selenium.WebElement;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import wdMethods.SeMethods;

public class Hooks extends SeMethods {
	
	@Before	
	public void before(Scenario sc)
	{
		
		beginResult();
		startTest(sc.getName(),sc.getName());
		startTestIteration("Duplicate Lead", "Geetha", "Sanity");
		startApp("chrome", "http://leaftaps.com/opentaps/control/main");
	}
	@After
	public void after(Scenario sc)
	{
		closeBrowser();
		endResult();
	}

}
