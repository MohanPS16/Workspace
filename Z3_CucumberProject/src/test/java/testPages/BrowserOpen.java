package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOpen {

	public static void browserOpen(WebDriver driver) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public static void goTo(WebDriver driver, String Url) {
		driver.get(Url);
	}
}
