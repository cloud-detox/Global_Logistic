package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Global_Logistic.CareerPage;

public class TC001CareerTest {
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://globallogistic.co.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void verify_career() {
		CareerPage cp= new CareerPage(driver);
		cp.career();
		cp.detail();
		cp.uploadFile();
		
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}

