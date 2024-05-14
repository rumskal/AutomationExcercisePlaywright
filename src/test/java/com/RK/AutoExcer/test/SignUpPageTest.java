package com.RK.AutoExcer.test;

import com.RK.AutoExcer.base.BaseTest;
import com.RK.AutoExcer.constants.AppConstants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SignUpPageTest extends BaseTest {
    @Test
    @Order(1)
    public void newSignUpTest(){
        loginPage = homePage.navigateToLoginPage();
        signupPage = loginPage.navigateToSignUpPage(prop.getProperty("registername").trim(),
        prop.getProperty("registeremailID").trim());

        String actualRegisterPageTitle = loginPage.getMessage();
        Assertions.assertEquals(actualRegisterPageTitle, "Enter Account Information");
    }
    @Test
    @Order(2)
    public void newSignUpInformationTest(){
        loginPage = homePage.navigateToLoginPage();
        signupPage = loginPage.navigateToSignUpPage(prop.getProperty("registername").trim(),
                prop.getProperty("registeremailID").trim());

        Assertions.assertTrue(signupPage.registerDetails(prop.getProperty("registerPassword").trim(),prop.getProperty("birthdate").trim(),
                prop.getProperty("birthmonth").trim(),prop.getProperty("birthyear").trim(),prop.getProperty("firstName").trim(),prop.getProperty("lastName").trim(),prop.getProperty("company").trim(),
                prop.getProperty("address1").trim(),prop.getProperty("address2").trim(),prop.getProperty("country").trim(),prop.getProperty("state").trim(),prop.getProperty("city").trim(),prop.getProperty("zipcode").trim(),
                prop.getProperty("mobileNumber").trim()),AppConstants.REGISTRATION_PAGE);
    }
}
