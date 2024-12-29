package global_logistic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class globalistuc_about {
	String driverPath = "C:\\Users\\h262545\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@Test(priority=1)
	void navigate() {
		driver.manage().window().maximize();
		driver.get("https://globallogistic.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
@Test(priority=2)
	
	void about() {
		WebElement abc = driver.findElement(By.xpath("//span[normalize-space()='About']"));
		abc.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test(priority=3)

void pic() {
	WebElement abc = driver.findElement(By.xpath("//img[@alt='Ajay Pratap Singh']"));
	abc.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}

@Test(priority=4)

void pic1() {
	WebElement abc = driver.findElement(By.xpath("//img[@alt='Sharad_kumar_singh']"));
	abc.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}

@Test(priority=5)

void pic2() {
	WebElement abc = driver.findElement(By.xpath("//h3[normalize-space()='Global Logistic Service']"));
	abc.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}

@Test(priority=6)

void Scroll() {
	WebElement abc = driver.findElement(By.xpath("//a[@id='scroll-top-link']"));
	abc.click();
	

}
}
