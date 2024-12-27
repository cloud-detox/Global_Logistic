package globallogistic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class contact {
	String driverpath = "C:\\Users\\Samiksha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void navigate() throws InterruptedException {
		driver.get("https://globallogistic.co.in/");
		driver .manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 1)
	void contact() {
		WebElement C = driver.findElement(By.xpath("//span[normalize-space()='Contact']"));
        C.click();
	}
	
	@Test(priority = 2)
	void name() {
		WebElement N = driver.findElement(By.xpath("//input[@id='name']"));
        N.sendKeys("Samiksha");
	}
	
	@Test(priority = 3)
	void email() {
		WebElement E = driver.findElement(By.xpath("//input[@id='email']"));
        E.sendKeys("hello123@gmail.com");
	}
	
	@Test(priority = 4)
	void number() {
		WebElement N = driver.findElement(By.xpath("//input[@id='number']"));
        N.sendKeys("68588993485");
	}
	
	@Test(priority = 5)
	void subject() {
		WebElement S = driver.findElement(By.xpath("//input[@id='subject']"));
        S.sendKeys("Land Transport");
	}
	
	 @Test(priority = 6)
	void message() {
		WebElement M = driver.findElement(By.xpath("//textarea[@name=\"message\"]"));
        M.sendKeys("contact");
	}
	 
	@Test(priority = 7)
	 void submit() {
			WebElement S = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
            S.click();
            
	 }
	
	@Test(priority = 8)
	void go_back() {
		WebElement G = driver.findElement(By.xpath("//button[@class=\"mt-5 text-indigo-500 hover:underline dark:text-white focus:outline-none\"]"));
        G.click();
	}
	
	@Test(priority = 9)
	void email_globallogistic() {
		WebElement EG = driver.findElement(By.xpath("//a[@href=\"info@globallogistic.co.in\"]"));
        EG.click();
		driver.navigate().back();
	}
	
	

	@Test(priority = 10)
	void zoom_in() {
		WebElement Z = driver.findElement(By.xpath("//iframe[@src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3561.932075988799!2d80.87848407142037!3d26.778435014436443!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x399c40a9c2f36c41%3A0xa952e19b1c5a81d4!2sKanpur%20-%20Lucknow%20Rd%2C%20Transport%20Nagar%2C%20Lucknow%2C%20Uttar%20Pradesh!5e0!3m2!1sen!2sin!4v1717415783782!5m2!1sen!2sin\"]"));
        driver.switchTo().frame(Z);
		WebElement ZI = driver.findElement(By.xpath("//button[@aria-label=\"Zoom in\"]"));
        ZI.click(); 
	}
	@AfterTest()
	void close() {
	driver.quit();
}
	}
