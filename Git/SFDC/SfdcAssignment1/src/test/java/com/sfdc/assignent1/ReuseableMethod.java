package com.sfdc.assignent1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReuseableMethod {
	static ExtentReports report;
	static  ExtentTest logger;
	static WebDriver driver;
	/*Initialize the driver
	 * created date : 03/21/19
	 * created by   : Sneha
	 * */
	public static WebDriver IntializeDriver(){
		  System.setProperty("webdriver.chrome.driver", "/Users/kapilsuryawanshi/Downloads/selenium-server/chromedriver");
			 driver = new ChromeDriver();
			 return driver;
	  }
	
	/*Initialize the logger
	 * created date : 03/21/19
	 * created by   : Sneha
	 * */
	
	public static ExtentReports initializeExtentReport(String path){
		report = new ExtentReports(path);
		return report;
	}
	
	/*Initialize the path
	 * created date : 03/21/19
	 * created by   : Sneha
	 * */
	
	public static ExtentTest initializeExtentLogger(String path,String desc){
		report = initializeExtentReport(path);
		logger = report.startTest("Login to SFDC");
		return logger;
	}
	

	
	/*Launch the Url
	 * Argument : String
	 * created date : 03/21/19
	 * created by   : Sneha
	 * */
	
	  public static WebDriver Launch(String url){
		  driver.get(url);
		  return driver;
	  }
	  
	  
	    /* Enter the Text
		 * Argument : WebElemnt,String
		 * created date : 03/21/19
		 * created by   : Sneha
		 * */
	  
	  public static void enterText(WebElement Obj,String textVal){
		  if(Obj.isDisplayed()){
			  Obj.sendKeys(textVal);
			  System.out.println("Pass");
			  logger.log(LogStatus.PASS, "Text is entered");
		  }
		  else{
			  System.out.println("Fail");
			  logger.log(LogStatus.FAIL, "Text is entered");
		  }
	  }
	  
	  
	  /* Click the Button
		 * Argument : WebElemnt,String
		 * created date : 03/21/19
		 * created by   : Sneha
		 * */
	  public static void clickButton(WebElement obj) {
			if (obj.isDisplayed()){
				obj.click();
				System.out.println("Button is clicked ");
				logger.log(LogStatus.PASS, "Button is clicked");
			} else {
				System.out.println("Button is not clicked ");
				 logger.log(LogStatus.FAIL, "Button is not clicked");
			}
			report.endTest(logger);
			report.flush();
			}
	  
	  
	  /* Click the Link
		 * Argument : WebElemnt,String
		 * created date : 03/21/19
		 * created by   : Sneha
		 * */
	  
	  
	  public static void clickLink(WebElement obj) {
			if (obj.isDisplayed()){
				obj.click();
				System.out.println("Link is clicked ");
				logger.log(LogStatus.PASS, "Link is clicked");
			} else {
				System.out.println("Link is not clicked ");
				logger.log(LogStatus.FAIL, "Link is not clicked");
			}
			report.endTest(logger);
			report.flush();
			}
		
	  /*Select the checkbox
		 * Argument : WebElemnt,String
		 * created date : 03/21/19
		 * created by   : Sneha
		 * */
	  public static void selectCheckBox(WebElement obj)
		{
			if(obj == null)
				return;
			if (obj.isDisplayed()) {
				if(!obj.isSelected())
				{
					obj.click();
				}
				System.out.println("checkbox is selected");
				logger.log(LogStatus.PASS, "checkbox is selected");
			} else {
				System.out.println("Fail checkbox could not be found");
				logger.log(LogStatus.FAIL, "checkbox could not be found");
			}
			report.endTest(logger);
			report.flush();
		}

}
