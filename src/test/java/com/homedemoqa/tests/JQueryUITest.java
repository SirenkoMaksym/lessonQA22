/*
 * created by max$
 */


package com.homedemoqa.tests;

import com.homedemoqa.pages.HomePage;
import com.homedemoqa.pages.JQueryUIPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JQueryUITest extends TestBase {
    HomePage home;
    JQueryUIPage jQuery;
    String path = "C:/Users/IMT - Teilnehmer/Downloads";

    @BeforeMethod
    public void precondition() {
        home = new HomePage(driver);
        jQuery = new JQueryUIPage(driver);
        home.getJQueryUIPage();
        //new HomePage(driver).getJQueryUIPage();
    }

    @Test
    public void jQueryUIMenuPdfTest() {
                // new JQueryUIPage(driver)
                //.selectMenu()
                //.verifyJQueryUIMenu()
        jQuery
                .hoverEnables()
                .hoverDownloads()
                .clickPdf()
              //  .clickCsv()
              //  .clickExel()
                .checkFileDownloaded(path, "menu.pdf")
        ;
    }

    @Test
    public void jQueryUIMenuPdfCsvTest() {
        // new JQueryUIPage(driver)
        //.selectMenu()
        //.verifyJQueryUIMenu()
        jQuery
                .hoverEnables()
                .hoverDownloads()
                .clickPdf()
                //  .clickCsv()
                  .clickExel()
                .checkFileDownloaded(path, "menu.xls")
        ;
    }

    @Test
    public void jQueryUIMenuPdfExelTest() {
        // new JQueryUIPage(driver)
        //.selectMenu()
        //.verifyJQueryUIMenu()
        jQuery
                .hoverEnables()
                .hoverDownloads()
                //.clickPdf()
                  .clickCsv()
                //  .clickExel()
                .checkFileDownloaded(path, "menu.csv")
        ;
    }
    @AfterMethod
    public void postCondition(){
        jQuery.reoveDownloadedFile(path,"menu");
    }

}
