package pages.searchPage;

import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import utils.MobilePageWait;
import static pages.searchPage.SearchPageLocator.*;
import static utils.MobileActions.clickElementBy;

/**
 * Page class representing the Search Page of the mobile application.
 * Extends MobilePageWait to handle mobile-specific page interactions.
 */
@Slf4j
public class SearchPage  extends MobilePageWait {

    public boolean checkIfSearchAllTabIsDisplayed() { return driver.findElement(SEARCH_PAGE_ALL_TAB).isDisplayed(); }
    public boolean checkIfSearchNewsTabIsDisplayed() { return driver.findElement(SEARCH_PAGE_NEWS_TAB).isDisplayed(); }
    public boolean checkIfSearchPlayersTabIsDisplayed() { return driver.findElement(SEARCH_PAGE_PLAYERS_TAB).isDisplayed(); }
    public boolean checkIfSearchTeamsTabIsDisplayed() { return driver.findElement(SEARCH_PAGE_TEAMS_TAB).isDisplayed(); }
    public boolean checkIfSearchFirstResultRowIsDisplayed() { return driver.findElement(SEARCH_PAGE_FIRST_RESULT_ROW).isDisplayed(); }
    public boolean checkIfPlayerHeaderIsDisplayed() { return driver.findElement(SEARCH_PAGE_PLAYER_PAGE).isDisplayed(); }
    public boolean checkIfPlayerSeasonTabIsDisplayed() { return driver.findElement(SEARCH_PAGE_SEASON_TAB).isDisplayed(); }
    public boolean checkIfPlayerGameLogTabIsDisplayed() { return driver.findElement(SEARCH_PAGE_GAME_LOG_TAB).isDisplayed(); }
    public boolean checkIfPlayerInfoTabIsDisplayed() { return driver.findElement(SEARCH_PAGE_INFO_TAB).isDisplayed(); }
    public boolean checkIfPlayerBirthDateIsDisplayed() { return driver.findElement(SEARCH_PAGE_PLAYER_BIRTH_DATE).isDisplayed(); }
    public boolean checkIfPlayerGamesIsDisplayed() { return driver.findElement(SEARCH_PAGE_PLAYER_GAMES).isDisplayed(); }
    public boolean checkIfNavigateBackButtonIsDisplayed() { return driver.findElement(SEARCH_PAGE_NAVIGATE_BACK).isDisplayed(); }

    /**
     * Verifies all tabs and search results on the Search Page.
     */
    @Step("Verify all tabs, Search results on Search Page")
    public void verifyTabsAnsResultsOnSearchPage() {
        log.info("Verify all tabs, Search results on Search Page");
        Assert.assertTrue(checkIfSearchAllTabIsDisplayed());
        Assert.assertTrue(checkIfSearchNewsTabIsDisplayed());
        Assert.assertTrue(checkIfSearchPlayersTabIsDisplayed());
        Assert.assertTrue(checkIfSearchTeamsTabIsDisplayed());
        Assert.assertTrue(checkIfSearchFirstResultRowIsDisplayed());
    }

    /**
     * Clicks the first search result on the Search Page.
     */
    @Step("Click first Search results on Search Page")
    public void clickFirstSearchResultOnSearchPage() {
        log.info("Click first Search results on Search Page");
        clickElementBy(SEARCH_PAGE_FIRST_RESULT);
        Assert.assertTrue(checkIfPlayerHeaderIsDisplayed());
    }

    /**
     * Verifies the player page opened after clicking on a search result.
     */
    @Step("Verify the player Page on Search Page")
    public void verifyThePlayerPageOpened() {
        log.info("Verify the player Page on Search Page");
        Assert.assertTrue(checkIfPlayerSeasonTabIsDisplayed());
        Assert.assertTrue(checkIfPlayerGameLogTabIsDisplayed());
        Assert.assertTrue(checkIfPlayerInfoTabIsDisplayed());
        Assert.assertTrue(checkIfNavigateBackButtonIsDisplayed());
    }

    /**
     * Verifies the player sub-tabs and navigates back to the search results page.
     */
    @Step("Verify the player SubTabs and Navigate Back to Search results Page")
    public void verifySubTabsOnPlayerPageAndNavigateBack() {
        log.info("Verify the player SubTabs and Navigate Back to Search results Page");
        clickElementBy(SEARCH_PAGE_INFO_TAB);
        Assert.assertTrue(checkIfPlayerBirthDateIsDisplayed());
        clickElementBy(SEARCH_PAGE_GAME_LOG_TAB);
        Assert.assertTrue(checkIfPlayerGamesIsDisplayed());
        clickElementBy(SEARCH_PAGE_NAVIGATE_BACK);
        Assert.assertTrue(checkIfSearchAllTabIsDisplayed());
        Assert.assertTrue(checkIfSearchNewsTabIsDisplayed());
        Assert.assertTrue(checkIfSearchPlayersTabIsDisplayed());
        Assert.assertTrue(checkIfSearchTeamsTabIsDisplayed());
        Assert.assertTrue(checkIfSearchFirstResultRowIsDisplayed());
    }

    /**
     * Navigates back to the Home page from the Search Page.
     */
    @Step("Navigate Back to Home page from Search Page")
    public void navigateBacKToHomePageFromSearchPage() {
        log.info("Navigate Back to Home page from Search Page");
        clickElementBy(SEARCH_PAGE_NAVIGATE_BACK);
    }

}
