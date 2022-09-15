package webelementinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IsEnabledMethod {
	@Test
	public void isEnabledMethodofwebelement() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		if (email.isEnabled()) {
			System.out.println("email text box is enabled");
		} else {
			System.out.println("email text box is disabled");
		}
		WebElement password = driver.findElement(By.id("pass"));
		if (password.isDisplayed()) {
			System.out.println("password text box is enabled");
		} else {
			System.out.println("password text box is disabled");
		}
	}
}
