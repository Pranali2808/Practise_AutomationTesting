package webelementinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetLocationMethod {
	@Test
	public void getLocationMethodofwebelement() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		int mailx = email.getLocation().getX();
		int maily = email.getLocation().getY();
		System.out.println("email x coordinate :" + mailx);
		System.out.println("email y coordinate :" + maily);
		driver.findElement(By.id("pass"));
		int passx = email.getLocation().getX();
		int passy = email.getLocation().getY();
		System.out.println("password x coordinate :" + passx);
		System.out.println("password y coordinate :" + passy);
		driver.close();
	}
}
