 package b6_chromeTest;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J5_DisableInfoBar {

	public static void main(String[] args) {
		ChromeOptions options =new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));  
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.get("https://www.justdial.com/");
	}
}
