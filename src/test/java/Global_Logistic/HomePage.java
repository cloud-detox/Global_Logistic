package Global_Logistic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class HomePage {
	
	String driverPath = "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	
	void navigate() {
	driver.get("https://globallogistic.co.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	}
	
	@Test(priority=1)
	
	void HM1() {
	WebElement HOME_BUTTON = driver.findElement(By.xpath("//span[normalize-space()='Home']"));
	HOME_BUTTON.click();
	}
	
	@Test(priority=2)
	
	void HM2() {
	WebElement WHO1= driver.findElement(By.xpath("//a[@class='avia-slideshow-button avia-button avia-color-light avia-multi-slideshow-button']"));
	WHO1.click();

           }
	
	void HM3() {
		WebElement WHO2= driver.findElement(By.xpath("//a[@class='avia-slideshow-button avia-button avia-color-light avia-multi-slideshow-button']"));
		WHO2.click();
	
       }
}

