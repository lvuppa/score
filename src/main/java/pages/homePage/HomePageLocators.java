package pages.homePage;

import org.openqa.selenium.By;

/**
 * Locator class containing static final By objects for elements on the Home Page.
 * These locators are used to identify various elements on the Home Page.
 */
public class HomePageLocators {

    public static final By HOME_PAGE_NEWS_TAB_BOTTOM = By.xpath("//android.widget.FrameLayout[@content-desc=\"News\"]");
    public static final By HOME_PAGE_SCORES_TAB_BOTTOM = By.xpath("//android.widget.FrameLayout[@content-desc=\"Scores\"]");
    public static final By HOME_PAGE_FAVORITES_TAB_BOTTOM = By.xpath("//android.widget.FrameLayout[@content-desc=\"Favorites\"]");
    public static final By HOME_PAGE_DISCOVER_TAB_BOTTOM = By.xpath("//android.widget.FrameLayout[@content-desc=\"Discover\"]");
    public static final By HOME_PAGE_LEAGUES_TAB_BOTTOM = By.xpath("//android.widget.FrameLayout[@content-desc=\"Leagues\"]");
    public static final By HOME_PAGE_SEARCH_BAR = By.xpath("//android.widget.TextView[@text=\"Teams, Players, and News\"]");
    public static final By HOME_PAGE_SEARCH_FIELD = By.xpath("//android.widget.AutoCompleteTextView[@text=\"Teams, Players, and News\"]");
    public static final By HOME_PAGE_ACCOUNT_ICON = By.xpath("//android.widget.ImageButton");
    public static final By HOME_PAGE_MESSAGE_ICON = By.xpath("//android.widget.ImageView[@resource-id=\"com.fivemobile.thescore:id/message_icon\"]");

}
