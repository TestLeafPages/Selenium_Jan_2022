package challenges;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		// chrome browser
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		
		// maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// load the browser with url
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22536");
		
		WebElement uploadResume = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		
		driver.executeScript("arguments[0].scrollIntoView();", uploadResume);
		
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\dell\\SeleniumNov-Workspace\\SeleniumLearning\\data\\Sudarshan - Lead.docx");
		
		//Thread.sleep(10000);
		
		//WebElement ele = driver.findElement(By.xpath("//p[text()='Interview questions by company']"));
		
		//driver.executeScript("scroll(0,250); ");
		
		//driver.executeScript("arguments[0].scrollIntoView();", ele);
		
		//WebElement jobElement = driver.findElement(By.linkText("Create Job Alert"));
		

		//int y = driver.findElementByLinkText("Create Job Alert").getLocation().getY();
		
		//scroll till the given element is visible
		//driver.executeScript("arguments[0].scrollIntoView();", jobElement);
		
		//Thread.sleep(5000);
		//driver.executeScript("arguments[0].click();", jobElement);
		
		//scroll upto 1000 pixels vertically
		//driver.executeScript("scroll(0,250); ");
		
		//Thread.sleep(5000);
		//driver.executeScript("scroll(0,-250); ");
		
		//Scroll upto 1000 pixels horizontally
		//driver.executeScript("scroll(1000,0)");
		
		
		//WebElement loginButton = driver.findElementByClassName("decorativeSubmit");
		
		//driver.executeScript("arguments[0].click();", loginButton);
		
		
		
		//driver.executeScript(script, args)
		
		//Way1						  //x,y
	//	driver.executeScript("scroll(0,"+y+");");

		

		// Way 2
		/*Actions builder = new Actions(driver);
		builder.sendKeys(Keys.PAGE_DOWN).build().perform();	*/	
		
		

	}
}



