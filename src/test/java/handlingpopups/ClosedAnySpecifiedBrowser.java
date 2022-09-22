package handlingpopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClosedAnySpecifiedBrowser {
	@Test
	public void closeAnySpecifiedBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
		driver.findElement(By.xpath("//i[contains(@class,'fa fa-align-justify')]")).click();
		driver.findElement(By.xpath("//label[@class='toggle'][normalize-space()='FLIGHTS']")).click();
		String expected_title = "Flight";
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : " + count);
		for (String windowHandle : allWindowHandles) {
			driver.switchTo().window(windowHandle);
			String actual_title = driver.getTitle();
			if (actual_title.contains(expected_title)) {
				driver.close();
				System.out.println("Specified Browser window with title -->" + actual_title + " --> is closed");
			}
		}
	}
}
