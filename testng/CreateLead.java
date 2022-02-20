package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends Baseclass {
	
	@BeforeClass
	public void setData() {
		fileName = "CreateLead";
	}

	@Test(dataProvider = "createLeadData")
	public void createLead(String cName, String fName, String lName) {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
	}

	/*
	 * @DataProvider(name="createLeadData", indices = 1) public String[][]
	 * sendData() throws IOException {
	 * 
	 * String[][] data = new String[2][3];
	 * 
	 * data[0][0] = "Qeagle"; data[0][1] = "Hari"; data[0][2] = "R";
	 * 
	 * data[1][0] = "TestLeaf"; data[1][1] = "Haja"; data[1][2] = "J";
	 * 
	 * return ReadExcel.readData("CreateLead");
	 * 
	 * }
	 */

}
