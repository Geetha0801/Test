package DailyQuestions;


import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// Launch browser
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Testleaf\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			
		//maximize the webpage
		driver.manage().window().maximize();

		// load url
		driver.get("http://leaftaps.com/opentaps/");

		// implicitwait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// get all the links in webpage
		List<WebElement> links  = driver.findElements(By.tagName("a"));
		 System.out.println("Total links are "+links.size());
		 // for each webelement get the url using href attribute
		 for(int i=0; i<links.size(); i++) {
			 WebElement element = links.get(i);			
			 String url = element.getAttribute("href");
			 URL link = new URL(url);
			
						 // use HttpURLConnection to check the connection
			 HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
			 //Set the timeout for 2 seconds
			 httpConn.setConnectTimeout(2000);
			 //connect using connect method
			 httpConn.connect();
			 if(httpConn.getResponseCode()== 200) { 
				 System.out.println(url+" : "+httpConn.getResponseMessage());
				 }
				 if(httpConn.getResponseCode()== 404) {
				 System.out.println(url+" : "+httpConn.getResponseMessage());
				 }
				 }			 
	}
	catch(Exception e)
	{
		System.out.println("Exception occurred");
	}
}
}

