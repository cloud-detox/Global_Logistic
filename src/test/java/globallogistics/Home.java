package globallogistics;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Home {
	String driverPath = "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void navigate() throws InterruptedException {
		driver.get("https://globallogistic.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
    
	@Test(priority=0)
	void whoweare() {
		WebElement who=driver.findElement(By.xpath("//a[@class='avia-slideshow-button avia-button avia-color-light avia-multi-slideshow-button']"));
		who.click();
	}
	@Test(priority=1)
	void global() {
		WebElement gl=driver.findElement(By.xpath("//img[@alt='Global Logistic Service']"));
		gl.click();
		
	}
	@Test(priority=2)
	void whatwedo() {
		WebElement what=driver.findElement(By.xpath("//a[@class='avia-slideshow-button avia-button avia-color-theme-color avia-multi-slideshow-button avia-slideshow-button-2']"));
		what.click();
		}
	
	@Test(priority=3)
	void glo() {
		WebElement glo=driver.findElement(By.xpath("//img[@alt='Global Logistic Service']"));
		glo.click();
	}
	
	@Test(priority=4)
	void quote() {
		WebElement quote=driver.findElement(By.xpath("//span[@class='avia_iconbox_title']"));
		quote.click();
		}
	
	@Test(priority=5)
	void map() {
		WebElement map=driver.findElement(By.xpath("//button[@class=\"gm-inset-map gm-inset-dark\"]"));
		map.click();
		}
	
	@Test(priority=6)
	void name() {
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Shivani Agrawal");
		}
	
	@Test(priority=7)
	void email() {
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("shivaniagrawal605@gmail.com");
		}
	@Test(priority=8)
	void number() {
		WebElement no=driver.findElement(By.xpath("//input[@id='number']"));
		no.sendKeys("9685888691");
		}
	@Test(priority=9)
	void subject() {
		WebElement sub=driver.findElement(By.xpath("//input[@id='subject']"));
		sub.sendKeys("Air freight");
		}
	@Test(priority=10)
	void message() {
		WebElement mes=driver.findElement(By.xpath("//textarea[@id='message']"));
		mes.sendKeys("Air freight");
		}
	@Test(priority=11)
	void submit() {
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		}
	@AfterTest
	void quit() {
		driver.quit();
	}
	
	

}
