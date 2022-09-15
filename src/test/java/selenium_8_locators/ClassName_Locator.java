package selenium_8_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassName_Locator {
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.className("inputtext _55r1 inputtext _1kbt _9ay4 inputtext _1kbt"));
		email.sendKeys("8446151018");
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));
		pass.sendKeys("Prashi@123");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
		login.click();
		Thread.sleep(2000);
		driver.close();
	}
}
