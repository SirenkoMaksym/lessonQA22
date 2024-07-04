/*
 * created by max$
 */


package com.homedemoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactoryFinder;
import org.testng.Assert;

import java.awt.event.KeyEvent;
import java.util.List;

public class AddRemoveElementsPage extends BasePage {
    public AddRemoveElementsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='example']/button")
    WebElement addButton;

    public AddRemoveElementsPage addElemenets() {
        pause(2000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER).perform();

        return this;
    }

    @FindBy(xpath = "//*[@id='elements']/button")
    WebElement removeButton;

    public AddRemoveElementsPage verifyAddElements() {
        Assert.assertTrue(isElementVisible(removeButton));
        return this;
    }

    public AddRemoveElementsPage removeElements() {
        pause(1000);
        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER).perform();
        if (isElementVisible(removeButton)) {
            pause(1000);
            actions.sendKeys(Keys.TAB, Keys.ENTER).perform();
        } else {
            System.out.println("Что-то не то");
        }
        pause(2000);
        return this;
    }

    @FindBy(xpath = "//*[@onclick='deleteElement()']")
    WebElement deletedElement;
    @FindBy(css = "div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example:nth-child(3) div:nth-child(3) > button.added-manually")
    WebElement deletedElement2;

    @FindBy(xpath = "//*[@id='elements']/button")
    List<WebElement> list;

    public AddRemoveElementsPage verifyRemoveElements1() {
        Assert.assertFalse(isElementPresent(list));
        return this;
    }
    public AddRemoveElementsPage verifyRemoveElements() {
        Assert.assertTrue(isElementPresent(list));
        return this;
    }

}

        // Assert.assertFalse(isElementVisible(removeButton));
        //  Assert.assertFalse(removeButton.isDisplayed());
        //  Assert.assertFalse(isElementVisible(deletedElement));
        //  Assert.assertFalse(isElementVisible(deletedElement2));
        // Assert.assertFalse(isElementPresent(By.xpath("//*[@id='elements']/button")));
