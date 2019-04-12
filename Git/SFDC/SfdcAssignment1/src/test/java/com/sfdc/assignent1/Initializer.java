package com.sfdc.assignent1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Initializer {
	
	public WebDriver initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/kapilsuryawanshi/Downloads/selenium-server/chromedriver");
		WebDriver driver = new ChromeDriver();
		 return driver;
	}
	
	public ExtentReports initializeReports(String path){
		ExtentReports reports = new ExtentReports(path);
		return reports;
	}
	
	public ExtentTest initializeLogger(String path,String desc){
		ExtentReports reports=initializeReports(path);
		ExtentTest logger=reports.startTest(desc);
		return logger;
	}

}
