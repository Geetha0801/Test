package week3.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert myAlert=driver.switchTo().alert();
		String txt=myAlert.getText();
		myAlert.sendKeys("Geetha");
		System.out.println("Text:"+txt);
		myAlert.accept();
		System.out.println(driver.findElementById("demo").getText());
		driver.switchTo().defaultContent();
		driver.findElementById("tryhome").click();
		Thread.sleep(2000);
		//driver.close();
	}

}

