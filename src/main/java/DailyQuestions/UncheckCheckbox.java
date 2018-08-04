package DailyQuestions;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UncheckCheckbox {

			public static void main(String[] args) {

				// Launch browser
				System.setProperty("webdriver.chrome.driver","C:\\Testleaf\\drivers\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();

				// load url
				driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");

				// implicitwait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				// Identify the element and store
				WebElement element=driver.findElementByXPath("//label[contains(text(),'Confirm Selenium is checked')]/following::input[1]");
				boolean isSelected = element.isSelected();
				if(isSelected == true)
				{
					element.click();
				}
				else
				{
					System.out.println("Checkbox is not enabled");
				}
			}
}
				