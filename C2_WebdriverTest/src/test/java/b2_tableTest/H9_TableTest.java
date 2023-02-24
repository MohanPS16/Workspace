package b2_tableTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H9_TableTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = wd.findElement(By.id("customers"));
		List<WebElement> row= table.findElements(By.tagName("tr"));
		for (int i=0; i<row.size();i++){
		List<WebElement> col = row.get(i).findElements(By.tagName("td"));
		for (int j=0; j<col.size();j++){
			String data=col.get(j).getText();
			System.out.print(data+"		");
		}
		System.out.println();
		}	
	}
}
