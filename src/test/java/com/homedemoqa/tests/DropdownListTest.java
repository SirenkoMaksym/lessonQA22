/*
 * created by max$
 */


package com.homedemoqa.tests;

import com.homedemoqa.pages.DropdownListPage;
import com.homedemoqa.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownListTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDropdownList();
    }
    @Test
    public void dropdownListTest(){
        new DropdownListPage(driver).selectDropdown()
                .verifySelectedDrop("Option 2");
    }
}
