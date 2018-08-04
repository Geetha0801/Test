package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AuiSortable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement eleFrame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(eleFrame);
		WebElement eleItemSrc = driver.findElementByXPath("//ul[@id='sortable']//li[1]");
		WebElement eleItemTar = driver.findElementByXPath("//ul[@id='sortable']//li[5]");
		Point location = eleItemTar.getLocation();
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(eleItemSrc, location.getX(),location.getY()).perform();
		
	}

}
