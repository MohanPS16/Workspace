package a9_javaScriptTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G6_JavaScriptType {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		WebElement input = wd.findElement(By.id("sb_form_q"));
		
		//input.sendKeys("chennai");
		JavascriptExecutor js =(JavascriptExecutor)wd;
		js.executeScript("arguments[0].value='chennai'", input);
		
	}
}
