package a3_elementTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C7_GetAttributeTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		WebElement element= wd.findElement(By.name("q"));
		element.sendKeys("Chennai");
		Thread.sleep(2000);
		
		String data=element.getAttribute("value");
		System.out.println(data);
		
	}
}
