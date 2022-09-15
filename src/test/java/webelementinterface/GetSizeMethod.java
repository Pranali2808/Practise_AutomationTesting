package webelementinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetSizeMethod {
	@Test
	public void getTagNameMethodofwebelement() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		int mailH = email.getSize().getHeight();
		int mailW = email.getSize().getWidth();
		System.out.println("email Height :" + mailH);
		System.out.println("email Width :" + mailW);
		driver.findElement(By.id("pass"));
		int passH = email.getSize().getHeight();
		int passW = email.getSize().getWidth();
		System.out.println("password Height :" + passH);
		System.out.println("password Width :" + passW);
		driver.close();
	}
}
