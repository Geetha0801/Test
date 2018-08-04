package DailyQuestions;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionsDropdown {

	

			static int i=0;

			public static void main(String[] args) {

				// Launch browser
				System.setProperty("webdriver.chrome.driver","C:\\Testleaf\\drivers\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();

				// load url
				driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

				// implicitwait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				// Identify the element and store
				WebElement element=driver.findElementById("userRegistrationForm:countries");

				// create an object using Select class for an webelement 
				Select dropdown=new Select(element);

				// get collection of webelement and store it in list
				java.util.List<WebElement> options = dropdown.getOptions();

				//iterations through each webElement based on condection
				for (WebElement eachoption : options) {
							System.out.println(eachoption.getText());
							
						}
					
				

				//close browser
				driver.close();
			}

		


	}


