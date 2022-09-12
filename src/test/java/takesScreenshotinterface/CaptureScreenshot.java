package takesScreenshotinterface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class CaptureScreenshot {
	@Test
	public static void take_Screenshot() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8446151018");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Prashi@123");
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(".\\screenshot\\" + "FacebookPage1.png");
		FileHandler.copy(srcFile, destFile);
		driver.close();
	}
}
