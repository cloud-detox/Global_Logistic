package globallogitic;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class homepage {

	String driverPath = "C:\\Users\\dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";	
	WebDriver driver=new ChromeDriver();

	@BeforeTest
	void n() throws InterruptedException {
	driver.get("https://globallogistic.co.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@Test(priority=1)
void who_weare() {
	WebElement un=driver.findElement(By.xpath("//a[@class='avia-slideshow-button avia-button avia-color-light avia-multi-slideshow-button']"));
	un.click();
}

@Test(priority=2)
void logo() {
	WebElement l=driver.findElement(By.xpath("//img[@alt='Global Logistic Service']"));
	l.click();
}
@Test (priority=3)
void what_wedo() throws InterruptedException {
	WebElement ps=driver.findElement(By.xpath("//a[@class='avia-slideshow-button avia-button avia-color-theme-color avia-multi-slideshow-button avia-slideshow-button-2']"));
	ps.click();
}

@Test (priority=4)
void facebook_button() {
	WebElement f=driver.findElement(By.xpath("//body/div[@id='wrap_all']/header[@id='header']/div[@id='header_main']/div[@class='container av-logo-container']/div[@class='inner-container']/ul[@class='noLightbox social_bookmarks icon_count_2']/li[@class='social_bookmarks_facebook av-social-link-facebook social_icon_1']/a[1]"));
    f.click();
    String pw=driver.getWindowHandle();
    Set<String> cw=driver.getWindowHandles();
    
    for(String c:cw) {
    	if(!(cw.equals(c))) {
    		driver.switchTo().window(c);
    	}
    }
}

@Test (priority=5)
void twitter_button() {
	WebElement t=driver.findElement(By.xpath("//body/div[@id='wrap_all']/header[@id='header']/div[@id='header_main']/div[@class='container av-logo-container']/div[@class='inner-container']/ul[@class='noLightbox social_bookmarks icon_count_2']/li[@class='social_bookmarks_twitter av-social-link-twitter social_icon_2']/a[1]"));
    t.click();
    String pw=driver.getWindowHandle();
    Set<String> cw=driver.getWindowHandles();
    
    for(String c:cw) {
    	if(!(cw.equals(c))) {
    		driver.switchTo().window(c);

}
    }
}

@Test(priority=6)
void land_transportation() {
	WebElement lt=driver.findElement(By.xpath("//span[@class='image-overlay overlay-type-extern']"));
    lt.click();
}

@Test(priority=7)
void Air_Freight() {
	WebElement af=driver.findElement(By.xpath("//img[@title='home_logistics_offer2']"));
	af.click();
}

@Test(priority=8)
void Wh_package() {
	WebElement wp=driver.findElement(By.xpath("//img[@title='home_logistics_offer3']"));
	wp.click();

}

@Test(priority=9)
void Get_aquote() {
	WebElement gq=driver.findElement(By.xpath("//span[contains(@class,'avia_iconbox_title')]"));
	gq.click();
	driver.navigate().back();
}


@Test(priority=10)
void scroll() {
	WebElement s=driver.findElement(By.xpath("//a[@id='scroll-top-link']"));
	s.click();
}

@AfterTest
void Close() {
	driver.quit();
}
}

	
