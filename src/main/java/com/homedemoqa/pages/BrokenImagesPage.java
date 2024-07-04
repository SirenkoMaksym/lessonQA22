/*
 * created by max$
 */


package com.homedemoqa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class BrokenImagesPage extends BasePage {
    public BrokenImagesPage(WebDriver driver) {
        super(driver);
    }

    SoftAssert softAssert = new SoftAssert();

    @FindBy(css = "img")
    List<WebElement> images;

    public BrokenImagesPage checkBrokenImages() {
        System.out.println("Total images on the web page: " + images.size());

        for (int i = 0; i < images.size(); i++) {
            WebElement image = images.get(i);
            String imageUrl = image.getAttribute("src");
            verifyLinks(imageUrl);
            try {
                boolean imageDisplay = (Boolean) ((JavascriptExecutor) driver)
                        .executeScript("return (typeof arguments[0].naturalWidth != undefined && arguments[0].naturalWidth>0);", image);
                if (imageDisplay) {
                    System.out.println("DISPLAY - OK");
                    System.out.println("=========================================================");
                } else {
                    System.out.println("DISPLAY - BROKEN");
                    System.out.println("=========================================================");
                }
            } catch (Exception e) {
                System.out.println("ERROR occurred");
                ;
            }
        }

        return this;
    }

    @FindBy(css = "img:nth:child(2)")
    WebElement image2;
    @FindBy(css = "img:nth:child(3)")
    WebElement image3;
    @FindBy(css = "img:nth:child(4)")
    WebElement image4;

    public BrokenImagesPage verifyBrockenPages() {
        softAssert.assertTrue(checkImage(image2));
        softAssert.assertTrue(checkImage(image3));
        softAssert.assertTrue(checkImage(image4));
        softAssert.assertAll();
        return this;
    }

    private boolean checkImage(WebElement image) {
        return  (Boolean) ((JavascriptExecutor) driver)
                .executeScript("return (typeof arguments[0].naturalWidth != undefined && arguments[0].naturalWidth>0);", image);
    }
}
