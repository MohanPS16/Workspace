package b6_chromeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J6_Maximised {

	public static void main(String[] args) {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("start-maximized");
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver(options);
		wd.get("https://www.google.com/");
		
	}
}
