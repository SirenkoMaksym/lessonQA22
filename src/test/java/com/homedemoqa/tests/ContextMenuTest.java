/*
 * created by max$
 */


package com.homedemoqa.tests;

import com.homedemoqa.pages.ContextMenuPage;
import com.homedemoqa.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContextMenuTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getContextMenu();
    }
    @Test
    public void contextMenuTest(){
        new ContextMenuPage(driver).contextMenuClick()
                .verifyContextMenu("selected a context menu");
    }
}
