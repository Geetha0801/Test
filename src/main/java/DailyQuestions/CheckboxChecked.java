
package DailyQuestions;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckboxChecked {

			public static void main(String[] args) {

				// Launch browser
				System.setProperty("webdriver.chrome.driver","C:\\Testleaf\\drivers\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();

				// load url
				driver.get("http://leafground.com/pages/checkbox.html");

				// implicitwait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				// Identify the element and store
				WebElement element=driver.findElementByXPath("//label[contains(text(),'DeSelect only checked')]/following::input[2]");
				boolean isSelected = element.isSelected();
				System.out.println(isSelected);
			}
}
				