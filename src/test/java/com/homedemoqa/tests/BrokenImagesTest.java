/*
 * created by max$
 */


package com.homedemoqa.tests;

import com.homedemoqa.pages.BrokenImagesPage;
import com.homedemoqa.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImagesTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getBrokenImages();
    }
    @Test
    public void brokenImage(){
        new BrokenImagesPage(driver).checkBrokenImages()
                .verifyBrockenPages();
    }
}
