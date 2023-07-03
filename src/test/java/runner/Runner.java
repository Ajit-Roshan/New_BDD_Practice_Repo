package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Feature/first.feature"},
		glue = {"src/test/java/steps"} , dryRun = false
		)

public class Runner {

}
