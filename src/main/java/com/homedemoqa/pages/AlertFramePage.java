/*
 * created by max$
 */


package com.homedemoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AlertFramePage extends BasePage {

    public AlertFramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//li[2]/button")
    WebElement confirmButton;

    public AlertFramePage selectResult(String text) {
        click(confirmButton);
        if (text != null && text.equals("OK")) {
            driver.switchTo().alert().accept();
        } else if (text != null && text.equals("Отмена")) {
            driver.switchTo().alert().dismiss();
        }

        return this;
    }

    @FindBy(id = "result")
    WebElement confirmResult2;

    public AlertFramePage verifyResult(String result) {

        Assert.assertTrue(shouldHaveText(confirmResult2, result, 5));
        return this;
    }

    @FindBy(xpath = "//li[3]/button")
    WebElement promtButton;

    public AlertFramePage sendMessageToAlert(String message) {
        click(promtButton);
        if (message != null) {
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }

        return this;
    }
    @FindBy(id = "result")
    WebElement confirmResult3;
    public AlertFramePage verifyMessage(String message) {
        Assert.assertTrue(shouldHaveText(confirmResult3, message, 5));
        return this;
    }
    @FindBy(xpath = "//li[1]/button")
    WebElement acceptButton1;
    public AlertFramePage acceptAlert() {
        click(acceptButton1);
        driver.switchTo().alert().accept();
        return this;
    }

}
