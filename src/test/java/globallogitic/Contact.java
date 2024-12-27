package globallogitic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Contact {
	String driverPath = "C:\\Users\\dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";	
	WebDriver driver=new ChromeDriver();

	@BeforeTest
	void n() throws InterruptedException {
	driver.get("https://globallogistic.co.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	
	@Test (priority=1)
		void contact() {
			WebElement c=driver.findElement(By.xpath("//span[normalize-space()='Contact']"));
			c.click();
	}
	
	@Test (priority=2)
	void zoom_in() {
		WebElement z=driver.findElement(By.xpath("//button[@aria-label=\"Zoom in\"]"));
		z.click();
}
	
	@Test (priority=3)
	void name() {
		WebElement n=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		n.sendKeys("palak");
}
	
	@Test (priority=4)
	void email() {
		WebElement e=driver.findElement(By.xpath("//input[@type=\"email\"]"));
		e.sendKeys("xyz@gmail.com");
}
	
	@Test (priority=5)
	void number() {
		WebElement n=driver.findElement(By.xpath("//input[@type=\"number\"]"));
		n.sendKeys("9999999999");
}
	
	@Test (priority=6)
	void subject() {
		WebElement su=driver.findElement(By.xpath("//input[@id='subject']"));
	    su.sendKeys("Application for Software Tester");
}
	
	@Test (priority=7)
	void msz() {
		WebElement m=driver.findElement(By.xpath("//textarea[@id=\"message\"]"));
	    m.sendKeys("Because I am fit for this position");
	}
	
	
	@Test (priority=8)
	void submit() {
		WebElement sd=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	    sd.click();
}
	
	@Test (priority=9)
	void go_number() {
		WebElement gb=driver.findElement(By.xpath("//button[@class='mt-5 text-indigo-500 hover:underline dark:text-white focus:outline-none']"));
	    gb.click();
	}
	
	@AfterTest
	void Close() {
		driver.quit();
}
}