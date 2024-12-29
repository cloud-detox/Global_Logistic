package global_logistic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class globalistic_carrer {
	String driverPath = "C:\\Users\\h262545\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64";
	WebDriver driver = new ChromeDriver();
	@Test(priority=1)
	void navigate() {
		driver.manage().window().maximize();
		driver.get("https://globallogistic.co.in/careers.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
	@Test(priority=2)
	void img1() {
	WebElement img1 = driver.findElement(By.xpath("//input[@name='your-name']"));
	img1.sendKeys("Neha");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
}
	@Test(priority=3)
	void img2() {
	WebElement img1 = driver.findElement(By.xpath("//input[@name='your-email']"));
	img1.sendKeys("npandey3670@gmail.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
}
	@Test(priority=4)
	void img3() {
	WebElement img1 = driver.findElement(By.xpath("//input[@name='tel-345']"));
	img1.sendKeys("9393903333");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
	@Test(priority=5)
	void img4() {
	WebElement img1 = driver.findElement(By.xpath("//input[@name='file-877']"));
	img1.sendKeys("C:\\Users\\h262545\\Downloads\\AC.PNG");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
}
	@Test(priority=6)
	void img5() {
	WebElement img1 = driver.findElement(By.xpath("//input[@name='your-subject']"));
	img1.sendKeys("hello world!");
	
	
}
	@Test(priority=7)
	void img6() {
	WebElement img1 = driver.findElement(By.xpath("//textarea[@name='your-message']"));
	img1.sendKeys("Neha loves Anirudh Chaudhary");
		
}
	@Test(priority=8)
	void img7() {
	WebElement img1 = driver.findElement(By.xpath("//input[@value='Send']"));
	img1.click();	
}
}
