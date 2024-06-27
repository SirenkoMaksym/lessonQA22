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

    @FindBy(xpath = "//*[34]/a")
    WebElement nastedFramesButton;

    public NestedFramesPage getNestedFramesPage() {
        click(nastedFramesButton);
        return new NestedFramesPage(driver);
    }
    @FindBy(xpath = "//*[33]/a")
    WebElement multipleButton;
    public MultipleWindowsPage getMultipleWindows() {
        click(multipleButton);
        return new MultipleWindowsPage(driver);
    }
    @FindBy(xpath = "//*[24]/a")
    WebElement sliderButton;
    public HorizontalSliderPage getHorizontalSlider() {
        click(sliderButton);
        return new HorizontalSliderPage(driver);
    }
    @FindBy(xpath = "//*[25]/a")
    WebElement hoversButton;
    public HoversPage getHovers() {
        click(hoversButton);
        return new HoversPage(driver);
    }
}
