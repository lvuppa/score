package pages.OnBoarding;

import org.openqa.selenium.By;

/**
 * Locator class containing static final By objects for elements on the OnBoarding Page.
 * These locators are used to identify various elements on the OnBoarding Page.
 */
public class OnBoardingScreenLocator {
    protected static final By WELCOME_TEXT = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_welcome\"]");
    protected static final By HAVE_AN_ACCOUNT_LOG_IN = By.id("com.fivemobile.thescore:id/txt_sign_in");
    protected static final By GET_STARTED_BTN = By.id("com.fivemobile.thescore:id/btn_primary");
    protected static final By CHOOSE_LEAGUE = By.id("com.fivemobile.thescore:id/title_onboarding");
    protected static final By CONTINUE_BTN = By.id("com.fivemobile.thescore:id/btn_primary");
    protected static final By ALLOW_LOCATION_BTN = By.xpath("//android.widget.TextView[@text=\"Allow Location\"]");
    protected static final By MAY_BE_LATER_BTN = By.xpath("//android.widget.TextView[@text=\"Maybe Later\"]");
    protected static final By CHOOSE_YOUR_FAV_TEAM = By.xpath("//android.widget.TextView[@text=\"Choose your favorite teams\"]");
    protected static final By CHOOSE_YOUR_FAV_TEAM_DESCRIPTION = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/subtitle_onboarding\"]");
    protected static final By SEARCH_BAR = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/search_bar_placeholder\"]");
    protected static final By RECOMMENDED_LIST = By.xpath("//android.widget.LinearLayout[@content-desc=\"Recommended\"]");
    protected static final By RECOMMENDED_LIST_PRE_SELECTED = By.xpath("//android.widget.LinearLayout[@content-desc=\"Recommended\" and @clickable=\"false\"]");
    protected static final By NBA_LIST = By.xpath("//android.widget.LinearLayout[@content-desc=\"NBA\"]");
    protected static final By NBA_LIST_CAN_BE_SELECTED = By.xpath("//android.widget.LinearLayout[@content-desc=\"NBA\" and @clickable=\"true\"]");
    protected static final By NFL_LIST = By.xpath("//android.widget.LinearLayout[@content-desc=\"NFL\"]");
    protected static final By NFL_LIST_CAN_BE_SELECTED = By.xpath("//android.widget.LinearLayout[@content-desc=\"NLF\" and @clickable=\"true\"]");
    public static final By FAV_TEAM_NAME = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_name\" and @text=\"Dallas Cowboys\"]");

//    public static final By FAV_TEAM_NAME = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_name\" and @text=\"${teamName}\"]");
    public static final By BREAKING_NEWS_TOGGLE = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/name\" and @text=\"Breaking News\"]");
    public static final By GAME_START_TOGGLE = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/name\" and @text=\"Game Start\"]");
    public static final By GAME_END_TOGGLE = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/name\" and @text=\"Game End\"]");
    public static final By SCORING_UPDATES_TOGGLE = By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/name\" and @text=\"Scoring Updates\"]");
    public static final By DONE_BTN = By.xpath("//android.widget.TextView[@text=\"Done\"]");
    public static final By EMAIL_SIGNUP_BTN = By.xpath("//android.widget.TextView[@text=\"Email Sign Up\"]");
    public static final By ALLOW_NOTIFICATION_PERMISSION_POPUP_TEXT = By.xpath("//android.widget.TextView[@text=\"Allow theScore to send you notifications?\"]");
    public static final By ACCEPT_ALLOW_NOTIFICATION_PERMISSION = By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]");
    public static final By DENY_ALLOW_NOTIFICATION_PERMISSION = By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]");
//    public static final By HOME_PAGE_NEWS_TAB_BOTTOM = By.xpath("//android.widget.FrameLayout[@content-desc=\"News\"]");




}
