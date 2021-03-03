package AdvanceSeleniumJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateTimePickerTest {

	public static void main(String[] args) {
		// Manage Driver
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Debasis\\Desktop\\Selenium Online Batch-3\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();

				// Access URL
				driver.get("https://opensource-demo.orangehrmlive.com/");

				// Login
				driver.findElement(By.name("txtUsername")).click();
				driver.findElement(By.name("txtUsername")).sendKeys("Admin");
				driver.findElement(By.name("txtPassword")).click();
				driver.findElement(By.name("txtPassword")).sendKeys("admin123");
				driver.findElement(By.id("btnLogin")).click();
				driver.get("https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList/reset/1");

				//date time picker
				driver.findElement(By.id("calFromDate")).click();
				//select month
				driver.findElement(By.xpath("/html/body/div[3]/div/div/select[1]")).click();
				Select monthname = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/select[1]")));
				monthname.selectByVisibleText("Jan");
				System.out.println("1");		
						
				//select year
				driver.findElement(By.xpath("/html/body/div[3]/div/div/select[1]")).click();
				Select year = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/select[2]")));
				year.selectByVisibleText("2021");
				System.out.println("2");	
				
				//SelectDate
				WebElement datewidget = driver.findElement(By.className("ui-datepicker-calendar"));
				List<WebElement> cloumns = datewidget.findElements(By.tagName("td"));
				
	
				for (WebElement cell: cloumns) {
					if (cell.getText().equals("31")) {
						cell.findElement(By.linkText("31")).click();
						break;
						
					}
					
				}
	}

}
