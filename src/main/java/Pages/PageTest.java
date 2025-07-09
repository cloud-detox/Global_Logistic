package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageTest {

    WebDriver driver;

    // Navigation menu elements
    @FindBy(xpath = "(//span[@class=\"avia-menu-text\"])[1]")
    WebElement Home;
    
    @FindBy(xpath = "(//a[@href=\"/About.html\"])[2]")
    WebElement WhoWeAre;
    
    @FindBy(xpath= "(//a[@href=\"/services.html\"])[2]")
    WebElement WhatWeDo;
    
    @FindBy(xpath = "(//span[@class='avia-menu-text'])[5]")
    
    WebElement contact;

    @FindBy(xpath = "//span[normalize-space()='Services']")
    WebElement service;

    @FindBy(xpath = "(//span[@class='avia-menu-text'])[2]")
    WebElement about;

    @FindBy(xpath = "(//span[@class='avia-menu-text'])[4]")
    WebElement careers;

    // Form fields
    @FindBy(xpath = "(//input[@size='40'])[1]")
    WebElement name;

    @FindBy(xpath = "(//input[@size='40'])[2]")
    WebElement email;

    @FindBy(xpath = "(//input[@size='40'])[3]")
    WebElement phNo;

    @FindBy(xpath = "(//input[@size='40'])[5]")
    WebElement sub;

    @FindBy(xpath = "//textarea[@cols='40']")
    WebElement msg;

    @FindBy(xpath = "//input[@name='file-877']")
    WebElement uploadFile;
    
    @FindBy(xpath = "(//input[@type=\"text\"])[1]")
    WebElement ContactName;

    // Constructor
    public PageTest(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Test methods
    
    @Test(priority =1)
    public void clickHome() {
         Home.click();
    }
    
    @Test(priority =2)
    public void WhoWeAre() {
    	WhoWeAre.click();
    }
    @Test(priority =3)
    public void clickWhatWeDo() {
    	WhatWeDo.click();
    }
    @Test(priority = 4)
    public void clickContact() {
        contact.click();
    }

    @Test(priority = 5)
    public void clickService() {
        service.click();
    }

    @Test(priority = 6)
    public void clickAbout() {
        about.click();
    }
    
    @Test(priority = 7)
    public void ContactName() {
    	ContactName.click();
    	}

    @Test(priority = 8)
    public void clickCareers() throws InterruptedException {
        Home.click();
        WhoWeAre.click();
    	careers.click();
        name.sendKeys("abc");
        email.sendKeys("abc@gmail.com");
        phNo.sendKeys("1234567890");
        Thread.sleep(3000);
        uploadFile.sendKeys("C:\\Users\\Pavilion\\Desktop\\sw resume");
        sub.sendKeys("Apply For QA");
        msg.sendKeys("QA Automation Engineer");
        ContactName.sendKeys("abc");
        
    }
}