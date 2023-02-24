package a1_browserMavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_OpenBrowserTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();//Permission for the browser opening
		//ChromeDriver wd= new ChromeDriver();//This opens the browser
		WebDriver wd=new ChromeDriver();//the above line will also opens the browser
		//but webdriver is perferred 
	
	}
}
