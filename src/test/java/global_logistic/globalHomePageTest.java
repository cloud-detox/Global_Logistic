package global_logistic;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class globalHomePageTest { String driverPath = "C:\\Users\\HARSH SHARMA\\Downloads\\chromedriver-win64\\chromedriver.exe";
WebDriver driver = new ChromeDriver();

@BeforeTest
void navigate() throws InterruptedException {
	driver.get("https://globallogistic.co.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(32));
	//Thread.sleep(5000);
}

@Test(priority=1)
void image() {
	WebElement image = driver.findElement(By.xpath("//img[@alt='Global Logistic Service']"));
	System.out.println(image.isDisplayed());
	if (image.isDisplayed()) {
	System.out.println("image is visible");
	}
	else {
		System.out.println("image is not visible");
	}
}
@Test(priority=7)
void FB() {
	//WebElement FB = driver.findElement(By.xpath("//body/div[@id='wrap_all']/header[@id='header']/div[@id='header_main']/div[@class='container av-logo-container']/div[@class='inner-container']/ul[@class='noLightbox social_bookmarks icon_count_2']/li[@class='social_bookmarks_facebook av-social-link-facebook social_icon_1']/a[1]"));
	//FB.click();
}
@Test(priority=8)
void TW() {
	//WebElement TW = driver.findElement(By.xpath("//body/div[@id='wrap_all']/header[@id='header']/div[@id='header_main']/div[@class='container av-logo-container']/div[@class='inner-container']/ul[@class='noLightbox social_bookmarks icon_count_2']/li[@class='social_bookmarks_twitter av-social-link-twitter social_icon_2']/a[1]"));
	//TW.click();
}
@Test(priority=2)
void search() {
	WebElement search = driver.findElement(By.xpath("//div[@class='avia-menu av-main-nav-wrap']//ul[@id='avia-menu']//li[@id='menu-item-search']//a[@href='?s=']"));
	search.click();
}
@Test(priority=3)
void searchname() {
	WebElement searchname = driver.findElement(By.xpath("//input[@id='s']"));
	searchname.sendKeys("HARSH");
}
@Test(priority=4)
void clicksearch() {
	WebElement clicksearch = driver.findElement(By.xpath("//input[@id='searchsubmit']"));
	clicksearch.click();
}
@Test(priority=5)
void whoweare() {
	WebElement whoweare = driver.findElement(By.xpath("(//a[@data-easing=\"easeInOutQuad\"])[2]"));
	whoweare.click();
	driver.navigate().back();
}
@Test(priority=6)
void whatwedo() {
	WebElement whatwedo = driver.findElement(By.xpath("//a[@style=\"background-color: indianred;\"]"));
	whatwedo.click();
}
@Test(priority=7)
void intfreight() {
	WebElement intfreight = driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding first avia-builder-el-2 el_after_av_hr el_before_av_one_half avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
	intfreight.click();
	driver.navigate().back();
}
@Test(priority=8)
void landtransportation() {
	WebElement landtransportation = driver.findElement(By.xpath("//span[@class='image-overlay overlay-type-extern']"));
	landtransportation.click();
	driver.navigate().back();
}
@Test(priority=9)
void getquote() {
	WebElement getquote = driver.findElement(By.xpath("//span[@class='avia_iconbox_title']"));
	getquote.click();
}
@Test(priority=10)
void name() {
	WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
	name.sendKeys("HARSH SHARMA");
}
@Test(priority=12)
void email() {
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys("hslc2927@gmail.com");
}
@Test(priority=13)
void number() {
	WebElement number = driver.findElement(By.xpath("//input[@id='number']"));
	number.sendKeys("9084761159");
}
@Test(priority=14)
void subject() {
	WebElement subject = driver.findElement(By.xpath("//input[@id='subject']"));
	subject.sendKeys("English Hindi");
}
@Test(priority=15)
void message() {
	WebElement message = driver.findElement(By.xpath("//textarea[@id='message']"));
	message.sendKeys("I have cleared all steps and doing work on contact page");
}
@Test(priority=16)
void submit() {
	WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	submit.click();
	driver.navigate().back();
	driver.navigate().refresh();
}
@Test(priority=17)
void home() {
	WebElement home = driver.findElement(By.xpath("(//a[@itemprop=\"url\"])[1]"));
	home.click();
}
@Test(priority=18)
void career() {
	WebElement career = driver.findElement(By.xpath("(//a[@itemprop=\"url\"])[4]"));
	career.click();
}
@Test(priority=19)
void yourname() {
	WebElement yourname = driver.findElement(By.xpath("//input[@name='your-name']"));
	yourname.sendKeys("Kush Sharma");
}
@Test(priority=20)
void youremail() {
	WebElement youremail = driver.findElement(By.xpath("//input[@name='your-email']"));
	youremail.sendKeys("hslc2927@gmail.com");
}
@Test(priority=21)
void yournumber() {
	WebElement yournumber = driver.findElement(By.xpath("//input[@name='tel-345']"));
	yournumber.sendKeys("9084761159");
}
@Test(priority=22)
void choosefile() {
	WebElement choosefile = driver.findElement(By.xpath("//input[@accept=\"audio/*,video/*,image/*\"]"));
	choosefile.sendKeys("C:\\Users\\HARSH SHARMA\\Downloads\\Images\\processed.jpeg");
}
@Test(priority=23)
void yoursubject() {
	WebElement yoursubject = driver.findElement(By.xpath("//input[@name='your-subject']"));
	yoursubject.sendKeys("English Hindi Maths");
}
@Test(priority=24)
void yourmessage() {
	WebElement yourmessage = driver.findElement(By.xpath("//textarea[@name='your-message']"));
	yourmessage.sendKeys("I have cleared all the exams and entered in new subject");
}
@Test(priority=25)
void send() {
	WebElement send = driver.findElement(By.xpath("//input[@value='Send']"));
	send.click();
	driver.navigate().back();
	driver.navigate().refresh();
	driver.navigate().back();
}
@Test(priority=26)
void contact() {
	WebElement contact = driver.findElement(By.xpath("//span[normalize-space()='Contact']"));
	contact.click();
}
@Test(priority=27)
void mapzoom() {
	WebElement mapzoom = driver.findElement(By.xpath("//button[@aria-label=\"Zoom in\"]"));
	mapzoom.click();
	driver.navigate().refresh();
}
@AfterTest
void close() {
	driver.quit();
}
}

