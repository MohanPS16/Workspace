package a6_imageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F2_ElementDimensionTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement logo=wd.findElement(By.className("lnXdpd"));
		Dimension d =logo.getSize();
		int height=d.getHeight();
		int width =d.getWidth();
		System.out.println(height);
		System.out.println(width);
		
		
		
		
	}
}
