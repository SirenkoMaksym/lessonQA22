/*
 * created by max$
 */


package com.homedemoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[29]/a")
    WebElement alertsJSButton;

    public AlertFramePage getAlertsFrameWindows() {
        click(alertsJSButton);
        return new AlertFramePage(driver);
    }
}
