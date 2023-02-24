package a9_javaScriptTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H1_JavaScriptHighLight {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement logo=wd.findElement(By.className("lnXdpd"));
		JavascriptExecutor js =(JavascriptExecutor)wd;
		//element.style.boder='5px solid red'
		js.executeScript("arguments[0].style.border='10px solid black'", logo);
	}
}
