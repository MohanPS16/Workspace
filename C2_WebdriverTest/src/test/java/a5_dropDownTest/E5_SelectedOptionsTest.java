package a5_dropDownTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E5_SelectedOptionsTest {

	public static void main(String[] args) throws InterruptedException {
		
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
		WebElement month= wd.findElement(By.name("days"));
		Select s=new Select(month);
		
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByIndex(5);
		Thread.sleep(1000);
		List<WebElement> options =s.getAllSelectedOptions();
		System.out.println("Selected options count = "+options.size());
		
		for (int i=0;i<options.size();i++){
			String data = options.get(i).getText();
			System.out.println(data);
		}
		
	}
}
