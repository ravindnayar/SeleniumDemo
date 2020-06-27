package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestData {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chrome driver 83.0.4103.39\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://reg.ebay.com/reg/PartialReg?rv4=1");
		
	}
	
	@Test
	public void testcase(String firstname, String lastname, String email, String password){
		driver.findElement(By.xpath(".//*[@id='firstname']")).clear();
		driver.findElement(By.xpath(".//*[@id='firstname']")).sendKeys(firstname);
		
		driver.findElement(By.xpath(".//*[@id='lastname']")).clear();
		driver.findElement(By.xpath(".//*[@id='lastname']")).sendKeys(lastname);
		
		driver.findElement(By.xpath(".//*[@id='email']")).clear();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(email);
		
		driver.findElement(By.xpath(".//*[@id='PASSWORD']")).clear();
		driver.findElement(By.xpath(".//*[@id='PASSWORD']")).sendKeys(password);	
		
		driver.findElement(By.xpath(".//*[@id='ppaFormSbtBtn']")).click();
	}
	
	
	
	
	
	@AfterTest
	public void tearDown(){
		driver.close();
	}

}
