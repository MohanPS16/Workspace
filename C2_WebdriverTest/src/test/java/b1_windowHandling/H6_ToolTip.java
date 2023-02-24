package b1_windowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H6_ToolTip {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://djangovinoth.pythonanywhere.com/tooltip/");
//		Actions moveToElement()
		WebElement input= wd.findElement(By.id("age"));
		String data = input.getAttribute("title");
		System.out.println(data);
	} 
}
