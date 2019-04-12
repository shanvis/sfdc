package com.sfdc.assignent1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestCase3 extends ReuseableMethod {
	static ExtentReports report;
	static  ExtentTest logger;
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path="/Users/kapilsuryawanshi/Documents/ExtentReport/Sfdc/Report3.html";

		report = initializeExtentReport(path);
		logger = initializeExtentLogger(path, "Start of the test");

		
		
		System.setProperty("webdriver.chrome.driver", "/Users/kapilsuryawanshi/Downloads/selenium-server/chromedriver");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		// Click on forgot Password
		WebElement ForgotPass = driver.findElement(By.xpath("//a[@id='forgot_password_link']"));
		clickLink(ForgotPass);
		
		
        Thread.sleep(2000);
		
		driver.quit();
		

	}
	}


