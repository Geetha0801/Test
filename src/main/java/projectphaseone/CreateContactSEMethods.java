//package projectphaseone;
//
//import org.junit.Test;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//
//import wdMethods.ProjectMethods;
//import wdMethods.SeMethods;
//
//public class CreateContactSEMethods extends ProjectMethods {
//
//	 @Test
//	public void createContact() throws Exception{
//		 
//		 loginLeafTaps();
//		/*startApp("chrome", "http://leaftaps.com/opentaps");
//		WebElement eleUserName = locateElement("id", "username");
//		type(eleUserName, "DemoSalesManager");
//		WebElement elePassword = locateElement("id","password");
//		type(elePassword, "crmsfa");
//		WebElement eleLogin = locateElement("class","decorativeSubmit");
//		click(eleLogin);
//		//Click crm/sfa link
//		click(locateElement("linkText","CRM/SFA"));
//		//Click Create Contact
//*/		
//		 click(locateElement("linkText","Create Contact"));
//
//		//Enter First Name
//		//type(locateElement("id","createLeadForm_firstNameLocal"),"Mathi");
//		
//		type(locateElement("firstNameField"),"Poomathi");
//		//Enter Last Name
//		type(locateElement("lastNameField"),"Rajan");
//		//Enter firstNameLocal
//		type(locateElement("createContactForm_firstNameLocal"),"Mathi");
//
//		//Enter lastNameLocal
//		type(locateElement("createContactForm_lastNameLocal"),"Rajan");
//
//		//Enter Salutation
//		type(locateElement("createContactForm_personalTitle"),"Ms");
//
//		//Enter Title
//		type(locateElement("createContactForm_generalProfTitle"),"Ms");
//
//		//Enter Department
//		type(locateElement("createContactForm_departmentName"),"CSE");
//
//		//Choose Preferred Currency
//
//		selectDropDownUsingText(locateElement("id","createContactForm_preferredCurrencyUomId"),"ALL - Albanian Lek");
//		//Enter Description
//		type(locateElement("createContactForm_description"),"Contact creation");
//
//
//		//Enter Important Note
//
//		type(locateElement("createContactForm_importantNote"),"Contact creation");
//		//Enter Area Code
//		type(locateElement("createContactForm_primaryPhoneAreaCode"),"044");
//
//		//Enter Extension
//		type(locateElement("createContactForm_primaryPhoneExtension"),"91");
//
//		//Enter E-Mail Address
//		type(locateElement("createContactForm_primaryEmail"),"mathi@gmail.com");
//
//		//Enter Phone Number
//		type(locateElement("createContactForm_primaryPhoneNumber"),"8526797571");
//
//		//Enter Person to Ask For
//
//		type(locateElement("createContactForm_primaryPhoneAskForName"),"Mathi");
//		//capture name Appers in To Name field 
//		
//		String name = getText(locateElement("generalToNameField"));
//		
//		
//		//Enter the Address Line 1
//		
//		type(locateElement("createContactForm_generalAddress1"),"162,Meenkarai road");
//		//Enter the City name
//		type(locateElement("createContactForm_generalCity"),"Coimbatore");
//		
//		//Enter Zip/Postal Code
//		type(locateElement("createContactForm_generalPostalCode"),"642004");
//		
//		//Enter Zip/Postal Code Extension
//		type(locateElement("createContactForm_generalPostalCodeExt"),"004");
//		
//		//Enter Attention Name
//		type(locateElement("createContactForm_generalAttnName"),"Guru");
//		
//		//Enter Address Line 2 (optional)
//		type(locateElement("createContactForm_generalAddress2"),"Nanjegoundenpudur");
//		
//		//Choose Country
//		
//		selectDropDownUsingText(locateElement("createContactForm_generalCountryGeoId"),"India");
//		//timeout
//		timeOuts();
//		//Choose State/Province
//		
//		selectDropDownUsingText(locateElement("createContactForm_generalStateProvinceGeoId"),"TAMILNADU");
//		//Click Create Contact button
//		
//		click(locateElement("name","submitButton"));
//		//Verify the First name appears with capture name in To Field
//		
//		//String firstName = getText(locateElement("viewContact_firstName_sp"));
//		verifyPartialAttribute(locateElement("viewContact_firstName_sp"),"value",name);
//		
//		//click edit
//		
//		click(locateElement("linkText","Edit"));
//		//choose New Marketing Campaign
//		
//		selectDropDownUsingIndex(locateElement("addMarketingCampaignForm_marketingCampaignId"),2);
//		//click add
//		
//		click(locateElement("xpath","//input[@value='Add']"));
//		timeOuts();
//		 
//		String mcamp = getText(locateElement("xpath","//table[@class='crmsfaListTable']//tr[2]//td[1]/a"));
//		System.out.println("App Text :"+mcamp);
//		//click update button
//		click(locateElement("xpath","//input[@value='Update']"));
//		
//		//Confirm the choosen Marketing Campaigns appears
//		timeOuts();
//		
//		//verifyPartialText(locateElement("viewContact_firstName_sp"), name);
//
//		if(mcamp.equals("Car and Driver (CATRQ_CARNDRIVER)"))
//		{
//			System.out.println("Choosen Marketing Campaigns appears");
//		}
//		else
//		{
//			System.out.println("Choosen Marketing Campaigns doesn't appear");
//		}
//
//		closeApplication();
//	}	
//
//}
//
//
//
