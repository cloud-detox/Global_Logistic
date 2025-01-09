package global_logistic;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest { String driverPath = "C:\\Users\\HARSH SHARMA\\Downloads\\chromedriver-win64\\chromedriver.exe";
WebDriver driver = new ChromeDriver();
	
	
	@BeforeTest
	void navigate() {
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	@Test(priority=2)
	void username() {
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("Admin");
	}
	@Test(priority=3)
	void passward() {
		WebElement passward = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passward.sendKeys("admin123");
	}
	@Test(priority=4)
	void login() {
		WebElement login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		login.click();
	}
	@AfterTest
	void close() {
		driver.quit();
	}
}