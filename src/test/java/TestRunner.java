import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;






@CucumberOptions(features = "src/test/java/features",glue = "stepdefinitions",plugin = "pretty")






public class TestRunner extends AbstractTestNGCucumberTests {
}
