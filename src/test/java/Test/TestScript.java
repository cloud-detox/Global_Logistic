package Test;

import org.testng.annotations.Test;
import Base.GlobalBase;
import Pages.PageTest;

public class TestScript extends GlobalBase {

    @Test
    public void testRun() throws InterruptedException {
        PageTest page = new PageTest(driver);

        page.clickHome();
        page.clickService();
        page.clickAbout();
        page.clickCareers();
        page.clickContact();
        page.WhoWeAre();
        page.clickWhatWeDo();
        page.ContactName();
    }
  }