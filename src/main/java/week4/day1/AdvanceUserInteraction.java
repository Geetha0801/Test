package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvanceUserInteraction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement eleFrame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(eleFrame);
		WebElement eleDraggable = driver.findElementById("draggable");
		WebElement eleDroppable = driver.findElementById("droppable");
		Point location = eleDroppable.getLocation();
		System.out.println(location);
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(eleDraggable, location.getX(),location.getY()).perform();
		
	}

}
