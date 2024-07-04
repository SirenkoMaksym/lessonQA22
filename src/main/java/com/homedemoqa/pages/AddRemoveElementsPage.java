/*
 * created by max$
 */


package com.homedemoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.awt.event.KeyEvent;

public class AddRemoveElementsPage extends BasePage {
    public AddRemoveElementsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='example']/button")
    WebElement addButton;

    public AddRemoveElementsPage getAddElemenets() {
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

    public AddRemoveElementsPage getRemoveElements() {
        pause(1000);
        Actions actions = new Actions(driver);
        pause(1000);
        actions.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER).perform();
        if(isElementVisible(removeButton)){
            pause(1000);
            actions.sendKeys(Keys.TAB, Keys.ENTER).perform();
        }else{
            System.out.println("Что-то не то");
        }
        pause(2000);
        return this;
    }


    public AddRemoveElementsPage verifyRemoveElements() {
        Assert.assertFalse(isElementPresent(By.xpath("//*[@id='elements']/button")));
        return this;
    }
}
