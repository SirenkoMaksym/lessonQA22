/*
 * created by max$
 */


package com.homedemoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ContextMenuPage extends BasePage{
    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id="hot-spot")
    WebElement contextMenu;
    public ContextMenuPage contextMenuClick() {
        new Actions(driver).contextClick(contextMenu).perform();
        return this;
    }

    public void verifyContextMenu(String text) {
       Assert.assertTrue(driver.switchTo().alert().getText().contains(text));
       driver.switchTo().alert().accept();
    }
}
