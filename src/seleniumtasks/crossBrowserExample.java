package seleniumtasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.google.common.base.Throwables;

public class crossBrowserExample {
	
	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		
		if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chrome driver 83.0.4103.39\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", "D:\\Selenium\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		else{
			throw new Exception("Browser is  not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	@Test
	public void testParamter(){
		driver.get("http://www.edureka.co/");
		WebElement login = driver.findElement(By.linkText("Login")));
	}
	}
}
