package a1_browserMavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		Thread.sleep(10000);
		wd.manage().window().minimize();
		Thread.sleep(1500);
		wd.manage().window().maximize();
		wd.get("https://www.netflix.com/browse");
	}
}
