package com.robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RobotClass {
	@Test
	public static void verifyKeyboard_Mouse_Operations() throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Robot robot = new Robot();
		robot.mouseMove(300, 500);
		robot.mouseWheel(3);
		robot.keyPress(KeyEvent.VK_8);
		robot.keyRelease(KeyEvent.VK_8);
		robot.keyPress(KeyEvent.VK_4);
		robot.keyRelease(KeyEvent.VK_4);
		robot.keyPress(KeyEvent.VK_4);
		robot.keyRelease(KeyEvent.VK_4);
		robot.keyPress(KeyEvent.VK_6);
		robot.keyRelease(KeyEvent.VK_6);
		robot.keyPress(KeyEvent.VK_1);
		robot.keyRelease(KeyEvent.VK_1);
		robot.keyPress(KeyEvent.VK_5);
		robot.keyRelease(KeyEvent.VK_5);
		robot.keyPress(KeyEvent.VK_1);
		robot.keyRelease(KeyEvent.VK_1);
		robot.keyPress(KeyEvent.VK_0);
		robot.keyRelease(KeyEvent.VK_0);
		robot.keyPress(KeyEvent.VK_1);
		robot.keyRelease(KeyEvent.VK_1);
		robot.keyPress(KeyEvent.VK_8);
		robot.keyRelease(KeyEvent.VK_8);
		// driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8446151018");
		// driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Prashi@123");
		Thread.sleep(3000);
		driver.close();
	}
}
