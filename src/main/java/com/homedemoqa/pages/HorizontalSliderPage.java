/*
 * created by max$
 */


package com.homedemoqa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HorizontalSliderPage extends BasePage{
    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@id='range']/parent::*/input")
    WebElement slider;

    public HorizontalSliderPage moveSlider() {
        Actions actions = new Actions(driver);
        actions.clickAndHold(slider)
                .moveByOffset(55,0)
                .release()
                .perform();
        return this;
    }
    @FindBy(xpath = "//span[@id='range']")
    WebElement sliderValue;
    public HorizontalSliderPage verifySlider(String value) {
        Assert.assertTrue(shouldHaveText(sliderValue, value, 3));
        return this;
    }


    public HorizontalSliderPage moveSliderWihtKeys() {
        Actions actions = new Actions(driver);
        actions.click(slider)
                .sendKeys(Keys.LEFT)
                .sendKeys(Keys.LEFT)
                .sendKeys(Keys.LEFT)
                .sendKeys(Keys.RIGHT)
                .perform();
        return this;
    }
}
