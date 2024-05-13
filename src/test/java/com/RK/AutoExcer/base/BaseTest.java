package com.RK.AutoExcer.base;

import com.RK.AutoExcer.factory.PlaywrightFactory;
import com.RK.AutoExcer.pages.HomePage;
import com.RK.AutoExcer.pages.LoginPage;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.junit.UsePlaywright;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import java.util.Properties;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@UsePlaywright
public class BaseTest {
    protected static Page page;
    protected static Properties prop;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected static PlaywrightFactory pf;//create obj of playwright factory class

    @BeforeAll
    public void setup() {
        pf = new PlaywrightFactory();
        prop = pf.init_prop();
        page = pf.initBrowser(prop);
        homePage = new HomePage(page);

    }
    @AfterAll
    public void tearDown(){
        page.context().browser().close();
    }
   }
