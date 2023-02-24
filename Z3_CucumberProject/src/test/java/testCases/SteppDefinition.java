package testCases;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testPages.BrowserOpen;
import testPages.CheckoutPage;
import testPages.LoginPage;

public class SteppDefinition {
	WebDriver driver;
	@Given("Open browser")
	public void openBrowser() throws InterruptedException {
		BrowserOpen.browserOpen(driver);
	}
	@When("go to url as {string}")
	public void goToUrl(String url) {
		BrowserOpen.goTo(driver, url);
	}
	@And("enter username as {string}")
	public void enterName(String username) {
		LoginPage.enterUsername(driver, username);
	}
	@Then("enter password as {string}")
	public void enterPassword(String password) {
		LoginPage.enterPassword(driver, password);
	}
	@Then("go to input page")
	public void goToInputPage() {
		CheckoutPage.goToUrl(driver);
	}
	@And("type simple inputs")
	public void inputKeys() {
		CheckoutPage.inputTypes(driver);
	}
	@Then("logout from the web application")
	public void clickLogout() {
		CheckoutPage.logout(driver);
	}
}
