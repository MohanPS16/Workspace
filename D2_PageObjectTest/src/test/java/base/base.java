package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {

	public static WebDriver openBrowser(){
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		return wd;
	}
	public static void loadUrl(WebDriver wd, String url){
		wd.get(url);
	}
}
