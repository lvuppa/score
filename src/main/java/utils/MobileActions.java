package utils;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;


/**
 * Class containing common mobile actions to interact with elements.
 * Extends MobilePageWait to handle mobile-specific page interactions.
 */
@Slf4j
public class MobileActions extends MobilePageWait {

    /**
     * Clicks the element identified by the given locator.
     * @param by The locator of the element to click.
     */
    public static void clickElementBy(By by) {
        tryFindElement(by).click();
    }

    /**
     * Clears the input field identified by the given locator and fills it with the specified text.
     * @param by The locator of the input field.
     * @param text The text to fill in the input field.
     */
    public static void clearAndFillInFieldWith(By by, String text) {
        tryFindElement(by).clear();
        tryFindElement(by).sendKeys(text);
    }

    /**
     * Tries to find the web element identified by the given locator.
     * @param by The locator of the element to find.
     * @return The found web element.
     */
    public static WebElement tryFindElement(By by) {
        WebElement element = (WebElement) getFluentWait().until(ExpectedConditions.presenceOfElementLocated(by));
        return element;
    }

    /**
     * Finds the web element identified by the given locator.
     * @param by The locator of the element to find.
     * @return The found web element.
     */
    public static WebElement findElement(By by) {
        WebElement element = (WebElement) getFluentWait().until(ExpectedConditions.presenceOfElementLocated(by));
        return element;
    }

    /**
     * Gets the text from the element identified by the given locator.
     * @param by The locator of the element.
     * @return The text content of the element.
     */
    public static String getTextFromElement(By by) {
        return tryFindElement(by).getText().trim();
    }

    /**
     * Gets the number of results for the element identified by the given locator.
     * @param by The locator of the element.
     * @return The number of results found for the element.
     */
    public static int getNumberOfResultsForElement(By by) {
        return driver.findElements(by).size();
    }

    /**
     * Checks if the element identified by the given locator is displayed.
     * @param by The locator of the element.
     * @return True if the element is displayed, otherwise false.
     */
    public static boolean isElementDisplayed(By by) {
        return driver.findElement(by).isDisplayed();
    }

    /**
     * Checks if the element identified by the given locator is enabled.
     * @param by The locator of the element.
     * @return True if the element is enabled, otherwise false.
     */
    public static boolean isElementEnabled(By by) {
        return driver.findElement(by).isEnabled();
    }

    /**
     * Checks if the element identified by the given locator is selected.
     * @param by The locator of the element.
     * @return True if the element is selected, otherwise false.
     */
    public static boolean isElementSelected(By by) {
        return driver.findElement(by).isSelected();
    }

    /**
     * Scrolls to the element identified by the given locator in the specified direction.
     * @param by The locator of the element to scroll to.
     * @param scrollDirection The direction to scroll ('up' or 'down').
     */
    public static void scrollToElement(By by, String scrollDirection) {
        try {
            log.info("Inside the Scroll actual func");
            // Find the element by ID
            WebElement element = driver.findElement(by);

            // Scroll the page until the element is in view based on scrollDirection
            switch (scrollDirection.toLowerCase()) {
                case "up":
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                    break;
                case "down":
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid scroll direction. Please use 'up' or 'down'.");
            }
        } catch (Exception e) {
            // If the element is not found, scroll the page in the specified direction
            switch (scrollDirection.toLowerCase()) {
                case "up":
                    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -500);");
                    break;
                case "down":
                    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
                    break;
                default:
                    throw new IllegalArgumentException("Invalid scroll direction. Please use 'up' or 'down'.");
            }
            scrollToElement(by, scrollDirection); // Recursive call to keep scrolling until element is found
        }
    }
}

