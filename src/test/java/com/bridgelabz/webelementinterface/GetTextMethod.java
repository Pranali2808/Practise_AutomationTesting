package com.bridgelabz.webelementinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetTextMethod {
	@Test
	public static void getText() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		Boolean bool = login.isDisplayed();
		System.out.println(bool);
		String text = login.getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.close();

	}
}
