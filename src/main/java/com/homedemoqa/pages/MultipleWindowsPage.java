/*
 * created by max$
 */


package com.homedemoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindowsPage extends BasePage {
    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='content']/div/a")
    WebElement clickHereButton;

    public MultipleWindowsPage switchToNewTabMW(int index) {
        click(clickHereButton);

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        return this;
    }

    @FindBy(xpath = "//div[@class='example']/h3")
    WebElement newWindow;

    public MultipleWindowsPage verifyNewTabWindows(String text) {
        Assert.assertTrue(shouldHaveText(newWindow, text, 3));
        return this;
    }
}
