package b3_failedTakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_FailureTakeScreenShot {

	WebDriver wd;
	
	@Test
	public void loginTest(){
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.get("http://djangovinoth.pythonanywhere.com/login/");
		wd.findElement(By.id("id_username")).sendKeys("Raghul.ps");
		wd.findElement(By.id("id_password")).sendKeys("shanthip02");
		wd.findElement(By.id("padkfkndvjksndkvln")).submit();		
	}
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
		if (!result.isSuccess()){
			File src= ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			org.openqa.selenium.io.FileHandler.copy(src, new File("C:\\Users\\Rohini\\Desktop\\Workspace\\batch251\\E1_TestNextGenerationTest\\target\\screenshot\\sample.jpg"));
		}
	}
}
