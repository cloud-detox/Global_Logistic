package global_logistics_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class glolag_careers {
	
	String driverPath= "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
    @BeforeTest
	void navigate(){
		driver.get("https://globallogistic.co.in/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test
	void car() {
		WebElement car=driver.findElement(By.xpath("//span[normalize-space()='Careers']"));
		car.click();
	}
	
	@Test
	void name() {
		WebElement name=driver.findElement(By.xpath("//input[@name='your-name']"));
		name.sendKeys("Krupa Nag");
	}
	
	@Test
	void mail() {
		WebElement mail=driver.findElement(By.xpath("//input[@name='your-email']"));
		mail.sendKeys("krupanag07@gmail.com");
	}
	
	@Test
	void number() {
		WebElement num=driver.findElement(By.xpath("//input[@name='tel-345']"));
		num.sendKeys("9663716108");
	}
	
	@Test
	void subject() {
		WebElement sub=driver.findElement(By.xpath("//input[@name='your-subject']"));
		sub.sendKeys("Computer Science");
	}
	
	@Test
	void message() {
		WebElement mes=driver.findElement(By.xpath("//textarea[@name='your-message']"));
		mes.sendKeys("Hey,Thank You");
	}
	
	@Test
	void send() {
		WebElement send=driver.findElement(By.xpath("//input[@value='Send']"));
		send.click();
	}
}
	
	
	

