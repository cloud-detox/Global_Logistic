package globallogistics;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Carrers {
	
	String driverPath = "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void navigate() {
		driver.get("https://globallogistic.co.in/About.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test(priority=-1)
	void carrer() {
		WebElement ca=driver.findElement(By.xpath("//span[normalize-space()='Careers']"));
		ca.click();
	}
	
	@Test(priority=0)
	void name() {
		WebElement na=driver.findElement(By.xpath("//input[@name='your-name']"));
		na.sendKeys("Shivani Agrawal");
		}
	
	@Test(priority=3)
	void email() {
		WebElement em=driver.findElement(By.xpath("//input[@name='your-email']"));
		em.sendKeys("shivaniagrawal605@gmail.com");
		}
	
	@Test(priority=4)
	void contact() {
		WebElement con=driver.findElement(By.xpath("//input[@name='tel-345']"));
		con.sendKeys("9685888691");
		}
	
	@Test(priority=5)
	void subject() {
		WebElement sub=driver.findElement(By.xpath("//input[@name='your-subject']"));
		sub.sendKeys("services");
		}
	
	@Test(priority=6)
	void message() {
		WebElement mes=driver.findElement(By.xpath("//textarea[@name='your-message']"));
		mes.sendKeys("global logistics");
		}
	
	@Test(priority=7)
	void send() {
		WebElement se=driver.findElement(By.xpath("//input[@value='Send']"));
		se.click();
		}
	
	@AfterTest
	void quit() {
		driver.quit();
	}
	

}
