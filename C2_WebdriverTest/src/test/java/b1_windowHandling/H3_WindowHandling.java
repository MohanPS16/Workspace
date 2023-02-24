package b1_windowHandling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H3_WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://www.flipkart.com/");
		Thread.sleep(1500);
		WebElement close=wd.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		close.click();
		Thread.sleep(1000);
		WebElement element=wd.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		element.sendKeys("Samsung mobile");
		element.submit();
		Thread.sleep(5000);
		List<WebElement> link=wd.findElements(By.className("_4rR01T"));
		String data=link.get(0).getText();
		System.out.println(data);
		link.get(0).click();
		//child window
		//linked hashset
		
			Set<String> session= wd.getWindowHandles();
			Iterator<String> it=session.iterator();
	//		while(it.hasNext()){
	//			System.out.println(it.next());
	//		}
			String parentID=it.next();
			String childID=it.next();
			wd.switchTo().window(childID);
		
		WebElement details= wd.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/h1/span"));
		String data1= details.getText();
		System.out.println(data1);
		wd.switchTo().window(parentID);
		wd.findElement(By.name("q")).clear();
		wd.findElement(By.name("q")).sendKeys("iphone");
	}
	
}
