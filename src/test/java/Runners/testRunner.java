package Runners;
import Pages.BasePage;
import Utils.DriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "pretty",
                "html:target/default-html-reports.html",
                "rerun:target/rerun.txt"},
        features="src/test/resources/Features",
        glue="StepDefs",
        dryRun = false,
        tags = "@sanity"
)
public class testRunner {
    @BeforeClass
    public static void setup() throws IOException {
        // Any specific setup logic if needed
        DriverManager.getDriver(); // Ensure the driver is initialized
    }

    @AfterClass
    public static void teardown() {
        DriverManager.quitDriver(); // Clean up after tests
    }
}
