/*
 * created by max$
 */


package com.homedemoqa.tests;

import com.homedemoqa.pages.ExitIntentPage;
import com.homedemoqa.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExitIntentTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getExitIntent();
    }
    @Test
    public void exitInternTest(){
        new ExitIntentPage(driver).getExistIntern()
                .verifyExiTIntern("THIS IS A MODAL WINDOW")
                ;
    }
}
