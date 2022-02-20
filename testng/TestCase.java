package testcase;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class TestCase {

//	@Test(groups= {"Regression","Smoke"})
	@Test(expectedExceptions = NoSuchElementException.class)
	public void createLead() {
		System.out.println("Create Lead");
		throw new NoSuchElementException("Element not Found");
	}

	@Test(groups = "Smoke")
	public void editLead() {
		System.out.println("Edit Lead");
		throw new RuntimeException();
	}

	@Test(dependsOnMethods = "editLead", dependsOnGroups = "Smoke", groups="Regression")
	public void deleteLead() {
		System.out.println("Delete Lead");
	}

}
