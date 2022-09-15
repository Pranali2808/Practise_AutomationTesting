package nokarisiteelementbyxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ElementByXpath {
	@Test
	public void loginPageOfNokariSite() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		//driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//a[starts-with(text(),'Login')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	public void registerPageOfNokariSite() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Misspellings&gclid=CjwKCAjwsfuYBhAZEiwA5a6CDLMGco9l5pEINkgcWs1gUs7_PLJy5UQpjrvJnH0-SoHbMqIwIElDTxoCEB8QAvD_BwE&gclsrc=aw.ds");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Pranali Sanjay Rane");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prashirane@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Prashi@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8446251025");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Upload Resume')]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(3000);
	    driver.close();
}
}
