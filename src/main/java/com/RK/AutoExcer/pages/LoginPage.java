package com.RK.AutoExcer.pages;

import com.microsoft.playwright.Page;

public class LoginPage {
    private Page page;
    //1.String Locators_OR(object repository)
    private String emailId = "input[data-qa='login-email']";
    private String passwords = "input[placeholder='Password']";
    private String loginBtn = "//button[normalize-space()='Login']";
    private String loggedAs = "//a[contains(text(),'Logged in as')]";

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

}
