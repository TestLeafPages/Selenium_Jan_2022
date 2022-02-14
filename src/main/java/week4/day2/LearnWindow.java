package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindow {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver(); // Open a new chrome browser
	driver.manage().window().maximize(); // Maximize the opened chrome browser window
	driver.get("http://www.leafground.com/pages/Window.html"); // Loads the URL in the opened browser
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	

	String windowaHandle = driver.getWindowHandle();
	System.out.println(windowaHandle);
	driver.findElement(By.id("home")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	
	for (String eachWindow : windowHandles) {
		driver.switchTo().window(eachWindow);
		driver.getCurrentUrl();
		break;
	}
	
	driver.switchTo().newWindow(WindowType.TAB);
	
	List<String> list = new ArrayList<String>(windowHandles);
	String secondWindow = list.get(1); // ref of second window
	driver.switchTo().window(secondWindow); // switching to second window using the reference
	System.out.println(driver.getCurrentUrl());
	driver.switchTo().window(list.get(0)); // switching to the first page using winhandle
	System.out.println(driver.getCurrentUrl());
	
	
	
	
	
	
	
}
}
