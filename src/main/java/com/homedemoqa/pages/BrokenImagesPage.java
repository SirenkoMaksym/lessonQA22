/*
 * created by max$
 */


package com.homedemoqa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BrokenImagesPage extends BasePage{
    public BrokenImagesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css="img")
    List<WebElement> images;
    public BrokenImagesPage checkBrokenImages() {
        System.out.println("Total images on the web page: " + images.size());

        for (int i = 0; i < images.size(); i++) {
            WebElement image = images.get(i);
            String imageUrl = image.getAttribute("src");
            verifyLinks(imageUrl);
            try {
                boolean imageDisplay = (Boolean)((JavascriptExecutor)driver)
                        .executeScript("return (typeof arguments[0].naturalWidth != undefined && arguments[0].naturalWidth>0);",image);
                if (imageDisplay){
                    System.out.println("DISPLAY - OK");
                    System.out.println("=========================================================");
                }else{
                    System.out.println("DISPLAY - BROKEN");
                    System.out.println("=========================================================");
                }
            } catch (Exception e) {
                System.out.println("ERROR occurred");;
            }
        }

        return this;
    }
}
