package webelementinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IsSelectedMethod {

	@Test
	public void isEnabledMethodofwebelement() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		if (email.isSelected()) {
			System.out.println("email text box is selected");
		} else {
			System.out.println("email text box is not selected");
		}
		WebElement password = driver.findElement(By.id("pass"));
		if (password.isDisplayed()) {
			System.out.println("password text box is selected");
		} else {
			System.out.println("password text box is not selected");
		}
	}
}
