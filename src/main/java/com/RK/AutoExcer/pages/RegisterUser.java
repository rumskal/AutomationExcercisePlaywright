package com.RK.AutoExcer.pages;

import com.microsoft.playwright.Page;

public class RegisterUser {
    private Page page;

    //1.String Locators_OR(object repository)
      private String tilteRadioButton1 ="id_gender1";
    private String tilteRadioButton2 ="uniform-id_gender2";
    private String password = "//input[@data-qa='login-password']";
    private String birthDate = "[id = 'days']";
    private String birthMonth ="//select[@id='months']";
    private String birthYear  = "[id = 'years']";
    private String newsletterCheckbox ="[id = 'newsletter']";
    private String specialOffersCheckbox ="[id = 'optin']";
    private String firstNameInput ="[id = 'first_name']";
    private String lastNameInput ="[id = 'last_name']";
    private String companyInput ="[id='company']";
    private String address1Input ="[id='address1']";
    private String address2Input ="[id='address2']";
    private String countrySelect ="[id='country']";
    private String stateInput ="[id='state']";
    private String cityInput ="[id='city']";
    private String zipcodeInput="[id='zipcode']";
    private String mobileNumberInput="[id='mobile_number']";
    private String createAccountButton="//button[contains(text(),'Create Account')]";

    //2.Page Constructor and its purpose
    public RegisterUser(Page page){
        this.page = page;
    }

    //3. Page actions/methods: navigate to relevant pages and return


}
