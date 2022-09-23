package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Autosuggestionlistbox {
	@Test
	public void autosuggestionlistbox() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> allOptions = driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
		int count = allOptions.size();
		System.out.println("Number of values present in the dropdown is : " + count);
		String expectedValue = "selenium interview questions";
		for (WebElement option : allOptions) {
			String text = option.getText();
			System.out.println(" " + text);
			if (text.equalsIgnoreCase(expectedValue)) {
				option.click();
				break;
			}
		}
		driver.close();
	}
}
