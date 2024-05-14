package com.RK.AutoExcer.test;
import com.RK.AutoExcer.base.BaseTest;
import com.RK.AutoExcer.constants.AppConstants;
import org.junit.jupiter.api.*;

 @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    public class LoginPageTest extends BaseTest {

        @Test
        @Order(1)
        public void loginPageNavigationTest(){
            loginPage = homePage.navigateToLoginPage();
            String actualLoginPageTitle = loginPage.getLoginPageTitle();
            System.out.println("The page actual title page:" + actualLoginPageTitle);
            Assertions.assertEquals(actualLoginPageTitle, AppConstants.LOGIN_PAGE_TITLE);
        }
     @Test
     @Order(2)
     public void appLoginTest(){
           Assertions.assertTrue(loginPage.loginAsUser(prop.getProperty("username").trim(),prop.getProperty("password").trim()));
     }

     @Test
     @Order(3)
     public void logoutTest(){
         Assertions.assertTrue(loginPage.logout());

     }

     @Test
     @Order(4)
     public void wrongPasswordLoginTest(){
     loginPage = homePage.navigateToLoginPage();
         Assertions.assertEquals(loginPage.invalidUserLogin(prop.getProperty("username").trim(),prop.getProperty("wrongPassword").trim()), AppConstants.LOGIN_ERROR_TITLE);
     }
}
