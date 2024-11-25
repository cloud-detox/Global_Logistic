package globallogistics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Services {
	
	String driverPath = "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void navigate() throws InterruptedException {
		driver.get("https://globallogistic.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	void services() {
	WebElement se=driver.findElement(By.xpath("//span[normalize-space()='Services']"));
	se.click();
	}
	
	
	@Test(priority=3)
	void search() {
		WebElement se=driver.findElement(By.xpath("//div[@class='avia-menu av-main-nav-wrap']//ul[@id='avia-menu']//li[@id='menu-item-search']//a[@href='?s=']"));
		se.click();
		}
	
	@Test(priority=4)
	void search1() {
	WebElement search=driver.findElement(By.xpath("//input[@id='s']"));
	search.sendKeys("Services");
	}
	
	@Test(priority=5)
	void searchsubmit() {
		WebElement search=driver.findElement(By.xpath("//input[@id='searchsubmit']"));
		search.click();
		}
	
	@AfterTest
	void quit() {
		driver.quit();
	}

}
