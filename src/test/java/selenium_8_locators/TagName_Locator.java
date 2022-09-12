package selenium_8_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TagName_Locator {
	@Test
	public static void login() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.tagName("input"));
		email.sendKeys("8446151018");
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.tagName("div"));
		pass.sendKeys("Prashi@123");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.tagName("button"));
		login.click();
		Thread.sleep(2000);
		driver.close();
	}
}
