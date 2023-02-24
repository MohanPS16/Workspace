package testCases;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@Checkout",plugin={"pretty","html:reports/sample.html"},monochrome=true)//monochrome keyword is used to get a clear output view in console

public class Runner {
	
}
