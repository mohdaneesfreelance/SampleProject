package com.abc.webautomation.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static ExtentTest test;
	public static ExtentReports reports;
	public static String timeStamp;
	public static String updatedReportFile;
	
	/**
	 * This method will create extent report object
	 */
	public void report() {
		
		// creating variable timeStamp for making new time wise report in each run
				timeStamp = new SimpleDateFormat("yyyyMMMddhhmm").format(Calendar.getInstance().getTime());
				
				// Create  report
				updatedReportFile = System.getProperty("user.dir") + "/Reports/" + timeStamp;
				reports = new ExtentReports(updatedReportFile+"/TestCasesReports.html");
	}
	
	
	public TestBase() {
		Properties  prop= new Properties();
		try {
			
			FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"src\\main\\java\\com\\abc\\webautomation\\config\\abc_Config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 
	 * This method is to launch web browser
	 * @return 
	 * @return 
	 * @throws InterruptedException 
	 */
	//initialization
	public static void initialization(String url) {
		//String browserName = prop.getProperty("browser");
		String browserName = "chrome";

		if (browserName.equals("chrome")) {
			System.out.println(System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver");
			driver = new ChromeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	/**
	 * Method used to return web driver object
	 * @return
	 */
	public static WebDriver getDriver() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	
	/**
	 * Method used to input value
	 * @param locatorKey
	 * @param data
	 */
	public void input(WebElement locatorKey,String data, WebDriver driver)
	 {
		//waitForVisibilityOf(locatorKey, driver);
		try {
			locatorKey.sendKeys(data);	
			test.log(LogStatus.PASS, data + " has entered successfully");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, data + "has not entered successfully");
		}
		
	 }
	
	/**
	 * Method used to click on web element
	 * @param toclick
	 */
	 public void click(WebElement toclick, WebDriver driver) {
		 
		waitForVisibilityOf(toclick, driver);
		try {
			toclick.click();
			test.log(LogStatus.PASS, " successfully clicked on the element .");
		} catch (Exception e) {
			
			test.log(LogStatus.FAIL, " Unable to click. ");
		
		}
		 
		  
	 }
	 
	 /**
	  * Method used to hover the mouse
	  * @param mainmodulename
	  * @param framename
	  * @throws Exception
	  */
	 public static void mouseOverElement(WebElement mainmodulename , String framename) throws Exception {
			
		 try {
			 Actions action=new Actions(driver);
				driver.switchTo().frame(framename);
				action.moveToElement(mainmodulename).build().perform();
				test.log(LogStatus.PASS, " successfully mouse hover on  " + mainmodulename );
		} catch (Exception e) {
			test.log(LogStatus.FAIL, " Unable to mouse hover on  " + mainmodulename );
		}
			
				
	}
	 
	 /**
	  * Method used to scroll the web page
	  * @param ele
	  */
	 public static void scrollToView(WebElement ele) {
		 JavascriptExecutor je= (JavascriptExecutor)driver;
		 je.executeScript("arguments[0].scrollIntoView(true);", ele);
		 
	 }
	 
	 /**
	  * Method used to scroll till the end of web page
	  * @param ele
	  */
	 public static void scrollToEnd(List<WebElement> ele) {
		 JavascriptExecutor je= (JavascriptExecutor)driver;
		 int i=1;
		 while(isElementPresent(ele)==false) {
			 System.out.println("Scroll : "+i);
			 je.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			 i++;
		 }
	 }
	 
	 /**
	  * Method used to check element present or not
	  * @param ele
	  * @return
	  */
	 public static boolean isElementPresent(List<WebElement> ele) {

			if (ele.size()==0)
				return false;
			else
				return true;
	 }
	 
	 /**
		 * Method used to get text
		 * @param mobileElement
		 * @return
		 */
		public String getText(WebElement ele) {
			return ele.getText();
		}
	 
	
	 
	 /**
	  * Method used to wait for availability of element
	  * @param ele
	  * @param driver
	  */
	 public void waitForVisibilityOf(WebElement ele, WebDriver driver) {
			WebDriverWait webDriverWait = new WebDriverWait(driver, 70);
			webDriverWait.until(ExpectedConditions.visibilityOf(ele));
		}
	 
	 /**
	  * Method used to switch on child window
	  * @param parentWindow
	  */
	 public void switchWindow(String parentWindow) {
		 System.out.println("Parent : " + parentWindow);
		 Set<String> allWindows=driver.getWindowHandles();
		 for(String child:allWindows) {
			 System.out.println(" child : " + child);
			 
			 if(!parentWindow.equalsIgnoreCase(child)) {
				 driver.switchTo().window(child);
				 
			 } 
		 }	 
	 }
	 
	 /**
	  * Fetch data from loan table
	  * @param ele
	  * @param tableXpath
	  * @return
	  */
	 public HashMap<Integer, String> readData(List<WebElement> ele, String tableXpath) {
		 HashMap<Integer, String> hm = new HashMap<Integer, String>();
		 for(int i=2;i <=ele.size();i++) {
				 int key=Integer.valueOf(driver.findElement(By.xpath(tableXpath +"["+i+"]/td[1]")).getText());
				 String value=driver.findElement(By.xpath(tableXpath +"["+i+"]/td[2]")).getText();
				 hm.put(key, value);
		 }
		 return hm;
	 }
	 
	 /**
	  * Method used to calculate interest in double format
	  * @param yearInterest
	  * @return
	  */
	 public String calculateInterest(String yearInterest) {
		 
		 return (Double.valueOf(yearInterest)/100)+"0%";

	 }
	 
	 
	 public void closeBrowser() {
		 Set<String> allWindows = driver.getWindowHandles();
		 for(String window:allWindows) {
			 driver.switchTo().window(window);
			 driver.close();
			 reports.endTest(test);
			reports.flush();
		 }
	 }
	 
	 
	 /**
	  * Method used to verify or assert field value
	  * @param expectedError
	  * @param element
	  * @throws Throwable
	  */
	 public void verifyValue( WebElement element, String expectedValue) throws Throwable {
			System.out.println("Verify that the actual value is matching the expected one");
			String actualValue = getText(element);
			System.out.println("The actual actualValue  is: " + actualValue);
			if(actualValue.equalsIgnoreCase(expectedValue)) {
				Assert.assertTrue(actualValue.equalsIgnoreCase(expectedValue));
				test.log(LogStatus.PASS, expectedValue + " expected is same as actual value "+ actualValue);
			}else {
				Assert.assertTrue(actualValue.equalsIgnoreCase(expectedValue));
				test.log(LogStatus.FAIL, expectedValue + " expected is not same as actual value "+ actualValue);
			}
			
		}
	 
	 /**
	  * Method used to verify values
	  * @param actualValue
	  * @param expectedValue
	  * @throws Throwable
	  */
	 public void verifyValue( String actualValue, String expectedValue) throws Throwable {
		 if(actualValue.equalsIgnoreCase(expectedValue)) {
				Assert.assertTrue(actualValue.equalsIgnoreCase(expectedValue));
				test.log(LogStatus.PASS, expectedValue + " expected is same as actual value "+ actualValue);
			}else {
				Assert.assertTrue(actualValue.equalsIgnoreCase(expectedValue));
				test.log(LogStatus.FAIL, expectedValue + " expected is not same as actual value "+ actualValue);
			}
		}
	 
	 
	 

}
