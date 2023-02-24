package b6_chromeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J4_DisablePopUp {

	public static void main(String[] args) {
	ChromeOptions options =new ChromeOptions();
	options.addArguments("--disable-notifications");
	

	WebDriverManager.chromedriver().setup();
	WebDriver wd = new ChromeDriver(options);
	wd.get("https://www.justdial.com/");
}
}