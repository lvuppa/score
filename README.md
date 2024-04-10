# theScore Mobile Automation Appium Framework

This framework provides a simple approach to automate mobile native apps using Appium.

## Automation Setup Guidelines:

- Ensure that Maven, Java (version 1.8), and Appium server are installed on your system.
- Clone the GitHub repository into your preferred IDE (IntelliJ is recommended).
- Verify that the Lombok plugin is installed in your IDE.
- Note: This repository does include Android (.apk) but NOT iOS (.ipa/.app) files. You need to use your own executable file for iOS.
- Set the path for your APK file in `src/main/java/base/BaseTest.java` within the `setup()` method under `String appApkFilePath`.
- Similarly, provide your emulator name in `src/main/java/base/BaseTest.java` within the `setup()` method under `String emulatorName`.
- Basic command to run tests: Open terminal, navigate to the project directory, and run the command: `mvn clean install`.
- After the test build, generate the Allure report by running the following command in the terminal: `allure serve allure-results`. This command will generate the Allure report and launch it in the system's default browser.
- Note: This framework runs only on macOS. It has not been prepared for Windows, but with a few changes in file paths, etc., it is possible.

## Key Features of the Framework:

- Page Object Model (POM)
- Java programming language
- Maven for build management
- Appium for native mobile app automation
- Allure Reports for clean and informative automation reports
- Lombok plugin for simplified logging
- Automatic start and stop of the Appium server instance

## Reasons for Choosing the Page Object Model (POM) Framework:

- Segregation of tests and element locators for clean and maintainable code.
- Enhances test automation framework durability, comprehensiveness, and programmer-friendliness.
- Independence of Page Object Repository from automation tests facilitates integration with other frameworks.
- Enables code reUsability, short and optimized test cases, and easy implementation of UI changes.

## Advantages of the POM Framework:

- Explained above, the POM approach offers several advantages. However, it also has some disadvantages:
- Requires significant effort and time for developing automation frameworks for applications with numerous web pages.
- Maintenance overhead increases with large classes, violating Object-Oriented Design principles.
- Testers need a high level of programming knowledge for developing POM frameworks for multiple pages.
- POM is not a generic model and is specific to applications.

## Best Coding Practices Followed:

- KISS (Keep it simple, stupid)
- DRY (Don't repeat yourself) by providing reusable functions
- Static methods
- YAGNI (You ain't gonna need it)
- Object-Oriented Programming (OOPS) concepts

## Tips for Ensuring Code Maintainability:

- In the POM framework, code is easy to understand for everyone, facilitating contributions without extensive understanding.
- Use meaningful package names for easy navigation and usage.
- Incorporate comments wherever necessary for clarity.
- Utilize descriptive variable, method, and class names.
- Apply design patterns where applicable.

# Steps to run the tests in your LOCAL machine.

- Tools:
  - Appium Server: 2.0.1
  - Java: openjdk 18.0.1
  - Apache Maven: 3.8.5
  - Node: 21.7.2
  - npm: 10.5.0
  - Android Studio: Latest
- Open Terminal and set the below Global Variables:
  - export ANDROID_HOME=/Users/{userName}/Library/Android/sdk
  - export PATH=${PATH}:/$ANDROID_HOME/platform-tools:/$ANDROID_HOME/tools:/$ANDROID_HOME/tools/bin
  - export JAVA_HOME="`/usr/libexec/java_home -v 1.8`"
  - export PATH=${PATH}:$JAVA_HOME/bin:$JAVA_HOME/Home/bin
  - export NODE_HOME=/opt/homebrew/bin/node
  - export APPIUM_HOME=/Users/{userName}/node_modules/appium/lib
  - export PATH=$PATH:/usr/local/bin
- Open the terminal, navigate to the intended folder and Clone this repo into your local.
- Navigate to the above directory.
- Install the latest Appium server and start it (IP: 127.0.0.1 and PORT: 4723)
- make sure the Appium server is running.
- Start Android studio and create an emulator.
- Run adb devices cmd in terminal window. Provide your emulator name in `src/main/java/base/BaseTest.java` within the `setup()` method under `String emulatorName`.
- Basic command to run tests: Open terminal, navigate to the project directory, and run the command: `mvn clean install`.
- After the test build, generate the Allure report by running the following command in the terminal: `allure serve allure-results`. This command will generate the Allure report and launch it in the system's default browser.