package a9_javaScriptTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement logo=wd.findElement(By.className("lnXdpd"));
		JavascriptExecutor js =(JavascriptExecutor)wd;
		//element.style.boder='5px solid red'
		for(int i=0;i<100;i++){
		js.executeScript("arguments[0].style.border='10px solid black'", logo);
		Thread.sleep(100);
		js.executeScript("arguments[0].style.border='10px solid white'", logo);
		}	
	}
}
