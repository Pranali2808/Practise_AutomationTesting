package actioncalss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropdownMenu {
	    @Test
	    public void  dropdownMenu(){
	        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	        String xp = "//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]";
	        WebElement menu = driver.findElement(By.xpath(xp));
	        Actions actions = new Actions(driver);
	        actions.moveToElement(menu).perform();
	        WebElement submenu = driver.findElement(By.linkText("Sign Up"));
	        submenu.click();
	        driver.close();
	    }
}
