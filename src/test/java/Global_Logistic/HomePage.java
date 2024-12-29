package Global_Logistic;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 class HomePage {
	
	String driverPath = "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64.zip\\chromedriver-win64";
	WebDriver driver = new ChromeDriver();
	//WebElement logo =  driver.findElement(By.xpath("//img[@alt='Global Logistic Service']"));
	@BeforeTest
	void Navigation()  {
		driver.get("https://globallogistic.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		}
	@Test(priority=2)
	void logoDisplayed() {
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Global Logistic Service']"));
		  if (logo.isDisplayed()) {
              System.out.println("Logo is visible.");
          } else {
              System.out.println("Logo is not visible.");
          }
	}
	
	@Test (priority=3)
	void Whoweare() {
		WebElement wwe=driver.findElement(By.xpath("//a[@class='avia-slideshow-button avia-button avia-color-light avia-multi-slideshow-button']"));
		wwe.click();
		if (driver.getCurrentUrl().equals("https://globallogistic.co.in/About.html"))
		
		{
			driver.navigate().back();
		}
            System.out.println("Successfully navigated back to the homepage.");
		
	}
	
	@Test(priority=4)
	void Search() {
		WebElement search=driver.findElement(By.xpath("//div[@class='avia-menu av-main-nav-wrap']//ul[@id='avia-menu']//li[@id='menu-item-search']//a[@href='?s=']"));
		search.click();
	}
	
	@Test(priority=5)
	void Whatwedo() {
		WebElement wwd= driver.findElement(By.xpath("//a[@class='avia-slideshow-button avia-button avia-color-theme-color avia-multi-slideshow-button avia-slideshow-button-2']"));
		
		wwd.click();
		if (driver.getCurrentUrl().equals("https://globallogistic.co.in/services.html"))
			
		{
			driver.navigate().back();
		}
			
	}
	@Test(priority=6)
	void Oservices() {
		WebElement serv=driver.findElement(By.xpath("//img[@title='home_logistics_offer2']"));
		if(serv.isDisplayed()) {
			serv.getText().equals("Air Freight");
			System.out.println("Test Success");
		}
		WebElement serv1=driver.findElement(By.xpath("//img[@title='home_logistics_offer3']"));
		if(serv1.isDisplayed()) {
			serv1.getText().equals("Warehouse Packaging");
			System.out.println("Test Success1");
		}
	}
	@AfterTest
	void close() {
		driver.quit();
	}
    
	
}


