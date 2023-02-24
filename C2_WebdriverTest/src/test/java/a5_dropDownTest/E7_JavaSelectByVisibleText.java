package a5_dropDownTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E7_JavaSelectByVisibleText {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("http://djangovinoth.pythonanywhere.com/login/");
		
		WebElement username = wd.findElement(By.id("id_username"));
		username.sendKeys("Raghul.ps");
		WebElement password = wd.findElement(By.id("id_password"));
		password.sendKeys("shanthip02");
		password.submit();
		
		wd.get("http://djangovinoth.pythonanywhere.com/dropdown/");
		WebElement month= wd.findElement(By.name("month1"));
		
//		Select s=new Select(month);
//		s.getOptions();
		
		String monthOption="Aug";
		List<WebElement> options =month.findElements(By.tagName("option"));
		for (int i=0;i<options.size();i++){
			String data=options.get(i).getText();
			
			if(data.equals(monthOption)){
				options.get(i).click();
				break;
				
				
			}
		}
	}
}
