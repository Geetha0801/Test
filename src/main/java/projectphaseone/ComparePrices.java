package projectphaseone;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wdMethods.SeMethods;

public class ComparePrices extends SeMethods{
     @Test
	public void comparePrices() throws Exception{
		 
		 // Launch the Flipkart site
		startApp("chrome", "https://www.flipkart.com");
		//close the login pop up
		clickNoSnap(locateElement("xpath","//button[text()='✕']"));
		//Mouse over to Tv's & appliances
		WebElement eleTvApp = locateElement("xpath","//span[text()='TVs & Appliances']");
        WebElement eleSamsung = locateElement("xpath","(//span[text()='Samsung'])[2]");
        // clickNoSnap on Samsung product
        //Actions builder = new Actions(driver);
        //builder.moveToElement(eleTvApp).pause(2000).clickNoSnap(eleSamsung).perform();
        mouseOverElement(eleTvApp,eleSamsung);
        // In Price filter, select max price to 60000
        selectDropDownUsingText(locateElement("xpath","(//select[@class='fPjUPw'])[1]"),"₹20000");
		// In Price filter, select min price to 25000
        selectDropDownUsingText(locateElement("xpath","(//select[@class='fPjUPw'])[2]"),"₹60000");
        //clickNoSnap on screen size filter
        clickNoSnap(locateElement("xpath","//div[text()='Screen Size']"));
        //clickNoSnap on 48 to 55 size box
        clickNoSnap(locateElement("xpath","//div[text()='48 - 55']"));
        timeOuts();
        //clickNoSnap on the first product
        clickNoSnap(locateElement("xpath","(//div[@class='_3wU53n'])[1]"));
        //switch to new window
        switchToWindow(1);
        //clickNoSnap on compare check box
        clickNoSnap(locateElement("xpath","//span[text()='Compare']"));
        //close the window
        closeBrowser();
        //switch back to parent window
        switchToWindow(0);
        //clickNoSnap on second product
        clickNoSnap(locateElement("xpath","(//div[@class='_3wU53n'])[2]"));
        //switch to new window
        switchToWindow(1);
        //clickNoSnap on compare check box
        clickNoSnap(locateElement("xpath","//span[text()='Compare']"));
        // clickNoSnap on compare button
        clickNoSnap(locateElement("xpath","//span[text()='COMPARE']"));
        // get the price of 1 st product
       String priceOfFirstProduct  = getText(locateElement("xpath","(//div[@class='_1vC4OE'])[1]"));
        // get the proce of 2 nd product
       String priceOfSecondProduct  = getText(locateElement("xpath","(//div[@class='_1vC4OE'])[2]"));
       //Extract numbers only from price
       String numberOnlyFirst = priceOfFirstProduct.replaceAll("[^0-9]", "");
       String numberOnlySecond = priceOfSecondProduct.replaceAll("[^0-9]", "");
       //Converting String to Int
       int firstPrice = Integer.parseInt(numberOnlyFirst);
       int secondPrice = Integer.parseInt(numberOnlySecond);
       // compare the price
       System.out.println(firstPrice);
       System.out.println(secondPrice);
       if(firstPrice < secondPrice)
       {
    	      clickNoSnap(locateElement("xpath","(//button[@class='_2AkmmA _2Npkh4 _2kuvG8 e1kKGU _7UHT_c'])[1]"));
    	   
       }else {
    	   clickNoSnap(locateElement("xpath","(//button[@class='_2AkmmA _2Npkh4 _2kuvG8 e1kKGU _7UHT_c'])[2]"));
       }
}
}
