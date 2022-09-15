package selenium_8_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Name_Locator {
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("8446151018");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Prashi@123");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void createAccount() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Prashi");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Rane");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("8446151018");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Prashi@123");
		Thread.sleep(2000);
		driver.findElement(By.name("birthday_day")).sendKeys("28");
		Thread.sleep(2000);
		driver.findElement(By.name("birthday_month")).sendKeys("Aug");
		Thread.sleep(2000);
		driver.findElement(By.name("birthday_year")).sendKeys("1997");
		Thread.sleep(2000);
		driver.findElements(By.name("sex")).get(0).click();
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).submit();
		Thread.sleep(2000);
		driver.close();
	}
}


