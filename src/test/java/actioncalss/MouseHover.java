package actioncalss;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	@Test
	public static void verifyMouseHover() throws AWTException, InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement AreaOfExpertise = driver
				.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]"));
		action.moveToElement(AreaOfExpertise).click().perform();
		WebElement cloudApp = driver.findElement(By.linkText("Sign Up"));
		action.moveToElement(cloudApp).click().perform();
		driver.close();
	}
}
