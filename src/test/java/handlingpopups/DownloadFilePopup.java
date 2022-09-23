package handlingpopups;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class DownloadFilePopup {
	@Test
	public void downloadFileByPopUp() {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		String key = "browser.helperApps.neverAsk.saveToDisk";
		String value = "application/zip";
		profile.setPreference(key, value);
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.dir", "c:\\");
	}
	@Test
	public void auto_It() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.freepdfconvert.com/pdf-to-word");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Choose PDF file')]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\Autoit\\autoitexample.exe");
		Thread.sleep(3000);
		driver.close();
	}
}
