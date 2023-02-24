package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@validCheckout",monochrome=true,features="src\\test\\resources\\featureFile\\sample.feature",glue="testCases")

public class Runner {
	
}
