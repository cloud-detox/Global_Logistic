package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageMethod {
    WebDriver driver;

    @FindBy (xpath="(//span[@class=\"avia-menu-text\"])[2]")
    WebElement About;
   
    @FindBy (xpath="(//span[@class=\"avia-menu-text\"])[3]")
    WebElement Service;
   
    
    @FindBy (xpath="(//span[@class=\"avia-menu-text\"])[4]")
    WebElement Careers;
   
    @FindBy(xpath="//input[@class=\"wpcf7-form-control wpcf7-text wpcf7-validates-as-required\"]")
    WebElement Name;
    
    @FindBy(xpath="//input[@class=\"wpcf7-form-control wpcf7-email wpcf7-validates-as-required wpcf7-text wpcf7-validates-as-email\"]")
    WebElement Email;
  
    @FindBy(xpath="//input[@class=\"wpcf7-form-control wpcf7-tel wpcf7-validates-as-required wpcf7-text wpcf7-validates-as-tel\"]")
    WebElement contact ;
  
    @FindBy(xpath="//input[@name='file-877']")
    WebElement Uploadimage;
    
    @FindBy(xpath="//input[@class=\"wpcf7-form-control wpcf7-text\"]")
    WebElement subject;
    
    @FindBy(xpath="//textarea[@class=\"wpcf7-form-control wpcf7-textarea\"]")
    WebElement massage ;
    
    @FindBy (xpath="(//span[@class=\"avia-menu-text\"])[5]")
    WebElement Contact;
 
    @FindBy (xpath="//input[@name=\"name\"]")
    WebElement Name1;
    
    @FindBy (xpath="//input[@name=\"email\"]")
    WebElement Email1;
    
    @FindBy (xpath="//input[@name=\"number\"]")
    WebElement number ;
    
    @FindBy (xpath="//input[@name=\"subject\"]")
    WebElement subject1 ;
    
    @FindBy (xpath="//textarea[@name=\"message\"]")
    WebElement massage1;
    
    @FindBy(xpath="//img[@alt=\"Global Logistic Service\"]")
    WebElement Refresh;
    
    @FindBy(xpath="//span[@class=\"image-overlay overlay-type-extern\"]")
    WebElement Landtransportation;
    
    @FindBy(xpath="//span[@class=\"avia_iconbox_title\"]")
    WebElement Qoute;
    
    public PageMethod(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void About () {
	About.click();
} 
    public void Service() {
	Service.click();
}
    public void career() throws InterruptedException {
	Careers.click();
	Name.sendKeys("Nikhil");
	Email.sendKeys("xyz@gmail.com");
	contact.sendKeys("7709562717");
	Thread.sleep(3000);
    Uploadimage("\"D:\\D Drive\\Scan");
    subject.sendKeys("NA");
	massage.sendKeys("NA");
	}

	private void Uploadimage(String string) {
		// TODO Auto-generated method stub
	}
 
	public void Contact	() throws InterruptedException {
		Contact.click();
		Name1.sendKeys("ABC");
		Email1.sendKeys("ABC@gmail.com");
		number.sendKeys("7709562717");
		subject1.sendKeys("NA");
		massage1.sendKeys("NA");
		}
      public void Refresh() {
	  Refresh.click();}
	
	   public void Landtransportation() {
		Landtransportation.click();
	}
	   public void Qoute() {
		   Qoute.click();
	   }
}