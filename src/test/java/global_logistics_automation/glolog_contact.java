package global_logistics_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class glolog_contact {
	String driverPath= "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
    @BeforeTest
	void navigate(){
		driver.get("https://globallogistic.co.in/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test
	void contact() {
		WebElement con=driver.findElement(By.xpath("//span[normalize-space()='Contact']"));
		con.click();
	}
	
	@Test
	void map() {
		WebElement map=driver.findElement(By.xpath("//[title=@\"Zoom in\"]"));
		map.click();
	}
	
	@Test
	void name() {
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Krupa Nag");
	}	
	
	@Test
	void mail() {
		WebElement mail=driver.findElement(By.xpath("//input[@id='email']"));
		mail.sendKeys("krupanag07@gmail.com");
	}	
	@Test
	void number() {
		WebElement num=driver.findElement(By.xpath("//input[@id='number']"));
		num.sendKeys("9663716108");
	}
	
	@Test
	void subject() {
		WebElement sub=driver.findElement(By.xpath("//input[@id='subject']"));
		sub.sendKeys("Computer Science");
	}
	
	@Test
	void message() {
		WebElement mes=driver.findElement(By.xpath("//textarea[@id='message']"));
		mes.sendKeys("Hey,Thank You");
	}
	
	@Test
	void submit() {
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
	}
}

