package StepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"StepDefinition"},
    plugin = {
        "pretty",
        "html:target/HTML/htmlreport.html",
        "json:target/JSON/jsonreport.json",
        "junit:target/JUNIT/junitreport.xml"
    },
    monochrome = true
)
public class TestRunner {
}
