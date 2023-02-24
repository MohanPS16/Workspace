package browserStack;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
public class A2_BrowserStack {
	public static final String USERNAME = "mohanps_87EvaN";
	public static final String AUTOMATE_KEY = "CTtPHJN7MS5qgf9hZEyd";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";


	public static void main(String[] args) throws MalformedURLException {
		MutableCapabilities capabilities = new MutableCapabilities();
		capabilities.setCapability("browserName", "Safari");
		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		browserstackOptions.put("os", "OS X");
		browserstackOptions.put("osVersion", "Big Sur");
		browserstackOptions.put("browserVersion", "14.0");
		browserstackOptions.put("local", "false");
//		browserstackOptions.put("seleniumVersion", "3.14.0");
		capabilities.setCapability("bstack:options", browserstackOptions);
		capabilities.setCapability("name", "my first for google");	
		//WebDriver wd=new ChromeDriver();
		WebDriver wd=new RemoteWebDriver(new URL(URL), capabilities);
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		System.out.println(wd.getTitle());
		wd.findElement(By.name("q")).sendKeys("chennai");
		wd.findElement(By.name("q")).submit();
		System.out.println(wd.getTitle());
		wd.navigate().back();
		System.out.println(wd.getTitle());
		wd.quit();
	}
}
