/*
 * created by max$
 */


package com.homedemoqa.tests;

import com.homedemoqa.pages.HomePage;
import com.homedemoqa.pages.HorizontalSliderPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getHorizontalSlider();
    }
    @Test
    public void moveHorizontSlider(){
        new HorizontalSliderPage(driver).moveSlider()
        .verifySlider("5");
    }@Test
    public void moveHorizontSliderWith(){
        new HorizontalSliderPage(driver).moveSliderWihtKeys()
                .verifySlider("1.5");
    }
}
