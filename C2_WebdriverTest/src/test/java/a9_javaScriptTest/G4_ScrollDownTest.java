package a9_javaScriptTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G4_ScrollDownTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		
		WebElement element = wd.findElement(By.id("sb_form_q"));
		element.sendKeys("Chennai");
		element.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		//((JavascriptExecutor)wd).executeScript(key, args) 
		JavascriptExecutor js=(JavascriptExecutor)wd;
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -1000)");//reverse scroll
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -1000)");
	}
}
