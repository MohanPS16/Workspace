package testCases;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\testCases\\sample.feature",
glue="testCases",
monochrome=true)


public class Runner {
	
}
