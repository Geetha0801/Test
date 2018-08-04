package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElementByXPath("//button[text()='?']").click();
        WebElement eleTvApp = driver.findElementByXPath("//span[text()='TVs & Appliances']");
        WebElement eleTv = driver.findElementByXPath("//span[text()='Television']");
        Actions builder = new Actions(driver);
        builder.moveToElement(eleTvApp).pause(2000).click(eleTv).perform();
	}

}
