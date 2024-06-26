/*
 * created by max$
 */


package com.homedemoqa.tests;

import com.homedemoqa.pages.HomePage;
import com.homedemoqa.pages.NestedFramesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NestedFramesTests extends TestBase{
    @BeforeMethod
    public void predication(){
        new HomePage(driver).getNestedFramesPage();
    }
    @Test
    public void framesTest(){
        new NestedFramesPage(driver).getListOfIframes();
    }
    @Test
    public void switchToIframeByIndexTest(){
        new NestedFramesPage(driver).switchToIframeToIndex(1)
                .verifyIframeText("BOTTOM");
    }

  @Test
    public void switchToNestedMiddleIframeTest(){
        new NestedFramesPage(driver).switchToMiddleNestedIframe()
                .verifyNestedIframe("MIDDLE");
    }
    @Test
    public void switchToNestedRightIframeTest(){
        new NestedFramesPage(driver).switchToRightNestedIframe()
                .verifyNestedIframe("RIGHT");
    }
    @Test
    public void switchToNestedLeftIframeTest(){
        new NestedFramesPage(driver).switchToNestedLeftIframe()
                .verifyNestedIframe("LEFT");
    }
}
