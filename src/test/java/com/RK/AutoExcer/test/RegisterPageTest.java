package com.RK.AutoExcer.test;

import com.RK.AutoExcer.base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RegisterPageTest extends BaseTest {
    @Test
    @Order(1)
    public void newregisterUserTest(){
        loginPage = homePage.navigateToSignUpLogin();
        String actualRegisterPageTitle = loginPage.newUserSignUP(prop.getProperty("registername").trim(),
        prop.getProperty("registeremailID").trim());
        Assertions.assertEquals(actualRegisterPageTitle, "Enter Account Information");
    }

}
