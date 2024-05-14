package com.RK.AutoExcer.pages;

import com.microsoft.playwright.Page;

public class LoginPage {
    private Page page;
    //1.String Locators_OR(object repository)
    private String emailId = "input[data-qa='login-email']";
    private String passwords = "input[placeholder='Password']";
    private String loginBtn = "//button[normalize-space()='Login']";
    private String loggedAs = "//a[contains(text(),'Logged in as')]";
    private String errorMessageWrongLogin = "//p[normalize-space()='Your email or password is incorrect!']";
    private String logoutBtn = "a[href='/logout']";
    private String newUserName = "input[type = \"text\"]";
    private String newUserEmailId = "input[data-qa='signup-email']";
    private String signUpButton = "button[data-qa='signup-button']";
    private String registerPageMessage = "//b[contains(.,'Enter Account Information')]";

    //2.Page Constructor and its purpose
    public LoginPage(Page page){
        this.page = page;
    }

    //3. Page actions/methods: navagate to login methos which return login page,
    public String getLoginPageTitle(){
        return page.title();
    }
    public boolean loginAsUser(String appUserName, String appPassword){
        page.fill(emailId,appUserName);
        page.fill(passwords,appPassword);
        page.click(loginBtn);
        if(page.isVisible(loggedAs)){
            System.out.println("user is logged in successfully...");
            return true;
        }
        return false;
        }

    public boolean logout(){
        return page.isVisible(logoutBtn);

    }
    public String invalidUserLogin(String appUserName, String appPassword){
        page.fill(emailId,appUserName);
        page.fill(passwords,appPassword);
        page.click(loginBtn);
        return page.textContent(errorMessageWrongLogin);
    }
    public SignUpPage navigateToSignUpPage(String name, String emailID){
        page.fill(newUserName,name);
        page.fill(newUserEmailId,emailID);
        page.click(signUpButton);
        return new SignUpPage(page);
    }
    public String getMessage(){
        String regisMessage =  page.textContent(registerPageMessage);
        return regisMessage;

    }

}
