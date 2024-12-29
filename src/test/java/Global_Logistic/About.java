package Global_Logistic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class About {
	String driverPath = "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64.zip\\chromedriver-win64";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void Navigation()  {
		driver.get("https://globallogistic.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
	@Test(priority=1)
	void goToabout(){
	WebElement about=driver.findElement(By.xpath("//span[normalize-space()='About']")); 
	about.click();
	if (driver.getCurrentUrl().equals("https://globallogistic.co.in/About.html"));
	}
	
	
	
	
	

}
