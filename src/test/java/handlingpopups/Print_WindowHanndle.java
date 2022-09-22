package handlingpopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Print_WindowHanndle {
	@Test
	public void print_WindowHanndle()  throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		String windowHandle = driver.getWindowHandle();
		System.out.println("ID of cuurrent window: " +windowHandle);
		driver.close();
	}
}
