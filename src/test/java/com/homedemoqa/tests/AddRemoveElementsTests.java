/*
 * created by max$
 */


package com.homedemoqa.tests;

import com.homedemoqa.pages.AddRemoveElementsPage;
import com.homedemoqa.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddRemoveElementsTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getAddRemoveElements();
    }

    @Test
    public void addElementsTest() {
        new AddRemoveElementsPage(driver).addElemenets()
                .verifyAddElements()
        ;

    }

    @Test
    public void removeElementsTest() {
        new AddRemoveElementsPage(driver).removeElements()
                .verifyRemoveElements()
        ;
    }
}
