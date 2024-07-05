/*
 * created by max$
 */


package com.homedemoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ExitIntentPage extends BasePage {
    public ExitIntentPage(WebDriver driver) {
        super(driver);
    }

    public ExitIntentPage getExistIntern() {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        pause(1000);
        robot.mouseMove(200, 200);
        robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(2, 2);
        return this;
    }

    @FindBy(id = "ouibounce-modal")
    WebElement modal;

    public ExitIntentPage verifyExiTIntern(String text) {
        Assert.assertTrue(shouldHaveText(modal, text, 5));
        return this;
    }
}
