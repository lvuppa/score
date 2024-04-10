package pages.searchPage;

import org.openqa.selenium.By;

/**
 * Locator class containing static final By objects for elements on the Search Page.
 * These locators are used to identify various elements on the Search Page.
 */
public class SearchPageLocator {

    protected static final By SEARCH_PAGE_ALL_TAB = By.xpath("//android.widget.TextView[@text=\"ALL\"]");
    protected static final By SEARCH_PAGE_TEAMS_TAB = By.xpath("//android.widget.TextView[@text=\"TEAMS\"]");
    protected static final By SEARCH_PAGE_PLAYERS_TAB = By.xpath("//android.widget.TextView[@text=\"PLAYERS\"]");
    protected static final By SEARCH_PAGE_NEWS_TAB = By.xpath("//android.widget.TextView[@text=\"NEWS\"]");
    protected static final By SEARCH_PAGE_SEASON_TAB = By.xpath("//android.widget.LinearLayout[@content-desc=\"Season\"]");
    protected static final By SEARCH_PAGE_GAME_LOG_TAB = By.xpath("//android.widget.LinearLayout[@content-desc=\"Game Log\"]");
    protected static final By SEARCH_PAGE_INFO_TAB = By.xpath("//android.widget.LinearLayout[@content-desc=\"Info\"]");
    protected static final By SEARCH_PAGE_FIRST_RESULT_ROW = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_name\"]");
    protected static final By SEARCH_PAGE_FIRST_RESULT = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_name\"]");
    protected static final By SEARCH_PAGE_PLAYER_PAGE = By.xpath("//android.view.ViewGroup[@resource-id=\"com.fivemobile.thescore:id/player_header\"]");
    protected static final By SEARCH_PAGE_PLAYER_BIRTH_DATE = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/title\" and @text=\"Birth Date\"]");
    protected static final By SEARCH_PAGE_PLAYER_GAMES = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_name\" and @text=\"GAMES\"]");
    protected static final By SEARCH_PAGE_NAVIGATE_BACK = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

}
