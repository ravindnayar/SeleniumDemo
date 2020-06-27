package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AssertionExample {

	WebDriver driver;
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chrome driver 83.0.4103.39\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
	}
	
	@Test(priority=1)
	public void facebookTitle(){
	//boolean title	= driver.findElement(By.xpath(.//*[@id="pageTitle"])).isDisplayed();
	String title = driver.getTitle();
	System.out.println("Title is " + title);
	Assert.assertEquals(title, "Facebook – log in or sign up");
	
	}
	
	@Test(priority=2)
	public void logo(){
		boolean a = driver.findElement(By.xpath(".//*[@class='fb_logo img sp_iweMvYcNOXG sx_c594d5']")).isDisplayed();
		Assert.assertTrue(a);
	}
	
	@AfterTest
	public void tearDown(){
		driver.close();
	}
	
}
