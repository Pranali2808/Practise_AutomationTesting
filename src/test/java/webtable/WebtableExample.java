package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebtableExample {
	@Test
	public void webtable() {
	System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("file:///C:/Users/ranep/Desktop/cqa/webtable.html");
    List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
    int totalRows = allRows.size();
    System.out.println("total number of rows present in the table is :"+ totalRows);
    List<WebElement> allColumns = driver.findElements(By.xpath("//th"));
    int totalColumns = allColumns.size();
    System.out.println("Total number of columns in the table is :" + totalColumns);
    List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
    int totalCells = allCells.size();
    System.out.println("Total number of cells present in the table is :" + totalCells);
    int countNumberValue = 0;
    int sum=0;
    for (WebElement cell : allCells) {
        String cellValue = cell.getText();
        try{
            int number = Integer.parseInt(cellValue);
            System.out.print(" "+number);
            countNumberValue++;
            sum = sum+number;
        }catch (Exception e) {
        }
    }
    System.out.println("Total count of numeric values is :"+countNumberValue);
    System.out.println("Total sum of all the numeric values is :"+sum);
    driver.close();
}
}
