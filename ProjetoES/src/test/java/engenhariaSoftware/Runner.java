package engenhariaSoftware;

import org.junit.runner.RunWith;
//import  io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber", "json:targer/report.json"},
		features = "src/test/resources/",
		monochrome = false,
		dryRun = false,
		strict = false
		)
public class Runner {

}
