package pages.OnBoarding;

import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import utils.MobilePageWait;

import static constants.Constants.ALLOW_NOTIFICATION_POPUP_TEXT;
import static pages.OnBoarding.OnBoardingScreenLocator.*;
import static pages.homePage.HomePageLocators.HOME_PAGE_NEWS_TAB_BOTTOM;
import static utils.MobileActions.*;

/**
 * Page class representing the OnBoarding Page of the mobile application.
 * Extends MobilePageWait to handle mobile-specific page interactions.
 */
@Slf4j
public class OnBoardingScreen extends MobilePageWait {

    public boolean checkIfChooseLeagueTextIsDisplayed() { return driver.findElement(CHOOSE_LEAGUE).isDisplayed(); }
    public boolean checkIfContinueBtnIsDisplayed() { return driver.findElement(CONTINUE_BTN).isDisplayed(); }
    public boolean checkIfAllowLocBtnIsDisplayed() { return driver.findElement(ALLOW_LOCATION_BTN).isDisplayed(); }
    public boolean checkIfMayBeLaterBtnIsDisplayed() { return driver.findElement(MAY_BE_LATER_BTN).isDisplayed(); }

    public boolean checkIfWelcomeTextIsDisplayed() {
        return driver.findElement(WELCOME_TEXT).isDisplayed();
    }
    public boolean checkIfHaveAccLoginTextIsDisplayed() { return driver.findElement(HAVE_AN_ACCOUNT_LOG_IN).isDisplayed(); }
    public boolean checkIfGetStartedButtonIsDisplayed() { return driver.findElement(GET_STARTED_BTN).isDisplayed(); }

    /**
     * Clicks the "Get Started" button on the Onboarding Page.
     */
    @Step("Click the Get Started Button on onBoarding Page")
    public void clickTheGetStarted() {
        log.info("Verifying the Get Started Button on onBoarding Page");
        waitUntilElementClickable(GET_STARTED_BTN);
        clickElementBy(GET_STARTED_BTN);
    }

    /**
     * Clicks the "Continue" button on the Onboarding Page.
     */
    @Step("Click the Continue Button on onBoarding Page")
    public void clickTheContinueBtn() {
        log.info("Verifying and click Continue Button on onBoarding Page");
        waitUntilElementClickable(CONTINUE_BTN);
        clickElementBy(CONTINUE_BTN);
    }

    /**
     * Clicks the "May Be Later" button on the Onboarding Page.
     */
    @Step("Click the MAY_BE_LATER Button on onBoarding Page")
    public void clickTheMaybeLaterBtn() {
        log.info("Verifying the MAY_BE_LATER Button on onBoarding Page");
        waitUntilElementClickable(MAY_BE_LATER_BTN);
        clickElementBy(MAY_BE_LATER_BTN);
    }

    /**
     * Clicks the "Allow Location" button on the Onboarding Page.
     */
    @Step("Click the ALLOW_LOCATION Button on onBoarding Page")
    public void clickTheAllowLocationBtn() {
        log.info("Verifying the ALLOW_LOCATION Button on onBoarding Page");
        waitUntilElementClickable(ALLOW_LOCATION_BTN);
        clickElementBy(ALLOW_LOCATION_BTN);
    }

    /**
     * Verifies the default tabs selected on the Onboarding Page.
     */
    @Step("Verify the Default tabs selected on onBoarding Page")
    public void verifyTheDefaultTabsSelectedWhileOnBoarding() {
        log.info("Verify the Default tabs selected on onBoarding Page");
        Assert.assertTrue(isElementDisplayed(RECOMMENDED_LIST_PRE_SELECTED));
        Assert.assertTrue(isElementEnabled(RECOMMENDED_LIST));
        Assert.assertTrue(isElementEnabled(NBA_LIST));
        Assert.assertTrue(isElementEnabled(NFL_LIST));
    }

    /**
     * Scrolls to a particular favorite team and selects it on the Onboarding Page.
     */
    @Step("Scroll to Particular Fav team and select the Team onBoarding Page")
    public void scrollAndSelectFavTeam() {
        log.info("Scroll to Particular Fav team and select the Team onBoarding Page");
        scrollToElement(FAV_TEAM_NAME, "down");
    }

    /**
     * Selects a favorite team on the Onboarding Page.
     */
    @Step("Select the Team onBoarding Page")
    public void selectFavTeam() {
        log.info("Select the Team onBoarding Page");
        clickElementBy(FAV_TEAM_NAME);
        clickElementBy(CONTINUE_BTN);
    }

    /**
     * Verifies the notification options on the Onboarding Page.
     */
    @Step("Verify the Notifications options onBoarding Page")
    public void defaultNotificationSelectionsAndConfirm() {
        log.info("Verify the Notifications options onBoarding Page");
        Assert.assertTrue(isElementDisplayed(BREAKING_NEWS_TOGGLE));
        Assert.assertTrue(isElementDisplayed(GAME_END_TOGGLE));
        Assert.assertTrue(isElementDisplayed(GAME_START_TOGGLE));
        Assert.assertTrue(isElementDisplayed(SCORING_UPDATES_TOGGLE));
        clickElementBy(DONE_BTN);
        Assert.assertTrue(isElementDisplayed(EMAIL_SIGNUP_BTN));
        clickElementBy(MAY_BE_LATER_BTN);
    }

    /**
     * Allows notification permissions on the Onboarding Page.
     */
    @Step("Allow Notification Permissions on onBoarding Page")
    public void notificationPermission() {
        log.info("Allow Notification Permissions on onBoarding Page");
        Assert.assertTrue(isElementDisplayed(ALLOW_NOTIFICATION_PERMISSION_POPUP_TEXT));
        log.info("The Text on the allow Permissions pop-up:---> " + getTextFromElement(ALLOW_NOTIFICATION_PERMISSION_POPUP_TEXT));
        Assert.assertEquals(getTextFromElement(ALLOW_NOTIFICATION_PERMISSION_POPUP_TEXT), ALLOW_NOTIFICATION_POPUP_TEXT);
        Assert.assertTrue(isElementDisplayed(ACCEPT_ALLOW_NOTIFICATION_PERMISSION));
        Assert.assertTrue(isElementDisplayed(DENY_ALLOW_NOTIFICATION_PERMISSION));
        clickElementBy(ACCEPT_ALLOW_NOTIFICATION_PERMISSION);
    }

    /**
     * Verifies the navigation tabs on the HOME Page.
     */
    @Step("Verify the Navigation tabs on HOME Page")
    public void navTabsHomePage() {
        log.info("Verify the Navigation tabs on HOME Page");
        Assert.assertTrue(isElementDisplayed(HOME_PAGE_NEWS_TAB_BOTTOM));
        log.info("Verified the NEWS Navigation tab on HOME Page is present");
    }

}
