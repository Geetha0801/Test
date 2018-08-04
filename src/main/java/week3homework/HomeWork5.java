package week3homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Testleaf\\drivers\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();	
	    driver.manage().window().maximize();
		driver.get("http://popuptest.com/");
		driver.findElementByLinkText("Multi-PopUp Test #2").click();
		Set<String> allWinHandle = driver.getWindowHandles();
		List<String> listAllWin = new ArrayList<String>();
		listAllWin.addAll(allWinHandle);
		driver.switchTo().window(listAllWin.get(1));
		driver.close();
		driver.switchTo().window(listAllWin.get(2));
		driver.close();
		driver.switchTo().window(listAllWin.get(3));
		driver.close();
		driver.switchTo().window(listAllWin.get(0));
		System.out.println("Title of Parent "+driver.getTitle());
		//System.out.println("Title of Parent "+driver.getTitle());
	}

}
