package com.RK.AutoExcer.test;

import com.RK.AutoExcer.base.BaseTest;
import com.RK.AutoExcer.constants.AppConstants;
import com.microsoft.playwright.junit.UsePlaywright;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@UsePlaywright
public class HomePageTest extends BaseTest {
    @Test
    public void homPageTitleTest(){
        String actualTitle = homePage.getHomePageTitle();
        //Assertions.assertEquals(actualTitle,"Automation Exercise");
        //above Assertion can be refactored by including a new class for App constacnts.
        Assertions.assertEquals(actualTitle, AppConstants.HOME_PAGE_TITLE);
    }
    @Test
    public void homPageURLTest(){
        String actualURL = homePage.getHomePageURL();
        Assertions.assertEquals(actualURL,prop.getProperty("url"));
    }
}
