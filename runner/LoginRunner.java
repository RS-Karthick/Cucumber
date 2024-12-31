package runner;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features= {"src/test/java/features/Login.feature"},
dryRun = true,
glue = "stepDefinition",
snippets =io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE,
monochrome = true
)
public class LoginRunner extends AbstractTestNGCucumberTests {

}
