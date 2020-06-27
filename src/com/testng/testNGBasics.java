package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGBasics {
	
	@BeforeSuite
	public void setup(){
		System.out.println("setup system property for chrome");
	}
	
	@BeforeTest
	public void login(){
		System.out.println("login method");
	}
	
	
	@BeforeClass
	public void launchBrowser(){
		System.out.println("Launch chrome browser");
	}
	
	@BeforeMethod
	public void enterURL(){
		System.out.println("enter url");
	}
	

	@Test
	public void googleTitleTest(){
		System.out.println("google title test");
	}
	
	@Test
	public void Titletest(){
		System.out.println("test 2");
	}
	
	@AfterMethod
	public void logout(){
		System.out.println("logout method");
	}
	
	@AfterClass
	public void closeBrwser(){
		System.out.println("close browser");
	}
	
	@AfterTest
	public void deleteAllCookies(){
		System.out.println("delete all cookies");
	}
	
	@AfterSuite
	public void generateTestReport(){
		System.out.println("generate test report");
	}
}
