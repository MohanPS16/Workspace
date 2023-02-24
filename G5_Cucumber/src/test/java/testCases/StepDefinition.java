package testCases;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public WebDriver wd;
	
	@Given ("open browser as {string}")
	public void openBrowser(String browser){
		if(browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			wd=new ChromeDriver();
		}else{
			WebDriverManager.firefoxdriver().setup();
			wd=new FirefoxDriver();
		}
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@When ("enter url as {string}")
	public void enterUrl(String url){
		wd.get(url);
	}
	@And ("enter user name as {string}")
		public void enterUserName(String userName){
		wd.findElement(By.id("id_username")).sendKeys(userName);
		}
	@And ("enter password as {string}")
		public void enterPassword(String password){
		wd.findElement(By.id("id_password")).sendKeys(password);
	}
	@When ("click login button")
	public void clickLoginButton(){
		wd.findElement(By.id("id_password")).submit();
	}
	@But ("dont click remember password")
	public void clickRemember(){
		System.out.println("dont click remember password");
	}
	@Then ("validate welcome page as {string}")
	public void welcomePage(String msg){
		String data=wd.findElement(By.xpath("/html/body/header/nav/div/div/div[2]/a[2]")).getText();
		Assert.assertEquals(msg, data);
	}
	@When ("click logout")
	public void logOut(){
	wd.findElement(By.linkText("Logout")).click();
}
}