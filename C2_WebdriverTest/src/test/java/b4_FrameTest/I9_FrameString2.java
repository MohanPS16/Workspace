package b4_FrameTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class I9_FrameString2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		
		wd.get("https://jqueryui.com/tooltip/");
		wd.manage().window().maximize();
		
		//id, name, class(50%)
		List<WebElement> frame=wd.findElements(By.tagName("iframe"));
		System.out.println("Total frame"+frame.size());
		
		wd.switchTo().frame(0);
		WebElement input=wd.findElement(By.id("age"));
		input.sendKeys("5");
		Thread.sleep(2000);
		wd.switchTo().defaultContent();
		wd.findElement(By.linkText("API Documentation")).click();		
	}
}
