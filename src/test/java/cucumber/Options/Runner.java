package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\features\\E2E.feature",
plugin="json:target/jsonReports/cucumber-report.json",
glue= "stepdef",
dryRun=false)
public class Runner 
{

}
