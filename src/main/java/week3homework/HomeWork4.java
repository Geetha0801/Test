package week3homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Testleaf\\drivers\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();	
	    driver.manage().window().maximize();
		driver.get("http://jqueryui.com/");
		driver.findElementByLinkText("Draggable").click();
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		System.out.println(driver.findElementByXPath("//div[@id='draggable']/p").getText());
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Droppable").click();

	}

}
