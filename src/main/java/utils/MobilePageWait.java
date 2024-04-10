package utils;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import base.BaseTest;
import java.time.Duration;

/**
 * Class providing utility methods for waiting for elements on mobile pages.
 * Extends BaseTest to access the driver instance.
 */
@Slf4j
public class MobilePageWait extends BaseTest {

    /**
     * The interval for fluent wait in seconds.
     */
    private static Integer fluentWaitInterval = 60;

    /**
     * Retrieves a fluent wait instance with specified timeout and polling interval.
     * @return FluentWait instance configured with timeout and polling interval.
     */
    public static Wait getFluentWait() {
        FluentWait fluentWait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(fluentWaitInterval))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
        return fluentWait;
    }

    /**
     * Waits until the element identified by the given locator is present in the DOM.
     * @param by The locator of the element to wait for.
     * @return True if the element is present within the specified timeout, otherwise false.
     */
    public static boolean waitUntilElementIsPresent(By by) {
        try {
            getFluentWait().until(ExpectedConditions.presenceOfElementLocated(by));
        } catch (TimeoutException e) {
            return false;
        }
        return true;
    }

    /**
     * Waits until the element identified by the given locator is clickable.
     * @param by The locator of the element to wait for.
     * @return True if the element is clickable within the specified timeout, otherwise false.
     */
    public static boolean waitUntilElementClickable(By by) {
        try {
            getFluentWait().until(ExpectedConditions.elementToBeClickable(by));
        } catch (TimeoutException e) {
            return false;
        }
        return true;
    }
}
