package testnglisterners;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;

public class CreateLead extends Annotations {
	
	@Test(dataProvider="fetchData")
	//@Test(invocationCount=2)
	//@Test
	public void createLead(String cName,String fName,String lName,long pNum ) throws InterruptedException {
		//Thread.sleep(3000);
		WebElement eleCrmLink = locateElement("linkText","CRM/SFA");
		click(eleCrmLink);
		WebElement eleCreateLead = locateElement("linkText","Create Lead");
		click(eleCreateLead);
		WebElement eleCompanyName = locateElement("createLeadForm_companyName");
		type(eleCompanyName, cName);
		WebElement eleFirstName = locateElement("createLeadForm_firstName");
		type(eleFirstName, fName);
		WebElement eleSurName = locateElement("createLeadForm_lastName");
		type(eleSurName, lName);
		
		type(locateElement("createLeadForm_primaryPhoneNumber"),""+pNum);
		
		WebElement eleButton = locateElement("name","submitButton");
		click(eleButton);
			
		//verifyExactText(locateElement("viewLead_firstName_sp"), "Geetha");		
		
	}
	@DataProvider(name = "fetchData")
	public Object[][] getData(){
		Object[][] data = new Object[2][4];
		data[0][0] = "Accenture";
		data[0][1] = "Geetha";
		data[0][2] = "Subramaniam";
		data[0][3] = 952679756;
		
		data[1][0] = "Accenture";
		data[1][1] = "Poomathi";
		data[1][2] = "Rajan";
		data[1][3] = 576658766;
		return data; 
	}
	
}


