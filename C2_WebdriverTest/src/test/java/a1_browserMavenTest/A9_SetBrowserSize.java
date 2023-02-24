package a1_browserMavenTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A9_SetBrowserSize {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		Thread.sleep(2000);
		//height and width needed- Dimension
		Dimension dimension =new Dimension(1000, 3000);//set the height and width
		wd.manage().window().setSize(dimension);
		Thread.sleep(1000);
		wd.quit();
		
	}
}
