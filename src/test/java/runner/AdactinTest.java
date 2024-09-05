package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src\\test\\java\\features\\adactin.feature",
			glue = {"stepDef","hooks","base"},
			dryRun = !true,
			snippets = SnippetType.CAMELCASE
		)
public class AdactinTest {

}
