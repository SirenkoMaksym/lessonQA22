/*
 * created by max$
 */


package com.homedemoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class FileUploadPage extends BasePage {
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "file-submit")
    WebElement fileSubmit;
    @FindBy(id = "file-upload")
    WebElement fileUpload;

    public FileUploadPage performKeyWithRobot() {

        pause(1000);
        clickWithRectangle(fileUpload, 5, 3);

        Robot robot;

        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        robot.keyPress(KeyEvent.VK_SHIFT);
        pause(1000);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_1);
        robot.keyPress(KeyEvent.VK_7);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_X);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_ENTER);

        click(fileSubmit);
        return this;
    }

    @FindBy(id = "uploaded-files")
    WebElement uploadedFiles;

    public FileUploadPage verifyFileUploaded(String text) {
        Assert.assertTrue(shouldHaveText(uploadedFiles, text, 5));
        return this;
    }

    public FileUploadPage dragAndDropFile() {
        clickWithRectangle(fileUpload, 5, 3);

        Robot robot;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        int x = 470;
        int y = 490;
        robot.mouseMove(x, y);
        pause(1000);

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(470, 740);
        pause(1000);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(1100, 10);
        pause(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        pause(1000);
        return this;
    }

    @FindBy(id = "drag-drop-upload")
    WebElement dragAndDrop;

    public FileUploadPage verifyFileUploadDragAndDrop(String text) {
        Assert.assertTrue(shouldHaveText(dragAndDrop,text,5));
        return this;
    }
}
