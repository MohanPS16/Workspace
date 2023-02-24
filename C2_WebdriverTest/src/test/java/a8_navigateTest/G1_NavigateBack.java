package a8_navigateTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G1_NavigateBack {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://www.google.com/");
		WebElement input=wd.findElement(By.name("q"));
		input.sendKeys("Chennai");
		input.submit();
		wd.navigate().back();
	}
}