package global_logistic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class globalistic_service {
	String driverPath = "C:\\Users\\h262545\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64";
	WebDriver driver = new ChromeDriver();
	@Test(priority=1)
	void navigate() {
		driver.manage().window().maximize();
		driver.get("https://globallogistic.co.in/services.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	@Test(priority=2)
	void img1() {
		WebElement img1 = driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding first avia-builder-el-2 el_after_av_hr el_before_av_one_half avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
	img1.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.navigate().back();
	
	}
	@Test(priority=3)
	void img2() {
		WebElement img2 = driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding avia-builder-el-7 el_after_av_one_half el_before_av_one_half avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
	img2.click();
	driver.navigate().back();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	}
	@Test(priority=4)
	
	void img3() {
	WebElement img3 = driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding first avia-builder-el-12 el_after_av_one_half el_before_av_one_half column-top-margin avia_start_animation avia_start_delayed_animation')]//span[@class='image-overlay overlay-type-extern']"));
	img3.click();
	driver.navigate().back();
	
	
}
@Test(priority=5)
	
	void img4() {
	WebElement img4 = driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding first avia-builder-el-12 el_after_av_one_half el_before_av_one_half column-top-margin avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
	img4.click();
	driver.navigate().back();

	}
@Test(priority=6)

void img5() {
WebElement img5 = driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding avia-builder-el-17 el_after_av_one_half el_before_av_one_half column-top-margin avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
img5.click();
driver.navigate().back();
}
@Test(priority=7)

void img6() {
WebElement img6 = driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding first avia-builder-el-22 el_after_av_one_half el_before_av_one_half column-top-margin avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
img6.click();
driver.navigate().back();
}
@Test(priority=8)

void img7() {
WebElement img7 = driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding first avia-builder-el-22 el_after_av_one_half el_before_av_one_half column-top-margin avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
img7.click();
driver.navigate().back();
}
@Test(priority=9)

void img8() {
WebElement img8 = driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding first avia-builder-el-32 el_after_av_one_half el_before_av_one_half column-top-margin avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
img8.click();
driver.navigate().back();

}
@Test(priority=10)

void img9() {
WebElement img9 = driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding avia-builder-el-37 el_after_av_one_half avia-builder-el-last column-top-margin avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
img9.click();
driver.navigate().back();
}
}


