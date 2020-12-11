package Step_definition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"Step_definition"},
monochrome=true,
publish = true,
plugin = { "pretty", "json:target/Reports/Cucumber.json",
		"junit:target/Reports/Cucumber.xml", "html:target/Reports/Cucumber.html"})
//to attach a particular test scenario to be displayed in the result, use tags "@"
public class TestRunner {

}
