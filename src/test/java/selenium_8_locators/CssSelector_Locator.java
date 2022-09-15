package selenium_8_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CssSelector_Locator {
	@Test
	public void LogIn() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("8446151018");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Prashi@123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void CreateAccount() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Create New")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Prashi");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Rane");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("8446151018");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("Prashi@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[id='day']")).sendKeys("28");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[id='month']")).sendKeys("Aug");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[id='year']")).sendKeys("1997");
		Thread.sleep(2000);
	    driver.findElements(By.name("sex")).get(0).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
