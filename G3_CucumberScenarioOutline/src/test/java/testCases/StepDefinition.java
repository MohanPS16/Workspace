package testCases;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	static int i=1;
	@Given ("open browser as {string}")
	public void openBrowser(String browser){
		System.out.println("Browser opened successfully	"+browser);
		System.out.println();
	}
	@When ("enter url as {string}")
	public void enterUrl(String url){
		System.out.println("enter url success	"+url);
		System.out.println();
	}
	@And ("enter user name as {string}")
		public void enterUserName(String userName){
			System.out.println("enter user name success	"+userName);
			System.out.println();
	}
	@And ("enter password as {string}")
		public void enterPassword(String password){
		System.out.println("enter password successful	"+password);
		System.out.println();
	}
	@When ("click login button")
	public void clickLoginButton(){
		System.out.println("Click login button successful	-"+ i++);
		System.out.println();
	}
	@But ("dont click remember password")
	public void clickRemember(){
		System.out.println("dont click remember password	");
		System.out.println();
	}
	@Then ("validate welcome page as {string}")
	public void welcomePage(String msg){
		System.out.println("validation of welcome page	"+msg);
		System.out.println();
	}
}
