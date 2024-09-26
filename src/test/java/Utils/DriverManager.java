package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class DriverManager {
    public static WebDriver driver;
    public static Properties configProp = new Properties();

    // Private constructor to prevent instantiation
    public DriverManager() {}

    // Getter method for WebDriver instance
    public static WebDriver getDriverInstance() {
        return driver;
    }

    // Getter method for configuration properties
    public static Properties getConfigProperties() {
        return configProp;
    }

    // Method to initialize and return the WebDriver instance based on configuration
    public static WebDriver getDriver() throws IOException {
        if (driver == null) {
            // Load properties file
            FileInputStream configPropfile = new FileInputStream("src/test/resources/config.properties");
            configProp.load(configPropfile);

            String browser = configProp.getProperty("browser"); // Getting the browser name from config.properties file

            // Launching the browser based on the configuration
            switch (browser.toLowerCase()) {
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", configProp.getProperty("firefoxpath"));
                    driver = new FirefoxDriver();
                    break;

                case "chrome":
                    System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromepath"));
                    driver = new ChromeDriver();
                    break;

                case "ie":
                    System.setProperty("webdriver.ie.driver", configProp.getProperty("iepath"));
                    driver = new InternetExplorerDriver();
                    break;

                default:
                    throw new IllegalStateException("Unexpected browser value: " + browser);
            }

            driver.manage().window().maximize(); // Optional: Maximize the browser window
        }
        return driver;
    }

    // Method to quit the WebDriver instance
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
