package com.RK.AutoExcer.pages;

import com.microsoft.playwright.Page;

public class SignUpPage {
    private Page page;

    //1.String Locators_OR(object repository)
    private String tilteRadioButton1 ="label[for='id_gender1']";
    private String tilteRadioButton2 ="uniform-id_gender2";
    private String passwordInput = "//input[@id='password']";
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
    private String countrySelect ="//select[@id='country']";
    private String stateInput ="[id='state']";
    private String cityInput ="[id='city']";
    private String zipcodeInput="[id='zipcode']";
    private String mobileNumberInput="[id='mobile_number']";
    private String createAccountButton="//button[contains(text(),'Create Account')]";
    private String registerSuccess = "//b[normalize-space()='Account Created!']";

    //2.Page Constructor and its purpose
    public SignUpPage(Page page){
        this.page = page;
    }

    //3. Page actions/methods: navigate to relevant pages and return
    public boolean registerDetails(String password,String date,String month,String year,String firstName,String lastName,String company,String addressLine1,String addressLine2,String country,String state,String city, String pincode, String Mnumber){
        page.click(tilteRadioButton1);
        page.fill(passwordInput,password);
        page.selectOption(birthDate,date);
        //page.fill(birthDate,date);
        page.selectOption(birthMonth,month);
        //page.fill(birthMonth,month);
        page.selectOption(birthYear,year);
        //page.fill(birthYear,year);
        page.click(newsletterCheckbox);
        page.fill(firstNameInput,firstName);
        page.fill(lastNameInput,lastName);
        page.fill(companyInput,company);
        page.fill(address1Input,addressLine1);
        page.fill(address2Input,addressLine2);
        page.selectOption(countrySelect,country);
        //page.fill(countrySelect,country);
        page.fill(stateInput,state);
        page.fill(cityInput,city);
        page.fill(zipcodeInput,pincode);
        page.fill(mobileNumberInput,Mnumber);
        page.click(createAccountButton);
        if(page.isVisible(registerSuccess)){
            System.out.println("user is logged in successfully...");
            return true;
        }
        return false;
    }
    }



