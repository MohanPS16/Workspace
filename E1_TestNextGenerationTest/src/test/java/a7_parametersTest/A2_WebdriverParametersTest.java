package a7_parametersTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A2_WebdriverParametersTest {
	
	WebDriver wd;
	@Parameters({"BROWSER","URL","USERNAME","PASSWORD"})
	@Test
	public void loginTest(String browser ,String url ,String username, String password){
		if(browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			wd= new ChromeDriver();
		}
		wd.get(url);
		wd.findElement(By.id("id_username")).sendKeys(username);
		wd.findElement(By.id("id_password")).sendKeys(password);
		wd.findElement(By.id("id_password")).submit();
	}
}
