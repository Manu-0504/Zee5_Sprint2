package steps;

import Pages.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import utils.BrowserManager;
import utils.QAprops;
import utils.TestDataReader;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class stepDefinations {

    private WebDriver driver;

HashMap<String,String> data;
    Scenario scenario;

   String url;
    public stepDefinations(BrowserManager browserManager) {
        this.driver = browserManager.getDriver();
    }
        @Before(order = 1)
        public void before(Scenario scenario){
         this.scenario = scenario;

    }

    @Given("user navigates to the TV Shows Page page")
    public void user_navigates_to_the_tv_shows_page_page() {
        url=QAprops.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }
    @When("the user enter the Zee Telugu HD Shows")
    public void the_user_enter_the_zee_telugu_hd_shows() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
//     HomePage homePage=new HomePage(driver);
//        data = TestDataReader.getData(scenario.getName());
//        homePage.getTvShowsPage().click();
//        Thread.sleep(3000);
//        homePage.getTvShowsSearchPage().click();
//        Thread.sleep(3000);
//        homePage.getTvShowsChannelPage().sendKeys("SaReGaMaPa Championship 2023");
//        Thread.sleep(3000);

    }
    @Then("the SaReGaMaPa Championship {int} video should be displayed")
    public void the_sa_re_ga_ma_pa_championship_video_should_be_displayed(Integer int1) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Given("user navigates to the Cricket Shows Page page")
    public void user_navigates_to_the_cricket_shows_page_page() {
        url=QAprops.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }
    @When("the user enter the Cricket")
    public void the_user_enter_the_cricket() throws InterruptedException{
//        data = TestDataReader.getData(scenario.getName());
//        HomePage homePage=new HomePage(driver);
//        Thread.sleep(3000);
//      //  homePage.getTvShowsCircketPage().click();
//        Thread.sleep(3000);

    }
    @Then("the  FinalMatch HighLights video should be displayed")
    public void the_final_match_high_lights_video_should_be_displayed() {

    }






}
