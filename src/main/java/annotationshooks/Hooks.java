package annotationshooks;

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
		startTestIteration("Create Lead", "Geetha", "Sanity");
		startApp("chrome", "http://leaftaps.com/opentaps/control/main");
//		WebElement eleUserName = locateElement("id", "username");
//		type(eleUserName, uName);
//		WebElement elePassword = locateElement("id","password");
//		type(elePassword, pwd);
//		WebElement eleLogin = locateElement("class","decorativeSubmit");
//		click(eleLogin);	
//		//startTestIteration(iteration)
//		WebElement eleCrmLink = locateElement("linkText","CRM/SFA");
//		click(eleCrmLink);
	}
	
	@After
	public void after(Scenario sc)
	{
		closeBrowser();
		endResult();
	}

}
