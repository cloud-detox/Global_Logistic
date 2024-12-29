package Global_Logistic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CareerPage {
	String driverPath = "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64.zip\\chromedriver-win64";
	WebDriver driver = new ChromeDriver();
	//WebElement logo =  driver.findElement(By.xpath("//img[@alt='Global Logistic Service']"));
	@BeforeTest
	void Navigation()  {
		driver.get("https://globallogistic.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		}
	
   
      
       =By.xpath("//input[@name='file-877']");
      By subject=By.xpath("//input[@name='your-subject']");
      By message=By.xpath("//textarea[@name='your-message']");
      By send=By.xpath("//input[@value='Send']");
   

//	Action method
      
      
	
	@BeforeTest

	@Test(priority=1)
	void career() {
		//WebElement Career= driver.findElement(By.xpath("//span[normalize-space()='Careers']"));
		driver.findElement(Career).click();
	if(driver.getCurrentUrl().equals("https://globallogistic.co.in/careers.html")) {
	driver.navigate().back();
			
		}
	}}


