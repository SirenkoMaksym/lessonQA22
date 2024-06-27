/*
 * created by max$
 */


package com.homedemoqa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class NestedFramesPage extends BasePage {
    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "iframe")
    List<WebElement> iframes;

    public NestedFramesPage getListOfIframes() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Integer numberOfIframes = Integer.parseInt(js.executeScript("return window.length").toString());

        System.out.println("Number of iframes on the page  are " + numberOfIframes);
        return this;
    }

    public NestedFramesPage switchToIframeToIndex(int index) {
        driver.switchTo().frame(index);
        return this;
    }

    @FindBy(css = "body")
    WebElement bottom;

    public NestedFramesPage verifyIframeText(String text) {
        Assert.assertTrue(shouldHaveText(bottom, text, 5));
        return this;
    }

    @FindBy(xpath = "//frame[2]")
    WebElement frame1;

    public NestedFramesPage switchToMiddleNestedIframe() {
        driver.switchTo().frame(0);
        driver.switchTo().frame(frame1);
        return this;
    }

    @FindBy(css = "body")
    WebElement middle;

    public NestedFramesPage verifyNestedIframe(String text) {
        Assert.assertTrue(shouldHaveText(middle, text, 3));
        return this;
    }

    @FindBy(xpath = "//frame[3]")
    WebElement frame2;

    public NestedFramesPage switchToRightNestedIframe() {
        driver.switchTo().frame(0);
        driver.switchTo().frame(frame2);
        return this;
    }

    @FindBy(xpath = "//frame[1]")
    WebElement frame0;

    public NestedFramesPage switchToNestedLeftIframe() {
        driver.switchTo().frame(0);
        driver.switchTo().frame(frame0);
        return this;
    }

    @FindBy(xpath = "//*[@name='frame-bottom']")
    WebElement element;

    public NestedFramesPage switchToIframeByElement() {
        driver.switchTo().frame(element);
        return this;
    }
}
