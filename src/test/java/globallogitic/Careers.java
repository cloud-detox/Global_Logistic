package globallogitic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Careers {
	String driverPath = "C:\\Users\\dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";	
	WebDriver driver=new ChromeDriver();

	@BeforeTest
	void n() throws InterruptedException {
	driver.get("https://globallogistic.co.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
	
	@Test (priority=1)
	void careers() {
		WebElement s=driver.findElement(By.xpath("//span[normalize-space()='Careers']"));
		s.click();
		
		}
	
	
	@Test (priority=2)
	void your_name() throws InterruptedException {
		WebElement yn=driver.findElement(By.xpath("//input[@name='your-name']"));
        yn.sendKeys("palak");
        
	}
	
	
	@Test (priority=3)
	void mail_id() {
		WebElement ei=driver.findElement(By.xpath("//input[@name='your-email']"));
		ei.sendKeys("palakshukla3230@gmail.com");
	}
	
	@Test (priority=4)
	void contact_n() {
		WebElement cn=driver.findElement(By.xpath("//input[@name='tel-345']"));
		cn.sendKeys("8303043230");
	
}
	@Test (priority=5)
	void subject() {
		WebElement s=driver.findElement(By.xpath("//input[@name='your-subject']"));
		s.sendKeys("Application for Software Tester");
}
	@Test (priority=6)
	void your_msz() {
		WebElement ym=driver.findElement(By.xpath("//textarea[@name='your-message']"));
	ym.sendKeys("Because I am fit for this position");
	}
	
	@Test(priority=7)
	void send() {
		WebElement se=driver.findElement(By.xpath("//input[@value='Send']"));
	se.click();

	}
	
	@AfterTest
	void Close() {
		driver.quit();
}
}
