package globallogitic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Services {
	String driverPath = "C:\\Users\\dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";	
	WebDriver driver=new ChromeDriver();

	@BeforeTest
	void navigate() throws InterruptedException {
	driver.get("https://globallogistic.co.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
	@Test (priority=1)
	void services() {
		WebElement s=driver.findElement(By.xpath("//span[normalize-space()='Services']"));
		s.click();
	}
	
	@Test (priority=2)
	void International_freight() {
		WebElement iff=driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding first avia-builder-el-2 el_after_av_hr el_before_av_one_half avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
		iff.click();
		driver.navigate().back();
	}
	
	
	@Test (priority=3)
	void Air_freight() {
		WebElement af=driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding avia-builder-el-7 el_after_av_one_half el_before_av_one_half avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
		af.click();
	}
	
	@AfterTest
	void Close() {
		driver.quit();
}
}