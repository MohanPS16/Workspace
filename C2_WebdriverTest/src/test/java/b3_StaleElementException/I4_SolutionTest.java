package b3_StaleElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class I4_SolutionTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement input =wd.findElement(By.name("q"));
		input.sendKeys("Chennai");
		input.submit();
		
		Thread.sleep(2000);
		
		wd.navigate().back();
		wd.navigate().refresh();
		
		WebElement input1 =wd.findElement(By.name("q"));
		input1.sendKeys("Guindy");
		
	}
}
