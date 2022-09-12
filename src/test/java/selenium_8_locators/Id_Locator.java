package selenium_8_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Id_Locator {
	@Test
	public static void login() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8446151018");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("Prashi@123");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_9_yZ")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public static void createAccount() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("u_w_b_Jl")).sendKeys("Prashi");
		Thread.sleep(2000);
		driver.findElement(By.id("u_w_d_c4")).sendKeys("Rane");
		Thread.sleep(2000);
		driver.findElement(By.id("u_w_g_Xo")).sendKeys("8446151018");
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("Prashi@123");
		Thread.sleep(2000);
		driver.findElement(By.id("day")).sendKeys("28");
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("Aug");
		Thread.sleep(2000);
		driver.findElement(By.id("year")).sendKeys("1997");
		Thread.sleep(2000);
		driver.findElements(By.id("u_w_4_zk")).get(0).click();
		Thread.sleep(2000);
		driver.findElement(By.id("u_w_s_50")).submit();
		Thread.sleep(2000);
		driver.close();
	}
}


