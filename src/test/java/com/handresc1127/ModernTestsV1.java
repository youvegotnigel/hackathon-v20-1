package com.handresc1127;

import com.handresc1127.pages.homePage;
import com.handresc1127.utils.BaseTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ModernTestsV1 extends BaseTests {

    @BeforeClass
    public static void startVisualTestSuite(){
        eyesManager.setBatchName("UFG Hackathon");
        eyesManager.setForceFullScreen(true);
    }

    @Test()
    public void task1()
    {
        homePage.navigateToV1();
        eyesManager.validateWindows("Cross-Device Elements Test");
    }

    @Test()
    public void task2(){
        homePage.navigateToV1();
        homePage.filterForBlack();
        eyesManager.validateWindows("Filter Results");
        eyesManager.validateElement(homePage.getGridProducts(),"Product Grid");
    }

    @Test
    public void task3(){

    }
}
