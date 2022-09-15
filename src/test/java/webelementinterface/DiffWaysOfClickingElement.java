package webelementinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DiffWaysOfClickingElement {
	@Test
	public static void verifyClickingAbuttonUsingClick() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		String xp = "//button[text()='Log In']";
		driver.findElement(By.xpath(xp)).click();
		driver.close();
	}

	@Test
	public static void verifyClickingAbuttonUsingSendeys() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		String xp = "//button[text()='Log In']";
		driver.findElement(By.xpath(xp)).sendKeys(Keys.ENTER);
		driver.close();
	}

	@Test
	public static void verifyClickingAbuttonUsingSubmit() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		String xp = "//button[text()='Log In']";
		driver.findElement(By.xpath(xp)).submit();
		driver.close();
	}
}
