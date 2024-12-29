package global_logistic;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Homepage {
	String driverPath = "C:\\Users\\h262545\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	

	@BeforeTest
	void navigate() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	}
	@Test(priority=2)
	void username() {
		WebElement abc = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		abc.sendKeys("admin");
	}
	
	@Test(priority=3)
	void pwd() {
		WebElement pw = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pw.sendKeys("admin123");
		
	}
	@Test(priority=4)
	void login() {
		WebElement lo = driver.findElement(By.xpath("//button[@type='submit']"));
		lo.click();
		
	}
	@AfterTest
	void close() {
		driver.close();
	}
	
	
}
