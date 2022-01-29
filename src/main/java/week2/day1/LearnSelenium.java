package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSelenium {
	public static void main(String[] args) {
		// To build a relationship between selenium and driver file
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		// To open a chrome browser
		ChromeDriver driver = new ChromeDriver();
		// To load an url to the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		// To maximize the browser
		driver.manage().window().maximize();
		// Trying to find the element
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		// To close the browser
//		driver.close();
	}
}
