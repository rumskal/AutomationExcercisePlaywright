
import com.RK.AutoExcer.factory.PlaywrightFactory;
import com.RK.AutoExcer.pages.HomePage;
import com.microsoft.playwright.Page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import java.util.Properties;

public class MyStepdefs {
    protected static Page page;
    protected static Properties prop;
    private HomePage homePage;
    protected static PlaywrightFactory pf;//create obj of playwright factory class

    @Before
    public void setup() {
        pf = new PlaywrightFactory();
        page = pf.initBrowser(pf.init_prop());
    }

    @After
    public void tearDown(){
        page.context().browser().close();
    }

    @Given("I am on the Automation Exercise homepage")
    public void iAmOnTheAutomationExerciseHomepage() {

        homePage = new HomePage(pf.initBrowser(pf.init_prop()));
    }

    @Then("the homepage title should display {string}")
    public void theHomepageTitleShouldDisplay(String expectedTitle) {
        String actualTitle = homePage.getHomePageTitle();
        Assertions.assertEquals(expectedTitle, actualTitle);
    }
}
