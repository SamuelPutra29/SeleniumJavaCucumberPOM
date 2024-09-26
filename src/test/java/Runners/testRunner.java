package Runners;
import StepDefs.BaseClass;
import cucumber.api.java.Before;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

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
}
