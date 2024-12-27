package globallogistic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class careers {
	String driverpath = "C:\\Users\\Samiksha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void navigate() throws InterruptedException {
		driver.get("https://globallogistic.co.in/");
		driver .manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
   
	@Test(priority = 1)
	void careers() {
		WebElement C = driver.findElement(By.xpath("//span[normalize-space()='Careers']"));
        C.click();
	}
	
	@Test(priority = 2)
	void your_name() {
		WebElement N = driver.findElement(By.xpath("//input[@name='your-name']"));
        N.sendKeys("Samiksha");
	}
	
	@Test(priority = 3)
	void your_email() {
		WebElement E = driver.findElement(By.xpath("//input[@name='your-email']"));
        E.sendKeys("hello123@gmail.com");
	}
	
	@Test(priority = 4)
	void contact_number() {
		WebElement CN = driver.findElement(By.xpath("//input[@name='tel-345']"));
        CN.sendKeys("5786667");
	}
	
	@Test(priority = 5)
	void upload_resume() {
		WebElement U = driver.findElement(By.xpath("//input[@name='file-877']"));
        U.sendKeys("C:\\Snapchat\\Snapchat-196951085.jpg");
	}
	
	@Test(priority = 6)
	void subject() {
		WebElement S = driver.findElement(By.xpath("//input[@name='your-subject']"));
        S.sendKeys("Air freight");
	}
	
	@Test(priority = 7)
	void your_message() {
		WebElement Y = driver.findElement(By.xpath("//textarea[@name='your-message']"));
        Y.sendKeys("Hello");
	}
	
	@Test(priority = 8)
	void send() {
		WebElement SE = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
        SE.click();
	}
	
	@AfterTest()
		void close() {
		driver.quit();
	}

}
