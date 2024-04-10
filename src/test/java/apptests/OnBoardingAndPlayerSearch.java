package apptests;

import basetest.BaseTestAndroid;
import dataProviders.DataProviders;
import io.qameta.allure.Description;
import listeners.TestAllureListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OnBoarding.OnBoardingScreen;
import pages.homePage.HomePage;
import pages.searchPage.SearchPage;
import ru.yandex.qatools.allure.annotations.Title;
import lombok.extern.slf4j.Slf4j;

/**
 * Class representing test scenarios for onboarding and player search functionality.
 * Extends BaseTestAndroid to utilize Android-specific functionalities.
 */
@Slf4j
@Listeners({TestAllureListener.class})
public class OnBoardingAndPlayerSearch extends BaseTestAndroid {

    // Instances of page objects
    OnBoardingScreen onBoardingScreen = new OnBoardingScreen();
    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();

    /**
     * Test method for initial onboarding flow and player search functionality.
     * @param playerName The name of the player to search.
     */
    @Title("Initial OnBoarding Flow")
    @Description("Initiating the GetStarted flow for theScore")
    @Test(groups = {"SMOKE"}, dataProvider = "playerNames", dataProviderClass = DataProviders.class)
    public void appOnBoardingFlow(String playerName) {
        // Initial onBoarding flow assertions
        Assert.assertTrue(onBoardingScreen.checkIfGetStartedButtonIsDisplayed());
        Assert.assertTrue(onBoardingScreen.checkIfWelcomeTextIsDisplayed());
        Assert.assertTrue(onBoardingScreen.checkIfHaveAccLoginTextIsDisplayed());
        onBoardingScreen.clickTheGetStarted();
        onBoardingScreen.checkIfChooseLeagueTextIsDisplayed();
        onBoardingScreen.checkIfContinueBtnIsDisplayed();
        log.info("The Control is on Choose League page and all validations are successful");
        onBoardingScreen.clickTheContinueBtn();

        // Handling location sharing screen
        if (onBoardingScreen.checkIfAllowLocBtnIsDisplayed()) {
            log.info("Allow Location Screen is visible and we proceed further checking the May be later Btn !!!!");
            if (onBoardingScreen.checkIfMayBeLaterBtnIsDisplayed()) {
                log.info("May_BE_LATER_BUTTON is visible and we proceed further Clicking the May be later Btn !!!!");
                onBoardingScreen.clickTheMaybeLaterBtn();
            }
        } else {
            log.info("Allow Location Screen is not visible");
        }
        log.info("The Control is on Location Sharing Screen and all validations are successful");

        // Validations on default tabs during onboarding
        onBoardingScreen.verifyTheDefaultTabsSelectedWhileOnBoarding();
        log.info("All the tab validations on the default tabs are successful");

        // Selecting favorite team and setting default notification selections
        onBoardingScreen.selectFavTeam();
        onBoardingScreen.defaultNotificationSelectionsAndConfirm();
        onBoardingScreen.notificationPermission();
        onBoardingScreen.navTabsHomePage();

        // Validating home page tabs and icons
        homePage.verifyHomePageTabsAndIconsOnHomePage();

        // Performing search for a player
        homePage.performSearch(playerName);

        // Validating search page tabs and search results
        searchPage.verifyTabsAnsResultsOnSearchPage();
        searchPage.clickFirstSearchResultOnSearchPage();
        searchPage.verifyThePlayerPageOpened();
        searchPage.verifySubTabsOnPlayerPageAndNavigateBack();
        searchPage.navigateBacKToHomePageFromSearchPage();
    }
}
