package week3homework;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomwWork2 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		System.setProperty("webdriver.chrome.driver","C:\\Testleaf\\drivers\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();		
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		List<WebElement> allFrames = driver.findElementsByTagName("iframe");
		count = allFrames.size();
		//System.out.println(count);
		for(WebElement eachFrame: allFrames)
		{   
			//count = count+1;
			driver.switchTo().frame(eachFrame);
			List<WebElement> inFrame =  driver.findElements(By.tagName("iframe"));
			//System.out.println(inFrame.size());
			for(WebElement innerFrame : inFrame)
			{
				count = count+1;
	
			}
		 	driver.switchTo().defaultContent();
		}
		
		System.out.println("Number of Frames; "+count);
		

}
}