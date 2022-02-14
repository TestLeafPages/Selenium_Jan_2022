package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver(); // Open a new chrome browser
	driver.manage().window().maximize(); // Maximize the opened chrome browser window
	driver.get("http://www.leafground.com/pages/Alert.html"); // Loads the URL in the opened browser
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	//driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	Alert alert = driver.switchTo().alert();
	String text = alert.getText();
	System.out.println(text);
	alert.sendKeys("Balaji");
	alert.accept();
	
}
}
