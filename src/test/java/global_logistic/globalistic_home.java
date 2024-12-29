package global_logistic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class globalistic_home {
	String driverPath = "C:\\Users\\h262545\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate() {
		driver.manage().window().maximize();
		driver.get("https://globallogistic.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	@Test(priority=2)
	
	void logo() {
		WebElement abc = driver.findElement(By.xpath("//img[@alt='Global Logistic Service']"));
		abc.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(priority=3)
	void wwa() {
		WebElement wwa = driver.findElement(By.xpath("//a[@class='avia-slideshow-button avia-button avia-color-light avia-multi-slideshow-button']"));
	wwa.click();
	driver.navigate().back();
	
		
	}
	@Test(priority=4)
	void nav() {
	WebElement nav = driver.findElement(By.xpath("//a[@class='avia-slideshow-button avia-button avia-color-theme-color avia-multi-slideshow-button avia-slideshow-button-2']"));
	nav.click();
	driver.navigate().back();
	
	}
	@Test(priority=5)
	void quote() throws InterruptedException {
	WebElement quote = driver.findElement(By.xpath("//span[@class='avia_iconbox_title']"));
	quote.click();
	Thread.sleep(2000);
	driver.navigate().back();
	
	}
	
	@Test(priority=6)
	void FB() {
	WebElement FB = driver.findElement(By.xpath("//body/div[@id='wrap_all']/header[@id='header']/div[@id='header_main']/div[@class='container av-logo-container']/div[@class='inner-container']/ul[@class='noLightbox social_bookmarks icon_count_2']/li[@class='social_bookmarks_facebook av-social-link-facebook social_icon_1']/a[1]"));
	FB.click();
	
}
	@Test(priority=7)
	void TW() throws InterruptedException  {
	WebElement TW = driver.findElement(By.xpath("//body/div[@id='wrap_all']/header[@id='header']/div[@id='header_main']/div[@class='container av-logo-container']/div[@class='inner-container']/ul[@class='noLightbox social_bookmarks icon_count_2']/li[@class='social_bookmarks_twitter av-social-link-twitter social_icon_2']/a[1]"));
	TW.click();
	driver.navigate().back();
	Thread.sleep(2000);
	
}
	
	@Test(priority=8)
	void Search() {
	WebElement SE= driver.findElement(By.xpath("//input[@id type='submit']"));
//	Actions a = new Actions(driver);
//	a.moveToElement(SE).perform();
	SE.click();
	WebElement AB = driver.findElement(By.xpath("//input[@id='s']"));
	AB.sendKeys("air");

	}


	
}

//div[@class='avia-menu av-main-nav-wrap']//ul[@id='avia-menu']//li[@id='menu-item-search']//a[@href='?s=']

