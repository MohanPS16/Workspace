package b6_chromeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J3_HeadLessTest {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--HeadLess");
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		
		wd.get("https://www.google.com/");
		System.out.println(wd.getTitle());
		WebElement input=wd.findElement(By.name("q"));
		input.sendKeys("Chennai");
		input.submit();
		System.out.println(wd.getTitle());
	}
}
