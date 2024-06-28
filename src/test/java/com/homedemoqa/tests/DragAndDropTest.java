/*
 * created by max$
 */


package com.homedemoqa.tests;

import com.homedemoqa.pages.DragAndDropPage;
import com.homedemoqa.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDragAndDrop();
    }
    @Test
    public void DragAndDropTest(){
        new DragAndDropPage(driver).dragAndDrop()
                .verifyDragAndDrop("B");
    }
}
