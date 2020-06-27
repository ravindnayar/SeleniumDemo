package seleniumtasks;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestNGExample {

	public static WebDriver driver;
	
	@BeforeTest
	public void Setup(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chrome driver 83.0.4103.39\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseUrl = "http://facebook.com";
		System.out.println("Launching Chrome Browser");
		driver.get(baseUrl);
	}
	
	
	@Test
	public void verifyHomePageTitle(){
		
		String expectedTitle="Facebook – log in or sign up";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void terminateBrowser(){
		driver.close();
	}
	
		}


