package selenium_8_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LinkText_And_PartialLinkText {
	@Test
	public void linkText_Locator() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("8446151018");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Prashi@123");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void partial_linkText_Locator() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("8446151018");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Prashi@123");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Log In")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
