package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods extends Report implements WdMethods {
	public static RemoteWebDriver driver;
	public static String leadId;
	public static String leadFName;
	int i = 1;

	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//System.out.println("The Browser " + browser + " is Launched Successfully");
			reportStep("The Browser \" + browser + \" is Launched Successfully","pass");
			
		} catch (WebDriverException e) {
			//System.err.println("WebDriverException has occured");
			reportStep("WebDriverException has occured","Fail");
		} catch (Exception e) {
			//System.err.println("Exception has occured");
			reportStep("Exception has occured","Fail");
		} finally {
			takeSnap();
		}

	}

	public WebElement locateElement(String locator, String locValue) {
		WebElement ele = null;
		try {
			switch (locator) {
			case "id":
				ele = driver.findElementById(locValue);
				break;

			case "class":
				ele = driver.findElementByClassName(locValue);
				break;
			case "xpath":
				ele = driver.findElementByXPath(locValue);
				break;
			case "linkText":
				ele = driver.findElementByLinkText(locValue);
				break;
			case "name":
				ele = driver.findElementByName(locValue);
				break;
			}
		} catch (NoSuchElementException e) {
			//System.err.println("Element level exception occured: " + locValue);
             reportStep("Element level exception occured: " + locValue,"Fail");
		} catch (Exception e) {
			//System.err.println("Exception occured");
			reportStep("Exception occured: " + locValue,"Fail");
		}
		return ele;

	}

	public WebElement locateElement(String locValue) {
		WebElement ele = null;
		try {
			ele = driver.findElementById(locValue);
			reportStep("Element "+ele+" has been located by ID successfully","Pass");
		} catch (NoSuchElementException e) {
			System.err.println("NosuchElementException occured");
			reportStep("NosuchElementException occured","Fail");

		} catch (Exception e) {
			System.err.println("Exception occured");
			reportStep("Exception occured","Fail");

		}
		return ele;
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			//System.out.println("The Data " + data + " is Entered Successfully");
			reportStep("The Data " + data + " is Entered Successfully","Pass");
		} catch (WebDriverException e) {
			//System.err.println("WebDriverException occured");
			reportStep("WebDriverException occured","Fail");
		} catch (Exception e) {
			//System.err.println("Exception occured");
			reportStep("Exception occured","Fail");
		} finally {
			takeSnap();
		}
	}

	public void clear(WebElement ele) {
		try {
			ele.clear();
			//System.out.println("The Element " + ele + " is cleared Successfully");
			reportStep("The Element " + ele + " is cleared Successfully","Pass");
		} catch (WebDriverException  e) {
			//System.err.println("WebDriverException occured");
			reportStep("WebDriverException occured","Fail");
		} catch (Exception e) {
			//System.err.println("Exception occured");
			reportStep("Exception occured","Fail");
		}
		finally {
			takeSnap();
		}
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			//System.out.println("The Element " + ele + " is clicked Successfully");
			reportStep("The Element " + ele + " is clicked Successfully","Pass");
		} catch (WebDriverException  e) {
			//System.err.println("WebDriverException occured");
			reportStep("WebDriverException occured","Fail");
		} catch (Exception e) {
			//System.err.println("Exception occured");
			reportStep("Exception occured","Fail");
		}
		finally {
			//takeSnap();
		}
	}

	public void clickNoSnap(WebElement ele) {
		try {
			ele.click();
			//System.out.println("The Element " + ele + " is clicked Successfully");
			reportStep("The Element " + ele + " is clicked Successfully","Pass");
		} catch (Exception e) {
			//System.err.println("Exception has occured");
			reportStep("Exception occured","Fail");
		}
	}

	public String getText(WebElement ele) {
		// ele.getText()
		try {
			//System.out.println("Text is " + ele.getText());
			reportStep("Text is " + ele.getText(),"Pass");
			return ele.getText();
		} catch (Exception e) {
			//System.err.println("Exception has occured");
			reportStep("Exception occured","Fail");
			return null;
		}

	}
	public void mouseOverElement(WebElement src,WebElement des)
	{
		Actions builder = new Actions(driver);
        builder.moveToElement(src).pause(2000).click(des).perform();
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			Select source = new Select(ele);
			source.selectByVisibleText(value);
			//System.out.println("The value " + value + " is selected in " + ele);
			reportStep("The value " + value + " is selected in " + ele,"Pass");
		} catch (ElementNotVisibleException e) {
			//System.err.println("ElementNotVisibleException occured");
			reportStep("ElementNotVisibleException occured","Fail");
			throw new RuntimeException();
		} catch (Exception e) {
			//System.err.println("Exception occured");
			reportStep("Exception occured","Fail");
		}
		finally {
			takeSnap();
		}
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			Select source = new Select(ele);
			source.selectByIndex(index);
			System.out.println("The value at " + index + " is selected in " + ele);
			reportStep("The value at " + index + " is selected in " + ele, "Pass");
		} catch (Exception e) {
			//System.err.println("Exception occured");
			reportStep("Exception occured","Fail");
		}
		finally {
		takeSnap();
		}
	}

	public boolean verifyTitle(String expectedTitle){
		String title = driver.getTitle();
		boolean bReturn = false;
		// System.out.println(title);
		if (expectedTitle.equals(title)) {
			//System.out.println("Title is matched");
			reportStep("Title is matched","Pass");
			takeSnap();
			bReturn = true;
		} else {
			//System.out.println("Title is not matched");
			reportStep("Title is not matched","Fail");
			takeSnap();

		}
		return bReturn;

	}

	public void timeOuts() throws Exception {
		Thread.sleep(3000);
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		String text = ele.getText();
		if (text.equals(expectedText)) {
			//System.out.println("Exact Text is matched");
			reportStep("Exact Text is matched","Pass");
		} else {
			//System.out.println("Text is not matched exactly");
			reportStep("Exact Text is not matched","Fail");
		}
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		String text = ele.getText();
		if (text.contains(expectedText)) {
			//System.out.println("Partial Text is verified");
			reportStep("Partial Text is matched","Pass");
		} else {
			//System.out.println("Text is not matched");
			reportStep("Partial Text is not matched","Fail");
		}

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// String text = ele.getAttribute(attribute).equals(value));
		if (ele.getAttribute(attribute).equals(value)) {
			//System.out.println("Exact Attribute Value is matched");
			reportStep("Exact Attribute Value is matched","Pass");
		} else {
			//System.out.println("Attribute value is not matched")
			reportStep("Exact Attribute value is not matched","Fail");
		}

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		String text = ele.getAttribute("value");
		if (text.contains(value)) {
			//System.out.println("Partial Attribute Value is matched");
			reportStep("Partial Attribute Value is matched","Pass");
		} else {
			//System.out.println("Attribute value is not matched");
			reportStep("Partial Attribute value is not matched","Fail");
		}

	}

	public void verifySelected(WebElement ele) {
		if (ele.isSelected() == true) {
			//System.out.println(ele + " is selected");
			reportStep(ele + " is selected","Pass");
			takeSnap();
		} else {
			//System.out.println(ele + " is not selected");
			reportStep(ele + " is not selected","Fail");
			takeSnap();
		}

	}

	public void verifyDisplayed(WebElement ele) {
		if (ele.isDisplayed() == true) {
			//System.out.println(ele + " is selected");
			reportStep(ele + " is selected","Pass");
			takeSnap();
		} else {
			//System.out.println(ele + " is not selected");
			reportStep(ele + " is not selected","Fail");
			takeSnap();
		}

	}

	public void switchToWindow(int index) {

		try {
			Set<String> allWindows = driver.getWindowHandles();
			List<String> listOfWindows = new ArrayList<String>();
			listOfWindows.addAll(allWindows);
			driver.switchTo().window(listOfWindows.get(index));
		} catch (StaleElementReferenceException e) {
			//System.err.println("StaleElementReferenceException occured");
			reportStep("StaleElementReferenceException has occured","Fail");
		} catch (Exception e) {
			//System.err.println("Exception occured");
			reportStep("Exception has occured","Fail");
		} finally {
			takeSnap();
		}
	}

	public void switchToFrame(WebElement ele) {
		try {
			driver.switchTo().frame(ele);
		} catch (NoSuchFrameException e) {
			//System.err.println("NoSuchFrameException has occured");
			reportStep("NoSuchFrameException has occured","Fail");
		}catch (Exception e) {
			//System.err.println("Exception occured");
			reportStep("Exception has occured","Fail");
		}	
		finally
		{
		takeSnap();
		}
	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
			//System.out.println("Accepted Alert");
			reportStep("Accepted Alert","Pass");
		} catch (NoAlertPresentException e) {
			//System.err.println("NoAlertPresentException occured");
			reportStep("NoAlertPresentException has occured","Fail");
		} catch (Exception e) {
			//System.err.println("Exception occured");
			reportStep("Exception has occured","Fail");
		}

	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
			reportStep("Dismissed Alert","Pass");
		} catch (NoAlertPresentException e) {
			//System.err.println("NoAlertPresentException occured");
			reportStep("NoAlertPresentException has occured","Fail");
		} catch (Exception e) {
			//System.err.println("Exception occured");
			reportStep("Exception has occured","Fail");
		}

	}

	public String getAlertText() {
		// driver.switchTo().alert().getText();
		try {
			return driver.switchTo().alert().getText();
		} catch (NoAlertPresentException e) {
			//System.err.println("NoAlertPresentException occured");
			reportStep("NoAlertPresentException has occured","Fail");
			return null;
		}catch (Exception e) {
			//System.err.println("Exception occured");
			reportStep("Exception has occured","Fail");
			return null;
		}
		
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img" + i + ".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		try {
			driver.close();
			//System.out.println("Current browser is closed");
			reportStep("Current browser is closed","Pass");
		} catch (WebDriverException e) {
			//System.err.println("Webdriver exception has occurred");
			reportStep("WebDriverException has occured","Fail");
		}catch (Exception e) {
			//System.err.println("Exception occured");
			reportStep("Exception has occured","Fail");
		}
	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
			//System.out.println("All browsers are closed");
			reportStep("All browsers are closed","Pass");
		} catch (WebDriverException e) {
			//System.err.println("Webdriver exception has occurred");
			reportStep("WebDriverException has occured","Fail");
		}catch (Exception e) {
			//System.err.println("Exception occured");
			reportStep("Exception has occured","Fail");
		}

	}

}