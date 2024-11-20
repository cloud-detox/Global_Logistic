package global_logistics_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class glolog_about {
		
		String driverPath= "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		WebDriver driver = new ChromeDriver();
		
		@BeforeMethod
		void navigate(){
			driver.get("https://globallogistic.co.in/");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
		}
		
		@Test
		void about() {
			WebElement ab=driver.findElement(By.xpath("//span[normalize-space()='About']"));
			ab.click();
		}
}
