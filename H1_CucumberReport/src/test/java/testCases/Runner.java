package testCases;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@amazon",plugin={"pretty","html:report/sample.html", "junit:report/sample.xml","json:report/sample.json"})
public class Runner {

}
