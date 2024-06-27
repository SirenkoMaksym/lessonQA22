/*
 * created by max$
 */


package com.homedemoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HoversPage extends BasePage {
    public HoversPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='example']/div[1]")
    WebElement user1;
    @FindBy(xpath = "//div[@class='example']/div[2]")
    WebElement user2;
    @FindBy(xpath = "//div[@class='example']/div[3]")
    WebElement user3;
    @FindBy(xpath = "//div[@class='example']/div[1]/div/a[@href='/users/1']")
    WebElement subUser1;
    @FindBy(xpath = "//div[@class='example']/div[2]/div/a[@href='/users/2']")
    WebElement subUser2;
    @FindBy(xpath = "//div[@class='example']/div[3]/div/a[@href='/users/3']")
    WebElement subUser3;

    public HoversPage selectSubUser1() {
        Actions actions = new Actions(driver);
        actions.moveToElement(user1).perform();
        actions.moveToElement(subUser1).perform();
        return this;
    }

    public HoversPage verifyUser1() {
        Assert.assertTrue(isElementVisible(subUser1));
        return this;
    }
    public HoversPage selectSubUser2() {
        Actions actions = new Actions(driver);
        actions.moveToElement(user2).perform();
        actions.moveToElement(subUser2).perform();
        return this;
    }

    public HoversPage verifyUser2() {
        Assert.assertTrue(isElementVisible(subUser2));
        return this;
    }
    public HoversPage selectSubUser3() {
        Actions actions = new Actions(driver);
        actions.moveToElement(user3).perform();
        actions.moveToElement(subUser3).perform();
        return this;
    }

    public HoversPage verifyUser3() {
        Assert.assertTrue(isElementVisible(subUser3));
        return this;
    }
}
