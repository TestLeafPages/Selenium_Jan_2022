package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFindElements {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();	// Open a new chrome browser
	driver.manage().window().maximize();		// Maximize the opened chrome browser window
	driver.get("https://www.amazon.in/");		// Loads the URL in the opened browser
	
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("OnePlus Mobiles",Keys.ENTER);
	
	// Finding multiple elements on a single method
	List<WebElement> mobileNames = driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//h2"));
	for (WebElement eachElement : mobileNames) {
		System.out.println(eachElement.getText());
	}
		
	System.out.println(search.getAttribute("value"));
}
}
