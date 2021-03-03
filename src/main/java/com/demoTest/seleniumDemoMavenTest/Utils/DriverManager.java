package com.demoTest.seleniumDemoMavenTest.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


@Test
public class DriverManager {

	static {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Debasis\\Desktop\\Selenium Online Batch-3\\chromedriver_win32\\chromedriver.exe");
	}
	
	public static WebDriver driver = new ChromeDriver();
	
	@BeforeSuite
	public void TestmanagerTest() {
		System.out.println("Driver Opened successfully");
	}
	
	//Constructor call
	DriverManager(){
		
	}

}
