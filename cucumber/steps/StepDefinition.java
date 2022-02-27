package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
public ChromeDriver driver;
	
	@Given("Open the chrome browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Given("Load the application url {string}")
	public void loadApplicationUrl(String url) {
		driver.get(url);
	}
	
	@Given("Enter the username as {string}")
	public void enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
		
	@Given("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("Click on Login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Homepage should be displayed")
	public void verifyHomePage() {
		
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		
		if(displayed) {
			System.out.println("Homepage is displayed");
		}else {
			System.out.println("Homepage is not displayed");
		}
	}
	
	
	@But("Error message should be displayed")
	public void verifyErrorMessage() {
		System.out.println("Error message is displayed");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
