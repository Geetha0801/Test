package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert myAlert=driver.switchTo().alert();
		String txt=myAlert.getText();
		myAlert.sendKeys("Poomathi");
		System.out.println("Text:"+txt);
		myAlert.accept();
		System.out.println(driver.findElementById("demo").getText());
		driver.switchTo().defaultContent();
		driver.findElementById("tryhome").click();
		Set<String> allWinHandle = driver.getWindowHandles();
		List<String> listAllWin = new ArrayList<String>();
		listAllWin.addAll(allWinHandle);
		driver.switchTo().window(listAllWin.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(listAllWin.get(0));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		

	}

}
