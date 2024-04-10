package pages.homePage;

import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import utils.MobilePageWait;
import static pages.homePage.HomePageLocators.*;
import static utils.MobileActions.*;

/**
 * Page class representing the Home Page of the mobile application.
 * Extends MobilePageWait to handle mobile-specific page interactions.
 */
@Slf4j
public class HomePage extends MobilePageWait {

    public boolean checkIfNewsTabIsDisplayed() { return driver.findElement(HOME_PAGE_NEWS_TAB_BOTTOM).isDisplayed(); }
    public boolean checkIfScoresTabIsDisplayed() { return driver.findElement(HOME_PAGE_SCORES_TAB_BOTTOM).isDisplayed(); }
    public boolean checkIfFavoritesTabIsDisplayed() { return driver.findElement(HOME_PAGE_FAVORITES_TAB_BOTTOM).isDisplayed(); }
    public boolean checkIfDiscoverTabIsDisplayed() { return driver.findElement(HOME_PAGE_DISCOVER_TAB_BOTTOM).isDisplayed(); }
    public boolean checkIfLeaguesTabIsDisplayed() { return driver.findElement(HOME_PAGE_LEAGUES_TAB_BOTTOM).isDisplayed(); }
    public boolean checkIfSearchBarIsDisplayed() { return driver.findElement(HOME_PAGE_SEARCH_BAR).isDisplayed(); }
    public boolean checkIfMessageIconIsDisplayed() { return driver.findElement(HOME_PAGE_MESSAGE_ICON).isDisplayed(); }
    public boolean checkIfAccountIconIsDisplayed() { return driver.findElement(HOME_PAGE_ACCOUNT_ICON).isDisplayed(); }
    public boolean checkIfSearchFieldIsDisplayed() { return driver.findElement(HOME_PAGE_SEARCH_FIELD).isDisplayed(); }

    /**
     * Verifies the display of all tabs, icons, and search bar on the Home Page.
     * Asserts each element's presence.
     */
    @Step("Verify all tabs, Icons and Searchbar on Home Page")
    public void verifyHomePageTabsAndIconsOnHomePage() {
        log.info("all tabs, Icons and Searchbar on Home Page");
        Assert.assertTrue(checkIfDiscoverTabIsDisplayed());
        Assert.assertTrue(checkIfFavoritesTabIsDisplayed());
        Assert.assertTrue(checkIfLeaguesTabIsDisplayed());
        Assert.assertTrue(checkIfNewsTabIsDisplayed());
        Assert.assertTrue(checkIfScoresTabIsDisplayed());
        Assert.assertTrue(checkIfMessageIconIsDisplayed());
        Assert.assertTrue(checkIfAccountIconIsDisplayed());
        Assert.assertTrue(checkIfSearchBarIsDisplayed());
    }

    /**
     * Performs a search for a player, league, or team on the Home Page.
     * @param searchText The text to search for.
     */
    @Step("Perform Search for Player, League or Team on Home Page")
    public void performSearch(String searchText) {
        log.info("Perform Search for Player, League or Team on Home Page");
        clickElementBy(HOME_PAGE_SEARCH_BAR);
        Assert.assertTrue(checkIfSearchFieldIsDisplayed());
        clearAndFillInFieldWith(HOME_PAGE_SEARCH_FIELD, searchText);
    }

}
