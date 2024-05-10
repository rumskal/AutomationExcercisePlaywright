package com.RK.AutoExcer.pages;
import com.microsoft.playwright.Page;

public class HomePage {
    protected Page page;
    //1.String Locators_OR(object repository)
    private String productsPage="a[href='/products']";
    private String signUpLoginPage = "a[href='/login']";
    private String contactUS = "//a[normalize-space()='Contact us']";

    //2.Page Constructor and its purpose
    public HomePage(Page page){
        this.page = page;
    }
    //3. Page actions/methods - give me the home page title,
    public String getHomePageTitle() {
        String title =  page.title();//capture title and store in String
        System.out.println("page title: " + title);
        return title;
    }
    public String getHomePageURL() {// capture homepage url
        String url =  page.url();
        System.out.println("page url : " + url);
        return url;
    }
    //ceate page action ofr login
//    public LoginPage navigateToSignUpLogin(){
//        page.click(myAccountLink);
//        page.click(loginLink);//when wver we have to click on something and new page ,
//        // then this method responsiblity to return next landing page , then change void to return page
//        //or u can use pagelocator.click
//        return new LoginPage(page);
//    }
}
