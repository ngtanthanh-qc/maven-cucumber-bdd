package cucumberOptions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinitions",
        monochrome = true,
        plugin = {"pretty", "html:target/site/cucumber-report-default"},
        tags = "@feaA_scn01 or @feaB"
)
public class TestRunner {
}
