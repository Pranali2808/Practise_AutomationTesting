package requiredpage_title_url;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HomepageUsingTitle_Url {
	@Test
	public void verifyHomepageUsingTitle() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8446151018");
		driver.findElement(By.name("pass")).sendKeys("Prashi@123");
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(3000);
		String expectedTitle = "Facebook";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if (actualTitle.contains(expectedTitle)) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Home page is NOT displayed");
		}
		driver.close();
	}

	@Test
	public void verifyHomePageUsing_Url() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8446151018");
		driver.findElement(By.name("pass")).sendKeys("Prashi@123");
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(3000);
		String expectedUrl = "facebook/login";
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		if (actualUrl.contains(expectedUrl)) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Home page is NOT displayed");
		}
		driver.close();
	}

	@Test
	public void verifyHomePageByUniqueElement() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement messanger = driver.findElement(By.xpath("//a[@title='Take a look at Messenger.']"));
		if (messanger.isDisplayed()) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Home page is NOT displayed");
		}
		driver.close();
	}
}
