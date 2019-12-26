package way2automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void doLogin()
	{
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("ssiddharth387@gmail.com");
		//driver.findElement(By.id("Passwd")).sendKeys("8871869733");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
	}	
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
}
