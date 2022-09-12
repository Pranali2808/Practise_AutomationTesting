package com.bridgelabz.webelementinterface;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetCSSValueMethod {
	@Test
	public static void getCSSValue() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		Boolean bool = login.isDisplayed();
		System.out.println(bool);
		String css = login.getCssValue("#");
		System.out.println(css);
		Thread.sleep(2000);
		driver.close();
	}
}
