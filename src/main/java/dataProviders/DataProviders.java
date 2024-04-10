package dataProviders;

import org.testng.annotations.DataProvider;

/**
 * Utility class providing data providers for test cases.
 */
public class DataProviders {

    /**
     * Provides test data for team names.
     * @return 2D array of team names.
     */
    @DataProvider(name = "teamNames")
    public static Object[][] teamData() {
        return new Object[][] {
                {"Dallas Cowboys"} // Team name example
        };
    }

    /**
     * Provides test data for league names.
     * @return 2D array of league names.
     */
    @DataProvider(name = "leagueNames")
    public static Object[][] leagueData() {
        return new Object[][] {
                {"NBA"},         // League name examples
                {"NFL"},
                {"PGA Tour"}
        };
    }

    /**
     * Provides test data for player names.
     * @return 2D array of player names.
     */
    @DataProvider(name = "playerNames")
    public static Object[][] playerData() {
        return new Object[][] {
                {"Lionel Messi"} // Player name example
        };
    }
}
