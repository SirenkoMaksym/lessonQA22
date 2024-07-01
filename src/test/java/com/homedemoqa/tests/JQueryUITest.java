/*
 * created by max$
 */


package com.homedemoqa.tests;

import com.homedemoqa.pages.HomePage;
import com.homedemoqa.pages.JQueryUIPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JQueryUITest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getJQueryUIPage();
    }
    @Test
    public void jQueryUIMenuTest(){
        new JQueryUIPage(driver).selectMenu()
                .verifyJQueryUIMenu();
    }
}
