package a6_imageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F3_GetPoint {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement logo =wd.findElement(By.className("lnXdpd"));
		
		Point point = logo.getLocation();
		int x=point.x;
		int y=point.y;
		System.out.println(x);
		System.out.println(y);
		
}
}
