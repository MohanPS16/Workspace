package a2_locatorMavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B8_AbsolutePathTest {

public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver wd=new ChromeDriver();
	wd.manage().window().maximize();
	wd.get("https://www.amazon.in/");
	
	//to find elements
	//wd.findElement(); single element - webelement - throw error when element not found
	//wd.findElements();multiple element - List<Webelement> - shows list 0 when elements not found
	// to find xpath - inspect- find path
	
	
	WebElement element = wd.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
	element.sendKeys("Samsung");
	
}
}
