package global_logistic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class globalistic_contact {
	String driverPath = "C:\\Users\\h262545\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64";
	WebDriver driver = new ChromeDriver();
	
	
	@Test(priority=1)
	void navigate() {
		driver.manage().window().maximize();
		driver.get("https://globallogistic.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	@Test(priority=2)
	void contact() {
	WebElement img1 = driver.findElement(By.xpath("//span[normalize-space()='Contact']"));
	img1.click();
	WebElement img2 = driver.findElement(By.xpath("//input[@id='name']"));
	img2.sendKeys("Neha");
	WebElement img3 = driver.findElement(By.xpath("//input[@id='email']"));
	img3.sendKeys("npandey3670@gmail.com");
	WebElement img4 = driver.findElement(By.xpath("//input[@id='number']"));
	img4.sendKeys("9238923892");
	WebElement img5 = driver.findElement(By.xpath("//input[@id='subject']"));
	img5.sendKeys("maths");
	WebElement img6 = driver.findElement(By.xpath("//textarea[@id='message']"));
	img6.sendKeys("neha love charlie");
	WebElement img7 = driver.findElement(By.xpath("///button[@type='submit']"));
	img7.click();
	
	
	

	}
	@AfterTest
	void quit() {
		driver.quit();
}
}
