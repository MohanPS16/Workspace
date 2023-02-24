package a2_locatorMavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C1_LinkTextTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement link =wd.findElement(By.linkText("Gmail"));
		link.click();
		WebElement we=wd.findElement(By.linkText("Sign in"));
		we.click();
		
	}
}
