/*
 * created by max$
 */


package com.homedemoqa.tests;

import com.homedemoqa.pages.AlertFramePage;
import com.homedemoqa.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAlertsFrameWindows();

    }
    @Test
    public void acceptAlertTest(){
        new AlertFramePage(driver).acceptAlert();
    }

    @Test
    public void selectConfirmTest(){
        new AlertFramePage(driver).selectResult("Отмена")
                .verifyResult("Cancel");
    }
    @Test
    public void sendMessageToAlertTest(){
        new AlertFramePage(driver).sendMessageToAlert("Hello world!!!")
                .verifyMessage("Hello world!!!");
    }
}
