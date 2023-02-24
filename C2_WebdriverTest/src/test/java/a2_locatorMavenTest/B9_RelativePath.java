package a2_locatorMavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B9_RelativePath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.amazon.in/");
		
		//to find elements
		//wd.findElement(); single element - webelement - throw error when element not found
		//wd.findElements();multiple element - List<Webelement> - shows list 0 when elements not found
		// to find xpath - inspect- find path
		
		
		WebElement element = wd.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		element.sendKeys("Samsung");
		element.submit();
	}
}
