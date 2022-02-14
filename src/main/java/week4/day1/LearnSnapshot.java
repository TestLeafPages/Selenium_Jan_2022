package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSnapshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); // Open a new chrome browser
		driver.manage().window().maximize(); // Maximize the opened chrome browser window
		driver.get("https://erail.in/"); // Loads the URL in the opened browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement from = driver.findElement(By.id("txtStationFrom123"));
		Thread.sleep(3000);
		File source = from.getScreenshotAs(OutputType.FILE);
		File dest = new File("./src/main/resources/snaps/Img002.jpg");
		FileUtils.copyFile(source, dest);
		/*
		 * File source = driver.getScreenshotAs(OutputType.FILE); File dest = new
		 * File("./src/main/resources/snaps/Img001.jpg"); FileUtils.copyFile(source,
		 * dest);
		 */
	}
}
