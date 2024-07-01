/*
 * created by max$
 */


package com.homedemoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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
}
