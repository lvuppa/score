package basetest;

import base.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Class representing the base test setup and teardown for Android test cases.
 * Extends BaseTest to inherit common test functionalities.
 */
@Slf4j
public class BaseTestAndroid extends BaseTest {

    /**
     * Method executed before each test to set up the App under Test and initialize the driver.
     */
    @BeforeTest(alwaysRun = true)
    public static void setUpApp() {
//        startAppiumServer(); Can be implemented
        setup();
    }

    /**
     * Method executed after each test to perform cleanup and close the app.
     */
    @AfterTest(alwaysRun = true)
    public static void tearDown() {
        log.info("Closing The App");
        driver.quit();
//        stopAppiumServer(); Can be Implemented
    }
}