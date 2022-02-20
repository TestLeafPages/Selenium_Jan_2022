package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAnnotations2 extends Baseclass{
  
  @Test
  public void test2() {
	  System.out.println("In Test2 function");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class2");
  }

}
