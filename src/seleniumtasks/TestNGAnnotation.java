package seleniumtasks;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	
	// Test Case 1
	@Test
	public void testCase1(){
		System.out.println("This is test case 1");
	}
	
	// Test case 2
	@Test
	public void testCase2(){
		System.out.println("This is test case 2");
	}
	
	@BeforeMethod
	public void beforMethod(){
		System.out.println("This is Before Method");
	}
	
	@BeforeClass
	public void beforClass(){
		System.out.println("This is Before Class");
	}
	
	@AfterMethod
	public void beforeMethod(){
		System.out.println("This is After method");
	}
	
	@AfterClass
	public void aftrClass(){
		System.out.println("This is After Class");
	}

}
