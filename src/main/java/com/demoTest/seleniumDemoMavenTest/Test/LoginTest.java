package com.demoTest.seleniumDemoMavenTest.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoTest.seleniumDemoMavenTest.Utils.DriverManager;
import com.demoTest.seleniumDemoMavenTest.Utils.UrlTextUtils;
import com.demoTest.seleniumDemoMavenTest.Utils.XpathUtils;

@Test
public class LoginTest {
	private WebDriver driver = null;

	@Test(priority = 0)
	public void hometitleverify() {
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.URL.baseUrl);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.Text.homepage);
	}

	// method call for login
	@Test(dependsOnMethods = "hometitleverify")
	public void logintest() {

		driver.findElement(By.xpath(XpathUtils.LoginModule.username)).sendKeys("Admin");
		driver.findElement(By.xpath(XpathUtils.LoginModule.password)).sendKeys("admin123");
		driver.findElement(By.id(XpathUtils.LoginModule.buttonlgn)).click();
		System.out.println("Logged in Successfully");

	}

}
