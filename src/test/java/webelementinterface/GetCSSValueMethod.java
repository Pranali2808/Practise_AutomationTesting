package webelementinterface;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetCSSValueMethod {
	@Test
	public void verifyColourOfErrormessageonFBloginPage() {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		WebElement errMsg = driver.findElement(By.xpath("//button[text()='Log In']"));
		String errtext = errMsg.getText();
		System.out.println("error message is :" + errtext);
		String c = errMsg.getCssValue("color");
		System.out.println("hexadecimal format : " + c);
		if (c.equals("#ce0100")) {
			System.out.println("Error message is in red color");
		} else {
			System.out.println("Error message is in red color");
		}
		String fontSize = errMsg.getCssValue("font-size");
		String fontWeight = errMsg.getCssValue("font-weight");
		System.out.println("Size of the font is :" + fontSize);
		System.out.println("Weight of the font is :" + fontWeight);
		driver.close();
	}
}

