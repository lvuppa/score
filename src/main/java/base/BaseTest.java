package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static AppiumDriverLocalService service;
    public static AppiumDriver<MobileElement> driver;

    /**
     * Starts the Appium server if it is not already running.
     * @return AppiumDriverLocalService instance representing the started server.
     */
    public static AppiumDriverLocalService startAppiumServer() {

        // Check if the Appium server is already running on port 4723
        boolean flag = checkIfServerIsRunnning(4723);
        if (flag==false) {
            // Build and start the Appium server
            service = AppiumDriverLocalService.buildDefaultService();
//            service.start();
        }
        return service;
    }

    /**
     * Checks if the server is already running on the specified port.
     * @param port The port to check for server running status.
     * @return True if the server is running, otherwise false.
     */
    public static boolean checkIfServerIsRunnning(int port) {
        boolean isServerRunning = false;
        ServerSocket serverSocket;
        try {
            // Attempt to open a server socket on the specified port
            serverSocket = new ServerSocket(port);

            serverSocket.close();
        } catch (IOException e) {
            //If control comes here, then it means that the port is in use
            isServerRunning = true;
        } finally {
            serverSocket = null; // Clear serverSocket reference
        }
        return isServerRunning;
    }

    /**
     * Sets up and configures the Appium driver instance.
     * @return AppiumDriver instance after setup.
     */
    public static AppiumDriver<MobileElement> setup() {
        System.out.println("Inside the setup");
        try {
            // Construct the file path for the APK
            String userCurrDir = System.getProperty("user.dir");
            String appApkFilePath = "/src/main/resources/thescore.apk";
            String emulatorName = "emulator-5554";
            String apkFilePath = userCurrDir + appApkFilePath;

            // Define Appium server URL
            URL url = new URL("http://127.0.0.1:4723/");

            // Configure desired capabilities for the Appium driver
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, emulatorName);
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
            caps.setCapability(MobileCapabilityType.FULL_RESET, true);
            caps.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);
            caps.setCapability(MobileCapabilityType.APP, apkFilePath);

            // Initialize and configure the Appium driver
            driver = new AppiumDriver<>(url, caps);
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            System.out.println("Exit setup");
        } catch (Exception exp) {
            System.out.println("Cause is :" + exp.getCause());
            System.out.println("Message is :" + exp.getMessage());
            exp.printStackTrace();
        }
        return driver;
    }

    /**
     * Stops the Appium server.
     */
    public static void stopAppiumServer() {
        service.stop();
        System.out.println("Server is stopped successfully");

    }

}


