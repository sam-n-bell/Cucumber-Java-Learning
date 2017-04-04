package cucumber.scripts;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "json:target/"}, //once class has a run, gen a json class at directory in a pretty format
		features = {"src/test/java/"}
		)
public class CucumberRunner 
{
	
}
