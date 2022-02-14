package week4.day1;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTables1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); // Open a new chrome browser
		driver.manage().window().maximize(); // Maximize the opened chrome browser window
		driver.get("https://erail.in/"); // Loads the URL in the opened browser
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement from = driver.findElement(By.id("txtStationFrom"));
		wait.until(ExpectedConditions.visibilityOf(from));
		from.clear();
		from.sendKeys("TPJ", Keys.TAB);

		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MDU", Keys.TAB);

		driver.findElement(By.id("chkSelectDateOnly")).click();

		// Finding element through a locator from a webpage
		WebElement elementTable = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));

		// Finding the row from the elementTable found
		List<WebElement> listRows = elementTable.findElements(By.tagName("tr"));

		// Iterating Rows from the table
		for (int i = 0; i < listRows.size(); i++) {
			WebElement currentRow = listRows.get(i);
			List<WebElement> listColumns = currentRow.findElements(By.tagName("td"));

			// Iterating Cols from the row
			for (int j = 0; j < listColumns.size(); j++) {
				System.out.println(listColumns.get(j).getText());
			}
		}

		/*
		 * List<WebElement> names = driver.findElements(By.
		 * xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]"));
		 * for (WebElement eachElement : names) {
		 * System.out.println(eachElement.getText()); }
		 */

	}
}
