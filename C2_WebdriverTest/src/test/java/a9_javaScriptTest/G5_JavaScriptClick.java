package a9_javaScriptTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G5_JavaScriptClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement gmail= wd.findElement(By.linkText("Gmail"));
		
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeAsyncScript("arguments [0].click()", gmail);
	//	js.executeScript("arguments[1].click()",gmail,images);
	}
}
