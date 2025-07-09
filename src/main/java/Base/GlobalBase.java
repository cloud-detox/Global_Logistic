package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class GlobalBase {

	protected WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://globallogistic.co.in/services.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   
    }

    @AfterClass
    
    public void close() {
        driver.quit();
    }
}