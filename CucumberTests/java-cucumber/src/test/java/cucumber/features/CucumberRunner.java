package cucumber.features;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber" }) //once class has a run, generates a html class at directory in a pretty format
public class CucumberRunner 
{
	
}
