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

    @FindBy(xpath = "//*[7]/a")
    WebElement contextMenuButton;

    public ContextMenuPage getContextMenu() {
        click(contextMenuButton);
        return new ContextMenuPage(driver);
    }
    @FindBy(xpath = "//*[11]/a")
    WebElement dropdownListButton;
    public DropdownListPage getDropdownList() {
        click(dropdownListButton);
        return new DropdownListPage(driver);
    }
    @FindBy(xpath = "//*[10]/a")
    WebElement dragAndDropButton;
    public DragAndDropPage getDragAndDrop() {
        click(dragAndDropButton);
        return new DragAndDropPage(driver);
    }
    @FindBy(xpath = "//*[18]/a")
    WebElement fileUploadButton;
    public FileUploadPage getFileUpload() {
        click(fileUploadButton);
        return new FileUploadPage(driver);
    }
    @FindBy(xpath = "//*[28]/a")
    WebElement menu;
    public JQueryUIPage getJQueryUIPage() {
        click(menu);
       return new JQueryUIPage(driver);
    }
    @FindBy(xpath = "//*[16]/a")
    WebElement intent;
    public ExitIntentPage getExitIntent() {
        click(intent);
        return new ExitIntentPage(driver);
    }
    @FindBy(xpath = "//*[4]/a")
    WebElement image;
    public BrokenImagesPage getBrokenImages() {
        click(image);
        return new BrokenImagesPage(driver);
    }
}
