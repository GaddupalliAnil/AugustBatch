package Verification;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoPractice {
	@BeforeClass
	public void beforeclass() {
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("BeforeMethod");
	}
	@Test
	public void testA() {
		System.out.println("Test A");
	}
	@Test
	public void testB() {
		System.out.println("Test B");
	}
	@Test
	public void testC() {
		System.out.println("Test C");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("AfterClass");
	}

}
