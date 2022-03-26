package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnTestNG {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Running Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Opening Browser");
	}
	
	@Test(priority = 1)
	public void printHelloWorld() {
		System.out.println("Hello World");
		Assert.fail();
	}
	
	@Test(priority = 2, dependsOnMethods = "printHelloWorld")
	public void printHelloGalaxy() {
		System.out.println("Hello Galaxy");
	}
	
	@Test(priority = 3)
	public void printHelloUniverse() {
		System.out.println("Hello Universe");
	}
			
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Closing Browser");
	}

}
