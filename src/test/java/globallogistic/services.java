package globallogistic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class services {
	String driverpath = "C:\\Users\\Samiksha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void navigate() throws InterruptedException {
		driver.get("https://globallogistic.co.in/");
		driver .manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	
    }
	
	@Test(priority = 1)
	void services() {
		WebElement S = driver.findElement(By.xpath("(//span[@class=\"avia-menu-text\"])[1]"));
        S.click();
	}
	
	@Test(priority = 2)
	void international_frieght() throws InterruptedException {
		WebElement I = driver.findElement(By.xpath("(//span[@class=\"image-overlay overlay-type-extern\"])[1]"));
        I.click();
        Thread.sleep(2000);
        driver.navigate().back();
	}
	
	@Test(priority = 3)
	void air_frieght() throws InterruptedException {
		WebElement A = driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding avia-builder-el-7 el_after_av_one_half el_before_av_one_half avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
        A.click();
        Thread.sleep(2000);
        driver.navigate().back();
	}
	
	@Test(priority = 4)
	void sea_frieght() throws InterruptedException {
		WebElement SE = driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding first avia-builder-el-12 el_after_av_one_half el_before_av_one_half column-top-margin avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
        SE.click();
        Thread.sleep(2000);
        driver.navigate().back();
	}
	
	@Test(priority = 5)
	void land_transportation() throws InterruptedException {
		WebElement L = driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding avia-builder-el-17 el_after_av_one_half el_before_av_one_half column-top-margin avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
        L.click();
        Thread.sleep(2000);
        driver.navigate().back();
	}
	@AfterTest()
	void close() {
	driver.quit();
}
}
