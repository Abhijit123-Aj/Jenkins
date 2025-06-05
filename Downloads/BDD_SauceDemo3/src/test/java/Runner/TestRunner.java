package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features1",
    glue = "stepDefinitions",
    plugin = {"pretty", "html:target/cucumber-html-report"},
    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
