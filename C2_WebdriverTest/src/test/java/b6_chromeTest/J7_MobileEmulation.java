package b6_chromeTest;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J7_MobileEmulation {

	public static void main(String[] args) throws InterruptedException {
		
		Map<String, String> mobileEmulation = new HashMap();
		mobileEmulation.put("deviceName", "Nexus 5");

		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("mobileEmulation", mobileEmulation);
			
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		
		wd.get("https://www.google.com/");
		System.out.println(wd.getTitle());
		WebElement input=wd.findElement(By.name("q"));
		input.sendKeys("Chennai");
		input.submit();
		System.out.println(wd.getTitle());
		Thread.sleep(2000);
		wd.navigate().back();
		System.out.println(wd.getTitle());
		Thread.sleep(2000);
		wd.navigate().forward();
		System.out.println(wd.getTitle());
		Thread.sleep(2000);
		wd.navigate().back();
		System.out.println(wd.getTitle());
		Thread.sleep(2000);
		wd.navigate().forward();
		System.out.println(wd.getTitle());
		Thread.sleep(2000);
		wd.navigate().back();
		System.out.println(wd.getTitle());
		Thread.sleep(2000);
		wd.navigate().forward();
		System.out.println(wd.getTitle());
	}
}
