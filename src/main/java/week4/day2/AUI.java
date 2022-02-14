package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AUI {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver(); // Open a new chrome browser
	driver.manage().window().maximize(); // Maximize the opened chrome browser window
	//driver.get("http://www.leafground.com/pages/drag.html"); // Loads the URL in the opened browser
	driver.get("http://www.leafground.com/pages/selectable.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement element1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	WebElement element2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
	WebElement element3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
	WebElement element4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
	
	Actions builder = new Actions(driver);
	builder.keyDown(Keys.CONTROL)
	.click(element1).click(element2)
	.click(element3).click(element4)
	.keyUp(Keys.CONTROL).perform();
	
	
	
//	WebElement element = driver.findElement(By.id("draggable"));
	//builder.dragAndDropBy(element, 100, 100).perform();
	
}
}
