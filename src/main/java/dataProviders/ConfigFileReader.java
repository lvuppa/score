package dataProviders;

import java.util.Properties;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Utility class to read properties from a configuration file.
 */
public class ConfigFileReader {

    private Properties properties;
    private final String propertyFilePath = "src/main/java/configs/Configuration.properties";

    /**
     * Constructor to initialize the ConfigFileReader object.
     * Reads properties from the specified configuration file.
     */
    public ConfigFileReader() {
        BufferedReader reader;
        try {
            // Open the configuration file for reading
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                // Load properties from the configuration file
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            // Throw a runtime exception if the configuration file is not found
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    /**
     * Retrieves the username from the configuration file.
     * @return The username as specified in the configuration file.
     * @throws RuntimeException If username is not specified in the configuration file.
     */
    public String getUserName() {
        String username = properties.getProperty("userName");
        if(username != null)
            return username;
        else
            // Throw a runtime exception if username is not specified in the configuration file
            throw new RuntimeException("userName not specified in the Configuration.properties file.");
    }

    /**
     * Retrieves the password from the configuration file.
     * @return The password as specified in the configuration file.
     * @throws RuntimeException If password is not specified in the configuration file.
     */
    public String getPassword() {
        String password = properties.getProperty("password");
        if(password != null)
            return password;
        else
            // Throw a runtime exception if password is not specified in the configuration file
            throw new RuntimeException("password not specified in the Configuration.properties file.");
    }

}
