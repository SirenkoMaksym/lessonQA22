/*
 * created by max$
 */


package com.homedemoqa.tests;

import com.homedemoqa.pages.FileUploadPage;
import com.homedemoqa.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getFileUpload();
    }
    @Test
    public void fileUploadWithRobotTest(){
        new FileUploadPage(driver).performKeyWithRobot()
                .verifyFileUploaded("M17.txt");

    }
    @Test
    public void fileUploadWithDragAndDrop(){
        new FileUploadPage(driver).dragAndDropFile()
                .verifyFileUploadDragAndDrop("D1.txt");
    }
}
