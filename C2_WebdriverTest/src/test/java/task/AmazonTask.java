package task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTask {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.amazon.in/gp/bestsellers/books/ref=zg_bs_nav_0");
		
		List<WebElement> link=wd.findElements(By.xpath(".//span[text()='Paperback']/preceding::div[3]"));
		
		for(int i=0;i<link.size();i++){
			String a=link.get(i).getText();
			System.out.println(a);		
		}
	}	
}

