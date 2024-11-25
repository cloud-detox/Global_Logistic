package globallogistics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Contact {
	
	String driverPath = "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void navigate() {
		driver.get("https://globallogistic.co.in/About.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

}
	@Test(priority=1)
	void contact_page() {
		WebElement co=driver.findElement(By.xpath("//span[normalize-space()='Contact']"));
		co.click();
	}
	
	@Test(priority=2)
	void map() {
		WebElement map=driver.findElement(By.xpath("//a[@aria-label='View larger map']"));
		map.click();
	}
	
	@Test(priority=3)
	void name() {
		WebElement na=driver.findElement(By.xpath("//input[@id='name']"));
		na.sendKeys("Shivani Agrawal");
	}
	@Test(priority=4)
	void email() {
		WebElement em=driver.findElement(By.xpath("//input[@id='email']"));
		em.sendKeys("shivaniagrawal605@gmail.com");
		}
	
	@Test(priority=5)
	void number() {
		WebElement num=driver.findElement(By.xpath("//input[@id='number']"));
		num.sendKeys("9685888691");
		}
	
	@Test(priority=6)
	void subject() {
		WebElement sub=driver.findElement(By.xpath("//input[@id='subject']"));
		sub.sendKeys("services");
		}
	
	@Test(priority=7)
	void message() {
		WebElement mes=driver.findElement(By.xpath("//textarea[@id='message']"));
		mes.sendKeys("global logistics");
		}
	
	@Test(priority=8)
	void submit() {
		WebElement sub=driver.findElement(By.xpath("//button[@type='submit']"));
		sub.click();
		}
	
	@AfterTest
	void quit() {
		driver.quit();
	}
	
	
	
	
}