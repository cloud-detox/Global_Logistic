package Test;

import org.testng.annotations.Test;

import Base.GlobalBase;
import Pages.PageMethod;

public class Testglobal extends GlobalBase {

    @Test
    public void Testrun() throws InterruptedException {
        PageMethod page = new PageMethod(driver); 
        page.About();
        page.Service();
        page.career();
        page.Contact();
        page.Refresh();
        page.Landtransportation();
        page.Qoute();
    }}