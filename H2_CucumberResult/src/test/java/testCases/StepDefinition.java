package testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
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
	@After
	public void tearDown(Scenario s) throws IOException{
		System.out.println("s.isFailed()           -"+s.isFailed());
		System.out.println("s.getId()              -"+s.getId());
		System.out.println("s.getName()            -"+s.getName());
		System.out.println("s.getLine()            -"+s.getLine());
		System.out.println("s.getSocurceTagNames() -"+s.getSourceTagNames());
		System.out.println("s.getStatus            -"+s.getStatus());
		System.out.println("s.getUri               -"+s.getUri());
		
		String fileLocation="C:\\Users\\Rohini\\Desktop\\Workspace\\batch251\\H2_CucumberResult\\screenshot";
		if(s.isFailed()){
			System.out.println("Test case is failed");
			File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(fileLocation+"\\"+s.getStatus()+"-"+s.getId()+".png"));
			//another
			byte[] byteSrc=((TakesScreenshot)wd).getScreenshotAs(OutputType.BYTES);
			s.attach(byteSrc, "image/png", s.getId().toString());
			
			} else {
		
				System.out.println("Test case passed");
				File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(src, new File(fileLocation+"\\"+s.getStatus()+"-"+s.getId()+".png"));		}
		
			//another
			byte[] byteSrc=((TakesScreenshot)wd).getScreenshotAs(OutputType.BYTES);
			s.attach(byteSrc, "image/png", s.getId().toString());
			
		}


	}
	



