package testCases;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given ("open browser")
	public void openBrowser(){
		System.out.println("Browser opened successfully");
	}
	@When ("enter url")
	public void enterUrl(){
		System.out.println("enter url success");
	}
	@And ("enter user name")
		public void enterUserName(){
			System.out.println("enter user name success");
		}
	@And ("enter password")
		public void enterPassword(){
		System.out.println("enter password successful");
	}
	@When ("click login button")
	public void clickLoginButton(){
		System.out.println("Click login button successful");
	}
	@But ("dont click remember password")
	public void clickRemember(){
		System.out.println("dont click remember password");
	}
	@Then ("validate welcome page")
	public void welcomePage(){
		System.out.println("validation of welcome page");
	}
}
