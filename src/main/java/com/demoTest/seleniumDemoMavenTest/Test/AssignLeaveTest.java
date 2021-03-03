package com.demoTest.seleniumDemoMavenTest.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.demoTest.seleniumDemoMavenTest.Utils.DriverManager;
import com.demoTest.seleniumDemoMavenTest.Utils.XpathUtils;

public class AssignLeaveTest {
	private WebDriver driver= null;

	@Test
	public void assignleavetest() {
		System.out.println("hello");
		driver=DriverManager.driver;
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.assignleave.assignLeavebtn)));
		driver.findElement(By.xpath(XpathUtils.assignleave.assignLeavebtn)).click();
		
	}

}
