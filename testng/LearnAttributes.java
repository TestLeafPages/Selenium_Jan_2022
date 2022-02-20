package testcase;

import org.testng.annotations.Test;

public class LearnAttributes {

	@Test(priority=-1, invocationCount = 10, threadPoolSize = 2)
	public void createLead() {
		System.out.println("Create Lead");
	}
	
	@Test(priority=2, enabled=false)
	public void editLead() {
		System.out.println("Edit Lead");
	}
	
	@Test(enabled=false)
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
}
