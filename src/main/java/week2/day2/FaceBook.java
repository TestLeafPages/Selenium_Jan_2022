package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException  {
		
		//to setup the driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		driver.findElement(By.linkText("Create New Account")).click();
		
		//steps to select value from DropDown
		
		//java simple wait
		Thread.sleep(2000); //2 secs to wait
		
		//step1: locate the parent tag for the DropDown -> select
		WebElement day = driver.findElement(By.id("day"));
	
		//step2: Create object for Select class
		Select dd = new Select(day);
		
		//Step3: Select a option using visible text
		dd.selectByVisibleText("26");
		
		
		WebElement month = driver.findElement(By.id("month"));
		Select dd1 = new Select(month);
		//select using value
		//dd1.selectByValue("2");
		
		//select using index
		dd1.selectByIndex(1);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
