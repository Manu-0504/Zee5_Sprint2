package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public WebElement getTvShowsPage() {
        return TvShowsPage;
    }

    @FindBy(xpath = "//a[@class=\"noSelect    \"][1]")
    private WebElement TvShowsPage;
//    @FindBy(xpath = "//div[@class=\"moreMenuBtn iconInitialLoad-ic_Bento\"][1]")
//    private WebElement TvShowsCircketPage;
//
//    public WebElement getTvShowsCircketPage() {
//        return TvShowsCircketPage;
//    }

    @FindBy(xpath = "//input[@id=\"searchInput\"]")
    private WebElement TvShowsChannelPage;

    public WebElement getTvShowsChannelPage() {
        return TvShowsChannelPage;
    }

    @FindBy(xpath = "//input[@placeholder=\"Search for Movies, Shows, Channels etc.\"]")
    private WebElement TvShowsSearchPage;

    public WebElement getTvShowsSearchPage() {
        return TvShowsSearchPage;
    }
}
