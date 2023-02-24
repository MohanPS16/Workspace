package a2_locatorMavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B6_EnterKeyTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		
		//to find elements
		//wd.findElement(); single element - webelement - throw error when element not found
		//wd.findElements();multiple element - List<Webelement> - shows list 0 when elements not found
		WebElement element = wd.findElement(By.id("sb_form_q"));
		element.sendKeys("Chennai");
		element.sendKeys(Keys.ARROW_DOWN.ENTER);
		
		
		
		
	}
}
