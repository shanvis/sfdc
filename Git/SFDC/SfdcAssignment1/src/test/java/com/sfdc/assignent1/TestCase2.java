package com.sfdc.assignent1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestCase2 extends ReuseableMethod {
	static ExtentReports report;
	static  ExtentTest logger;
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path="/Users/kapilsuryawanshi/Documents/ExtentReport/Sfdc/Report2.html";

		report = initializeExtentReport(path);
		logger = initializeExtentLogger(path, "Start of the test");

		
		
		System.setProperty("webdriver.chrome.driver", "/Users/kapilsuryawanshi/Downloads/selenium-server/chromedriver");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		
		// Enter UserName
		WebElement Username =driver.findElement(By.xpath("//input[@id='username']"));
		
		enterText(Username, "gavali.sneha7914@gmail.com");
		 
		//Enter PAssword
		WebElement Password=driver.findElement(By.id("password"));
		
		enterText(Password, "Salesforce14");
		Password.clear();
		
		// Select the checkbox
		WebElement RememberMe=driver.findElement(By.id("rememberUn"));
		selectCheckBox(RememberMe);
		// Click login button
		WebElement Login=driver.findElement(By.id("Login"));
		clickButton(Login);
		
        Thread.sleep(2000);
		
		driver.quit();
		

	}

	}


