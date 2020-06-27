package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chrome driver 83.0.4103.39\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}

	@Test(priority=1,groups="Title")
	public void googleTitleTest(){
		String title = driver.getTitle();
		System.out.println("title = " +title);
		int i = 9/0;
	}
	
	@Test(priority=2,groups="Logo",dependsOnMethods="googleTitleTest")
	public void googleLogoTest(){
		boolean logo = driver.findElement(By.xpath(".//*[@id='hplogo']")).isDisplayed();
		System.out.println("Logo found" +logo);
	}
	
	@Test(priority=3,groups="Title")
	public void mailTest(){
		boolean a = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
}
