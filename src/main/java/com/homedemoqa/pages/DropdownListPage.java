/*
 * created by max$
 */


package com.homedemoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class DropdownListPage extends BasePage {
    public DropdownListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropdown;

    //TODO А нужен ли в таком тесте этот метод? Вот в чем вопрос...Или его в один сразу делать?
    public DropdownListPage selectDropdown() {
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 2");
        pause(1000);
        return this;
    }

    public DropdownListPage verifySelectedDrop(String text) {
        Select select = new Select(dropdown);
        Assert.assertEquals(select.getFirstSelectedOption().getText(), text);
        return this;
    }
}
