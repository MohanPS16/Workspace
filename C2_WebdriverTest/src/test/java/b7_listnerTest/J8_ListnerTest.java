package b7_listnerTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J8_ListnerTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		
		EventFiringWebDriver efwd=new EventFiringWebDriver(wd);

		MyListner m=new MyListner();
		efwd.register(m);
		
		efwd.get("https://www.google.com/");
		System.out.println(efwd.getTitle());
		WebElement input=efwd.findElement(By.name("q"));
		input.sendKeys("Chennai");
		input.submit();
		System.out.println(efwd.getTitle());
		Thread.sleep(2000);
		efwd.navigate().back();
		System.out.println(efwd.getTitle());
		Thread.sleep(2000);
		efwd.navigate().forward();
		System.out.println(efwd.getTitle());
		Thread.sleep(2000);
		efwd.navigate().back();
		System.out.println(efwd.getTitle());
		Thread.sleep(2000);
		efwd.navigate().forward();
		System.out.println(efwd.getTitle());
		Thread.sleep(2000);
		efwd.navigate().back();
		System.out.println(efwd.getTitle());
		Thread.sleep(2000);
		efwd.navigate().forward();
		System.out.println(efwd.getTitle());
	}
	}

