package utils;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Class providing methods to generate random strings.
 */
public class RandomHelper {

    /**
     * Generates a random alphanumeric string of the specified length.
     * @param length The length of the generated string.
     * @return A random alphanumeric string.
     */
    public String getRandomAlphanumericString(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }

    /**
     * Generates a random numeric string of the specified length.
     * @param length The length of the generated string.
     * @return A random numeric string.
     */
    public String getRandomNumberAsString(int length) {
        return RandomStringUtils.randomNumeric(length);
    }

    /**
     * Generates a random alphabetic string of the specified length.
     * @param length The length of the generated string.
     * @return A random alphabetic string.
     */
    public String getRandomAlphabeticString(int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }
}
