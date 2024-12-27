package globallogistic;

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

	String driverpath = "C:\\Users\\Samiksha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void navigate() throws InterruptedException {
		driver.get("https://globallogistic.co.in/");
		driver .manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 1)
	void who_weare() {
		WebElement un = driver.findElement(By
				.xpath("//a[@class='avia-slideshow-button avia-button avia-color-light avia-multi-slideshow-button']"));
		un.click();

	}

	@Test(priority = 2)
	void logo() {
		WebElement L = driver.findElement(By.xpath("//img[@alt='Global Logistic Service']"));
		L.click();
	}

	@Test(priority = 3)
	void what_wedo() throws InterruptedException {
		WebElement W = driver.findElement(By.xpath(
				"//a[@class='avia-slideshow-button avia-button avia-color-theme-color avia-multi-slideshow-button avia-slideshow-button-2']"));
		W.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}	
	
	@Test(priority = 4)
	void facebook_button() throws InterruptedException {
		WebElement F = driver.findElement(By.xpath("//body/div[@id='wrap_all']/header[@id='header']/div[@id='header_main']/div[@class='container av-logo-container']/div[@class='inner-container']/ul[@class='noLightbox social_bookmarks icon_count_2']/li[@class='social_bookmarks_facebook av-social-link-facebook social_icon_1']/a[1]"));
        F.click();
        Thread.sleep(2000);
        String PW=driver.getWindowHandle();
        Set<String> CW=driver.getWindowHandles();
         
        for(String c:CW) {
        	if(!(CW.equals(c))) {
        		driver.switchTo().window(PW);
        	}
        }
        
	}
	@Test(priority = 5)
	void twitter_button() throws InterruptedException {
		WebElement T = driver.findElement(By.xpath("//body/div[@id='wrap_all']/header[@id='header']/div[@id='header_main']/div[@class='container av-logo-container']/div[@class='inner-container']/ul[@class='noLightbox social_bookmarks icon_count_2']/li[@class='social_bookmarks_twitter av-social-link-twitter social_icon_2']/a[1]"));
        T.click();
        Thread.sleep(2000);
        String PW=driver.getWindowHandle();
        Set<String> CW=driver.getWindowHandles();
        
        for(String c:CW) {
            if(!(CW.equals(c))) {
            	driver.switchTo().window(PW);
            }
	
	}

}
	
	@Test(priority = 6)
	  void search_button() {
			WebElement S = driver.findElement(By.xpath("//div[@class='avia-menu av-main-nav-wrap']//ul[@id='avia-menu']//li[@id='menu-item-search']//a[@href='?s=']"));
            S.click();
			WebElement SE = driver.findElement(By.xpath("//input[@id='s']"));
            SE.click();
			SE.sendKeys("Services");
			WebElement SU = driver.findElement(By.xpath("//input[@id='searchsubmit']"));
            SU.click();
	  }
	
	
	@Test(priority = 7)
	   void land_transportation() throws InterruptedException {
			WebElement LT = driver.findElement(By.xpath("//span[@class='image-overlay overlay-type-extern']"));
            LT.click();
            Thread.sleep(5000);
            driver.navigate().back();
	   }
	
	@Test(priority = 8)
	     void air_freight() {
		    WebElement AF = driver.findElement(By.xpath("//img[@title='home_logistics_offer2']"));
            AF.click();
        }
	
	@Test(priority = 9)
	    void warehouse_packaging() {
		    WebElement WP = driver.findElement(By.xpath("//img[@title='home_logistics_offer3']"));
            WP.click();
	    }
	
	@Test(priority = 10)
	     void get_a_quote() throws InterruptedException {
			    WebElement GQ = driver.findElement(By.xpath("//a[contains(@class,'avia-icon_select-no avia-color-light avia-size-large avia-position-right')]"));
                GQ.click();
                Thread.sleep(2000);
                driver.navigate().back();
	     }
	
	@Test(priority = 11)    
	void scroll_to_up() {
	    	  WebElement SU = driver.findElement(By.xpath("//a[@id='scroll-top-link']"));
              SU.click();
	
	
	
	
}
	@AfterTest()
	void close() {
	driver.quit();
}

}
    
