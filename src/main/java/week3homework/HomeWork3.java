package week3homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Testleaf\\drivers\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();	
	    driver.manage().window().maximize();
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		//driver.switchTo().frame("childIframe");
		driver.findElementByXPath("//div[@class='ui-layout-west ui-layout-pane ui-layout-pane-west']//button").click();
		//driver.switchTo().defaultContent();
		driver.switchTo().frame("childIframe");
		driver.findElementByXPath("//div[contains(text(),'Iframe West')]//button").click();
		driver.findElementByXPath("//div[contains(text(),'Iframe East')]//button").click();
		
		driver.switchTo().defaultContent();
		driver.findElementByXPath("//div[contains(text(),'East')]//button").click();
	}

}
