/*
 * created by max$
 */


package com.homedemoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.File;

public class JQueryUIPage extends BasePage {
    public JQueryUIPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "ui-id-3")
    WebElement menu;
    @FindBy(id = "ui-id-8")
    WebElement subMenuDown;
    @FindBy(id = "ui-id-4")
    WebElement subMenuUp;
    @FindBy(id = "ui-id-5")
    WebElement subSubMenuUp;
    @FindBy(id = "ui-id-6")
    WebElement subSubMenuMiddle;
    @FindBy(id = "ui-id-7")
    WebElement subSubMenuDown;


    public JQueryUIPage selectMenu() {
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        pause(1000);
        actions.moveToElement(subMenuDown).perform();
        pause(1000);
        actions.moveToElement(subMenuUp).perform();
        pause(1000);
        actions.moveToElement(subSubMenuDown).perform();
        pause(1000);
        actions.moveToElement(subSubMenuMiddle).perform();
        pause(1000);
        actions.moveToElement(subSubMenuUp).perform();
        pause(1000);
        return this;
    }

    public JQueryUIPage verifyJQueryUIMenu() {
        Assert.assertTrue(isElementVisible(subSubMenuDown));
        return this;
    }


    public JQueryUIPage verifyCSVOptionClicked(String downloadPath) {
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();

        for (File file : dirContents) {
            if (file.getName().contains("menu.csv")) {
                file.delete();
                return this;
            }
        }

        return this;
    }

    public JQueryUIPage hoverEnables() {
        new Actions(driver).moveToElement(menu).perform();
        pause(1000);
        return this;
    }

    public JQueryUIPage hoverDownloads() {
        new Actions(driver).moveToElement(subMenuUp).perform();
        pause(1000);
        return this;
    }

    public JQueryUIPage clickPdf() {
        click(subSubMenuUp);
        return this;
    }
    public JQueryUIPage clickCsv() {
        click(subSubMenuMiddle);
        return this;
    }
    public JQueryUIPage clickExel() {
        click(subSubMenuDown);
        return this;
    }

    public JQueryUIPage checkFileDownloaded(String path, String name) {
        pause(2000);
        Assert.assertTrue(isFileDowmloaded(path,name));
        pause(1000);
        return null;
    }

    public boolean isFileDowmloaded(String path, String name) {
        File dir = new File(path);
        File[] dirContents = dir.listFiles();

        for (int i = 0; i < dirContents.length; i++) {
            if (dirContents[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public JQueryUIPage reoveDownloadedFile(String path, String name) {
        pause(1000);
        File dir = new File(path);
        File[] dirContents = dir.listFiles();

        for (int i = 0; i < dirContents.length; i++) {
            if (dirContents[i].getName().contains(name)) {
                dirContents[i].delete();
                return this;
            }
        }

        return this;

    }
}
