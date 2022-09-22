package actioncalss;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	@Test
	public static void verifyDragAndDropExample() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		String xp1 = "//input[@id='email']";
		WebElement block1 = driver.findElement(By.xpath(xp1));
		block1.sendKeys("8446251018");
		String xp2 = "//input[@id='pass']";
		WebElement block3 = driver.findElement(By.xpath(xp2));
		Actions actions = new Actions(driver);

		actions.dragAndDrop(block1, block3).perform();
		Thread.sleep(3000);
		driver.close();
	}
}
