package a3_elementTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H7_GetAllLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		List<WebElement> links =wd.findElements(By.tagName("a"));
		
//		for (WebElement element : links) {
//			String data=element.getText();
//			System.out.println(data);
//		}
		for (int i=0;i<links.size();i++){
			String data = links.get(i).getText();
			if(!data.isEmpty()){
			System.out.println(data);
		}
		}
	}
	}

