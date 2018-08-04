package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Testleaf\\drivers\\chromedriver.exe");
		// ChromeOptions op = new ChromeOptions();
		// op.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//h5[text()='Table']").click();
		List<WebElement> rows = driver.findElementsByXPath("//section[@class = 'innerblock']/div//tr");
	    int size = rows.size();
	    System.out.println("Row "+size);	    
	    List<WebElement> columns = driver.findElementsByXPath("//section[@class = 'innerblock']/div//tr[2]/td");
	    int csize = columns.size();
	    System.out.println("Column "+csize);
	    //driver.findElementByXPath("//font[text()='Learn to interact with Elements']";
	    String progressValue = driver.findElementByXPath("//*[(contains(text(),'Learn to interact with'))]/following::td").getText();
	    System.out.println(progressValue);
	    
	}
	

}
