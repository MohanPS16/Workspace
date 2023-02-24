package a1_browserMavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A4_TitleTest {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 WebDriver wd= new ChromeDriver();
		 wd.manage().window().maximize();
		 wd.get("https://www.google.com/");
		 
		 String title=wd.getTitle();
		 System.out.println(title);
	}
}
