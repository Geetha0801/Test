package week3homework;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Testleaf\\drivers\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementByLinkText("Contact Us").click();
		Set<String> allWindowHandle = driver.getWindowHandles();
		List<String> listAllWin = new ArrayList<String>();
		listAllWin.addAll(allWindowHandle);
		driver.switchTo().window(listAllWin.get(1));
		System.out.println("Title: "+driver.getTitle());
		System.out.println("URL :"+driver.getCurrentUrl());
		driver.switchTo().window(listAllWin.get(0));
		driver.findElementByLinkText("Compatible Browser").click();
		Set<String> allWindowHandle1 = driver.getWindowHandles();
		List<String> listAllWin1 = new ArrayList<String>();
		listAllWin1.addAll(allWindowHandle1);
		driver.switchTo().window(listAllWin1.get(2));
		System.out.println("Title: "+driver.getTitle());
		System.out.println("URL :"+driver.getCurrentUrl());
		driver.switchTo().window(listAllWin1.get(0));
		driver.close();
		driver.switchTo().window(listAllWin1.get(1));
		driver.close();
		driver.switchTo().window(listAllWin1.get(2));
		System.out.println(driver.getTitle());
	    System.out.println(driver.findElementByXPath("//div[@class='content_12']//li[1]").getText());
	    System.out.println(driver.findElementByXPath("//div[@class='content_12']//li[2]").getText());
	    System.out.println(driver.findElementByXPath("//div[@class='content_12']//li[3]").getText());
	    System.out.println(driver.findElementByXPath("//div[@class='content_12']//li[4]").getText());
	    System.out.println(driver.findElementByXPath("//div[@class='content_12']//li[5]").getText());
	}

}
