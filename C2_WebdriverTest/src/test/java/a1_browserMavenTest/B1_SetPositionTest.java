package a1_browserMavenTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B1_SetPositionTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		Thread.sleep(2000);
		//height and width needed- Dimension
		Dimension dimension =new Dimension(1000, 3000);//set the height and width
		wd.manage().window().setSize(dimension);
		Thread.sleep(2000);
		
		//x, y - Point
		
		Point point = new Point(200, 300);
		wd.manage().window().setPosition(point);
	}
}
