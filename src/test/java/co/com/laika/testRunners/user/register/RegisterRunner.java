package co.com.laika.testRunners.user.register;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/user/register.feature"},
        glue = {"co/com/laika/stepDefinitions/user/register"},
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        dryRun = false
)
public class RegisterRunner {
}
