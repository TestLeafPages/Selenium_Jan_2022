package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver(); // Open a new chrome browser
	driver.manage().window().maximize(); // Maximize the opened chrome browser window
	driver.get("https://jqueryui.com/selectable/"); // Loads the URL in the opened browser
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement elementframe = driver.findElement(By.className("demo-frame"));
//	driver.switchTo().frame(5); // index starts with 0
	//driver.switchTo().frame(""); // string can be id or name attribute value of iframe tag
	driver.switchTo().frame(elementframe);
	driver.findElement(By.xpath("//li[text()='Item 1']")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Download")).click();
}
}
