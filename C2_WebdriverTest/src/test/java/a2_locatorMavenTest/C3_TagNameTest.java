package a2_locatorMavenTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C3_TagNameTest {


	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		
		//wd.findElements(By.tagName("input"));
		List<WebElement> links=wd.findElements(By.tagName("a"));
		System.out.println("Total links - "+links.size());
}

}