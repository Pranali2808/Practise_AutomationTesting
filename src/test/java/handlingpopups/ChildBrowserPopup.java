package handlingpopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ChildBrowserPopup {
	@Test
	public  void verifyChildBrowserPopup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
		driver.findElement(By.xpath("//i[contains(@class,'fa fa-align-justify')]")).click();
		driver.findElement(By.xpath("//label[@class='toggle'][normalize-space()='FLIGHTS']")).click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : "+ count);
		for (String windowHandle : allWindowHandles) {
		driver.switchTo().window(windowHandle);
		String title = driver.getTitle();
		System.out.println("Window handle id of page -->"+ title +" --> is : "+windowHandle);
		driver.close();
		}
		//driver.quit(); 
		}
	}
		