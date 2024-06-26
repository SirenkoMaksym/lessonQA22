/*
 * created by max$
 */


package com.homedemoqa.tests;

import com.homedemoqa.pages.HomePage;
import com.homedemoqa.pages.MultipleWindowsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowsTest extends TestBase{
    @BeforeMethod
    public void predication(){
        new HomePage(driver).getMultipleWindows();
    }
    @Test
    public void toMultipleWindowsNewTab(){
        new MultipleWindowsPage(driver).switchToNewTabMW(1)
                .verifyNewTabWindows("New Window");
    }

}
