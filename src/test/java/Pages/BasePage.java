package Pages;

import Utils.DriverManager;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

    public class BasePage {
        protected static WebDriver driver;
        protected static Logger logger;
        protected static Properties configProp;

        @BeforeClass
        public static void setup() throws IOException {
            // Set up Logging
            logger = Logger.getLogger("nopCommerceSDET");
            PropertyConfigurator.configure("src/test/resources/Log4j.properties");
            logger.setLevel(Level.DEBUG);

            // Load properties file
            configProp = new Properties();
            FileInputStream configPropfile = new FileInputStream("src/test/resources/config.properties");
            configProp.load(configPropfile);

            // Launch browser using DriverManager
            driver = DriverManager.getDriver();

            logger.info("************* Browser Initialized *****************");
        }

        @AfterClass
        public static void teardown() {
            // Close the browser after all tests are complete
            if (driver != null) {
                driver.quit();
                logger.info("************* Browser Closed *****************");
            }
        }
    }
