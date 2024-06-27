/*
 * created by max$
 */


package com.homedemoqa.tests;

import com.homedemoqa.pages.HomePage;
import com.homedemoqa.pages.HoversPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoversTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getHovers();
    }

    @Test
    public void SelectSubMenuUser1(){
        new HoversPage(driver).selectSubUser1()
               .verifyUser1();
    }
    @Test
    public void SelectSubMenuUser2(){
        new HoversPage(driver).selectSubUser2()
                .verifyUser2();
    }
    @Test
    public void SelectSubMenuUser3(){
        new HoversPage(driver).selectSubUser3()
                .verifyUser3();
    }
}
